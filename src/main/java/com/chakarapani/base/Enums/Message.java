package com.chakarapani.base.Enums;

import lombok.Getter;

@Getter
public enum Message {
    SUCCESS("Success"),
    FAILURE("Failure");

    private final String message;

    Message(String message) {
        this.message = message;
    }

}