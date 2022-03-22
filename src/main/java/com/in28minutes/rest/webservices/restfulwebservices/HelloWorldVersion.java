package com.in28minutes.rest.webservices.restfulwebservices;

public class HelloWorldVersion {

    private String message;

    public HelloWorldVersion(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
