package com.example.demo_project.Exceptions;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class BusinessValidationException extends Exception {

    private LocalDateTime timestamp;
    private String message;
    private String details;

    public BusinessValidationException(String message, String details) {
        this.message = message;
        this.details = details;
    }

    //GS
    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

}
