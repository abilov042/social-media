package com.example.socialmedia.models.result;

public class SuccessResult extends Result{
    public SuccessResult() {}

    public SuccessResult(String message) {
        super(true, message);
    }
}
