package com.lennonjesus.sample.domain;

/**
 * @author Lennon Jesus
 */
public class Message {

    private Long id;

    private String message;

    public Message(Long id, String message) {
        this.id = id;
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }
}