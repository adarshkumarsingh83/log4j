package com.adarsh.log4j.rollingFileAppender;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh
 * Date: 7/10/12
 * Time: 9:39 AM
 * To change this template use File | Settings | File Templates.
 */
public class MyRollingFileAppender {

    private Logger loggerObject;


    public MyRollingFileAppender(Class className, String cfgFile) {
        super();
        this.LogEnviorment(className, cfgFile);
    }

    public void LogEnviorment(Class<Object> className, String cfgFile) {
        try {
            this.loggerObject = Logger.getLogger(className);
            DOMConfigurator.configure(cfgFile);
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

    public void fatalMsg(String msg){
        loggerObject.fatal(msg);
    }
}
