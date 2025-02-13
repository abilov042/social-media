package com.example.socialmedia.models.result;

public class ErrorDataResult<T> extends DataResult<T> {

    public ErrorDataResult() {}

    public ErrorDataResult(String message, T data) {
        super(false, message, data);
    }
}
