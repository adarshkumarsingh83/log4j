package com.adarsh.log4j.consoleAppender;

import org.apache.log4j.*;

public class MyConsoleAppender {

    private Logger loggerObject;
    private ConsoleAppender consoleAppender;
    private PatternLayout patternLayout;
    private String pattern = "%n %p %7r [%t] %3c %4m %n";

    public MyConsoleAppender(Class className, String cfgFile) {
        super();
        this.loggerEnviorment(className, cfgFile);
    }

    private void loggerEnviorment(Class className, String cfgFile) {
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
