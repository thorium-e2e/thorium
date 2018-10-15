package com.apothuaud.thorium.framework.logging;

import com.apothuaud.thorium.framework.enumerations.LogType;

import java.io.OutputStream;

public class Logger {

    private LogType logType;
    private String environment;
    private String reason;
    private String message;
    private OutputStream output;

    public Logger(String environment) {
        this.environment = environment;
    }

    public LogType getLogType() {
        return logType;
    }

    public void setLogType(LogType logType) {
        this.logType = logType;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void INFO(String reason, String message){
        this.setLogType(LogType.INFO);
        this.setReason(reason);
        this.setMessage(message);

    }
}
