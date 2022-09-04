package com.chakarapani.base.Response;

import com.chakarapani.base.Enums.Message;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unused")
public class Response {
    @Contract("_, _, _, _ -> new")
    public static @NotNull ResponseEntity<Object> generateResponse(Message message, @NotNull Map<String, String> headers, HttpStatus status, Object data) {
        Map<String, Object> map = new HashMap<>();
        String corrId = headers.get("x-correlation-id");
        String FORMAT = "dd-MMMM-yyyy hh:mm:ss a";
        String COUNTRY = "Singapore";

        map.put("x-correlation-id", corrId);
        map.put("timestamp", LocalDateTime.now(ZoneId.of(COUNTRY)).format(DateTimeFormatter.ofPattern(FORMAT)));
        map.put("message", message.getMessage());
        map.put("status", status);
        map.put("status_code", status.value());
        map.put("data", data);

        return new ResponseEntity<>(map, status);
    }
}