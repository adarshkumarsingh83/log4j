package com.adarsh.log4j.dailyRollingFileAppender;

import org.apache.log4j.*;

public class MyDailyRollingFileAppender {

    private Logger loggerObject;

    public MyDailyRollingFileAppender(Class className, String logFile) {
        super();
        this.loggerEnviorment(className, logFile);
    }

    public void loggerEnviorment(Class<Object> className, String logFile) {
        try {
            this.loggerObject = Logger.getLogger(className);
            PropertyConfigurator.configure(logFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
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
