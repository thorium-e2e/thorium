package com.apothuaud.thorium.framework.enumerations;

public enum HttpStatus {

    // 1XX - INFORMATION
    CONTINUE(100),
    SWITCHING_PROTOCOLS(101),
    PROCESSING(102),
    EARLY_HINTS(103),

    // 2XX - Success
    OK(200),
    CREATED(201),
    ACCEPTED(202),
    NON_AUTHORITATIVE_INFORMATION(203),
    NO_CONTENT(204),
    RESET_CONTENT(205),
    PARTIAL_CONTENT(206),
    MULTI_STATUS(207),
    ALREADY_REPORTED(208),
    CONTENT_DIFFERENT(210),
    IM_USED(226),

    // 3XX - Redirection
    MULTIPLE_CHOICES(300),
    MOVED_PERMANENTLY(301),
    FOUND(302),
    SEE_OTHER(303),
    NOT_MODIFIED(304),
    USE_PROXY(305),
    TEMPORARY_REDIRECT(307),
    PERMANENT_REDIRECT(308),
    TOO_MANY_REDIRECTS(310),

    // 4XX - Web Client Error
    BAD_REQUEST(400),
    UNAUTHORIZED(401),
    PAYMENT_REQUIRED(402),
    FORBIDDEN(403),
    NOT_FOUND(404),

    // 5XX - Server Error

    ;

    /**
     * Value for this status code
     */
    public final int Code;

    private HttpStatus(int code)
    {
        Code = code;
    }
}
