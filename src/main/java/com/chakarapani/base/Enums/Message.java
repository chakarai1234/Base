package com.chakarapani.base.Enums;

import lombok.Getter;

// Generate the Enums as Success and Failure
@Getter
public enum Message {
    SUCCESS("Success"), FAILURE("Failure");

    private final String message;

    Message(String message) {
        this.message = message;
    }

}