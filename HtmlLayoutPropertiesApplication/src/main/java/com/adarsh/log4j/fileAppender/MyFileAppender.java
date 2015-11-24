package com.adarsh.log4j.fileAppender;

import org.apache.log4j.*;

public class MyFileAppender {
    private Logger loggerObject;


    public MyFileAppender(Class className, String log4jFile) {
        super();
        this.loggerEnviorment(className, log4jFile);
    }

    public void loggerEnviorment(Class<Object> className, String log4jFile) {
        this.loggerObject = Logger.getLogger(className);
        PropertyConfigurator.configure(log4jFile);
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
