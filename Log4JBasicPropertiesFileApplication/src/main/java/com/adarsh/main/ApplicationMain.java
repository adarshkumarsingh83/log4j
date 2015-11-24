package com.adarsh.main;

import com.adarsh.bean.MyMessage;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh
 * Date: 7/9/12
 * Time: 9:45 AM
 * To change this template use File | Settings | File Templates.
 */
public class ApplicationMain {

    private static Logger logger = Logger.getLogger(ApplicationMain.class);

    public static void main (String args[]){
        PropertyConfigurator.configure("src\\main\\resources\\log4j.properties");
        logger.info("Info Log");
        logger.warn("Warn Log");
        logger.debug("Debug.Log");
        logger.error("Error Log");
        logger.fatal("Fatal Log");


        MyMessage myMessage=new MyMessage();
        myMessage.setMyMsg("Hi ");
        myMessage.getMyMsg();
    }
}
