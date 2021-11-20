package com.example.demo.service;

public class CommonService {
    public Object isBlank(Object object) {
        if (object == null || object == "") {
            return null;
        }
        return object;
    }
}
