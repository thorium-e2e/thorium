package com.apothuaud.thorium.framework.enumerations;

public enum HttpMethod {

    OPTIONS("OPTIONS"),
    GET("GET"),
    HEAD("HEAD"),
    POST("POST"),
    PUT("PUT"),
    DELETE("DELETE"),
    TRACE("TRACE"),
    CONNECT("CONNECT")

    ;

    /**
     * Value for this method
     */
    public final String Method;

    private HttpMethod(String method)
    {
        Method = method;
    }
}
