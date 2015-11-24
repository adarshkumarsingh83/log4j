package com.adarsh.main;

import com.adarsh.log4j.consoleAppender.MyConsoleAppender;
import com.adarsh.log4j.dailyRollingFileAppender.MyDailyRollingFileAppender;
import com.adarsh.log4j.fileAppender.MyFileAppender;
import com.adarsh.log4j.rollingFileAppender.MyRollingFileAppender;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh
 * Date: 7/6/12
 * Time: 9:28 AM
 * To change this template use File | Settings | File Templates.
 */
public class ApplicationMain {

    public static void main(String[] args) {
        myConsoleAppender();
        myFileAppender();
        rollingFileAppender();
        dailyRollingFileAppender();
    }

    public static void myConsoleAppender() {
        MyConsoleAppender myConsoleAppender = new MyConsoleAppender(ApplicationMain.class,"src\\main\\resources\\consoleAppender\\log4j.cfg.xml");
        myConsoleAppender.debugMsg("Debug Msg");
        myConsoleAppender.infoMsg("Info Msg");
        myConsoleAppender.warnMsg("Warn Msg");
        myConsoleAppender.errorMsg("Error Msg");
        myConsoleAppender.fatalMsg("Fatal Msg");
    }

    public static void myFileAppender() {
        MyFileAppender myFileAppender = new MyFileAppender(ApplicationMain.class, "src\\main\\resources\\fileAppender\\log4j.cfg.xml");
        myFileAppender.debugMsg("Debug Msg");
        myFileAppender.infoMsg("Info Msg");
        myFileAppender.warnMsg("Warn Msg");
        myFileAppender.errorMsg("Error Msg");
        myFileAppender.fatalMsg("Fatal Msg");
    }


    public static void rollingFileAppender(){
        MyRollingFileAppender myRollingFileAppender = new MyRollingFileAppender(ApplicationMain.class, "src\\main\\resources\\rollingFileAppender\\log4j.xml");
        myRollingFileAppender.debugMsg("Debug Msg");
        myRollingFileAppender.infoMsg("Info Msg");
        myRollingFileAppender.warnMsg("Warn Msg");
        myRollingFileAppender.errorMsg("Error Msg");
        myRollingFileAppender.fatalMsg("Fatal Msg");
    }


    public static void dailyRollingFileAppender(){
        MyDailyRollingFileAppender myDailyRollingFileAppender = new MyDailyRollingFileAppender(ApplicationMain.class, "src\\main\\resources\\dailyRollingFileAppender\\log4j.xml");
        myDailyRollingFileAppender.debugMsg("Debug Msg");
        myDailyRollingFileAppender.infoMsg("Info Msg");
        myDailyRollingFileAppender.warnMsg("Warn Msg");
        myDailyRollingFileAppender.errorMsg("Error Msg");
        myDailyRollingFileAppender.fatalMsg("Fatal Msg");
    }
}
