package com.adarsh.log4j.consoleAppender;

import org.apache.log4j.*;
import org.apache.log4j.xml.DOMConfigurator;

public class MyConsoleAppender {

    private Logger loggerObject;


    public MyConsoleAppender(Class className, String cfgFile) {
        super();
        this.LogEnviorment(className, cfgFile);
    }

    public void LogEnviorment(Class<Object> className, String cfgFile) {
        try {
            this.loggerObject = Logger.getLogger(className);
            PropertyConfigurator.configure(cfgFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void infoMsg(String msg) {
        loggerObject.info(msg);
    }

    public void debugMsg(String msg) {
        loggerObject.debug(msg);
    }

    public void warnMsg(String msg) {
        loggerObject.warn(msg);
    }

    public void errorMsg(String msg) {
        loggerObject.error(msg);
    }

    public void fatalMsg(String msg) {
        loggerObject.fatal(msg);
    }
}
