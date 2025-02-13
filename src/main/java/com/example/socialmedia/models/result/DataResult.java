package com.example.socialmedia.models.result;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DataResult <T> extends Result {
    private T data;

    public DataResult(boolean success, String message, T data) {
        super(success, message);
        this.data = data;
    }

    public DataResult(){}
}
