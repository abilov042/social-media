package com.example.socialmedia.models.result;

public class ErrorResult extends Result{

    public ErrorResult() {}

    public ErrorResult(String message) {
        super(false, message);
    }
}
