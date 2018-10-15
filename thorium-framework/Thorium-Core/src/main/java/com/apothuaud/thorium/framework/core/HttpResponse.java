package com.apothuaud.thorium.framework.core;

import com.apothuaud.thorium.framework.enumerations.HttpStatus;

public class HttpResponse {

    private final String strContent;
    HttpStatus statusCode;

    public HttpResponse(String toString) {
        this.strContent = toString;
    }

    @Override
    public String toString() {
        return this.strContent;
    }
}
