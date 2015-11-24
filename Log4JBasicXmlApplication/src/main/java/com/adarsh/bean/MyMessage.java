package com.adarsh.bean;

import org.apache.log4j.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh
 * Date: 7/9/12
 * Time: 9:59 AM
 * To change this template use File | Settings | File Templates.
 */
public class MyMessage {

    final private static Logger logger = Logger.getLogger(MyMessage.class);

    static{
        logger.info("Static block MyMessage");
    }

    {
        logger.info("Instance block MyMessage");
    }

    private String myMsg;

    public MyMessage() {
        logger.info("Constructor MyMessage");
    }

    public String getMyMsg() {
        logger.info("getMyMsg MyMessage");
        return myMsg;
    }

    public void setMyMsg(String myMsg) {
        this.myMsg = myMsg;
        logger.info("setMyMsg MyMessage");
    }
}
