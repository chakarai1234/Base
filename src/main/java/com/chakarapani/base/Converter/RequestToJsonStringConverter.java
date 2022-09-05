package com.chakarapani.base.Converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;


@Component
@SuppressWarnings("unused")
public class RequestToJsonStringConverter {

    // Declare the object mapper field
    private final ObjectMapper objectMapper;

    // Declare the rest template field
    private final RestTemplate restTemplate;

    // Generate the Constructor for the two field
    public RequestToJsonStringConverter(ObjectMapper objectMapper, RestTemplate restTemplate) {
        this.objectMapper = objectMapper;
        this.restTemplate = restTemplate;
    }


    // Declare the generateJsonNode to get the node from the request
    public String generateJsonNode(RequestEntity<Void> request, String getValueFrom) throws JsonProcessingException {
        Object users = Objects.requireNonNull(restTemplate.exchange(request, Object.class).getBody());

        String jsonValue = objectMapper.writeValueAsString(users);

        JsonNode node = objectMapper.readTree(jsonValue);

        return node.get(getValueFrom).toString();
    }
}
