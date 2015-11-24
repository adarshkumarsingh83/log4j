package com.adarsh.log4j;

import org.apache.log4j.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh
 * Date: 9/28/12
 * Time: 1:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {


    static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        logger.debug("This is debug log");
        logger.info("This is info log");
        logger.warn("This is warn log");
        logger.error("this is error log");
        logger.fatal("this is fatal log");
    }

}
