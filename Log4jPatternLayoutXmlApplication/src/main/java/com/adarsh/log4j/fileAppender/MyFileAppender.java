package com.adarsh.log4j.fileAppender;

import org.apache.log4j.*;
import org.apache.log4j.xml.DOMConfigurator;

public class MyFileAppender {

    private Logger loggerObject;
    private PatternLayout patternLayout;
    private FileAppender fileAppender;
    private String pattern = "%n %3c %p %7r [%t] %3c %4m %n";

    public MyFileAppender(Class className, String log4jXmlFile) {
        super();
        this.loggerEnviorment(className, log4jXmlFile);
    }

    private void loggerEnviorment(Class<Object> className, String log4jXmlFile) {
        try {
            this.loggerObject = Logger.getLogger(className);
            DOMConfigurator.configure(log4jXmlFile);
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
