package com.adarsh.main;


import org.apache.log4j.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh
 * Date: 7/11/12
 * Time: 9:21 AM
 * To change this template use File | Settings | File Templates.
 */
public class ApplicationMain {

    private static final Logger logger = Logger.getLogger(ApplicationMain.class);

    public static void main(String[] args) {
        logger.info("Info Msg");
        logger.debug("Debug Msg");
        logger.warn("Warn Msg");
        logger.error("Error Msg");
        logger.fatal("Fatal Msg");
    }
}
