package com.adarsh.log4j.dailyRollingFileAppender;

import org.apache.log4j.*;
import org.apache.log4j.xml.DOMConfigurator;

public class MyDailyRollingFileAppender {
    private Logger loggerObject;


    public MyDailyRollingFileAppender(Class className, String log4jFilePath) {
        super();
        this.loggerEnviorment(className, log4jFilePath);
    }

    public void loggerEnviorment(Class<Object> className, String log4jFilePath) {
        this.loggerObject = Logger.getLogger(className);
        DOMConfigurator.configure(log4jFilePath);
    }

    public void debugMsg(String msg) {
        this.loggerObject.debug(msg);
    }

    public void infoMsg(String msg) {
        this.loggerObject.info(msg);
    }

    public void warnMsg(String msg) {
        this.loggerObject.warn(msg);
    }

    public void errorMsg(String msg) {
        this.loggerObject.error(msg);
    }

    public void fatalMsg(String msg) {
        this.loggerObject.fatal(msg);
    }
}
