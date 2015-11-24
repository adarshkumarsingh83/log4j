package com.adarsh.main;

import com.adarsh.log4j.consoleAppender.MyConsoleAppender;
import com.adarsh.log4j.dailyRollingFileAppender.MyDailyRollingFileAppender;
import com.adarsh.log4j.fileAppender.MyFileAppender;
import com.adarsh.log4j.rollingFileAppender.MyRollingFileAppender;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh
 * Date: 7/5/12
 * Time: 10:16 AM
 * To change this template use File | Settings | File Templates.
 */
public class ApplicationMain {

    public static void main(String[] args) {
        myConsoleAppender();
        myFileAppender();
        myRollingFileAppender();
        myDailyRollingFileAppender();
    }

    public static void myConsoleAppender() {
        MyConsoleAppender myConsoleAppender = new MyConsoleAppender(ApplicationMain.class,"src\\main\\resources\\consoleAppender\\log4j.properties");
        myConsoleAppender.infoMsg("Info Msg");
        myConsoleAppender.debugMsg("Debug Msg");
        myConsoleAppender.warnMsg("Warn Msg");
        myConsoleAppender.errorMsg("Error Msg");
        myConsoleAppender.fatalMsg("Fatal Msg");
    }

    public static void myFileAppender() {
        MyFileAppender myFileAppender = new MyFileAppender(ApplicationMain.class, "src\\main\\resources\\rollingFileAppender\\log4j.properties");
        myFileAppender.infoMsg("Info Msg");
        myFileAppender.debugMsg("Debug Msg");
        myFileAppender.warnMsg("Warn Msg");
        myFileAppender.errorMsg("Error Msg");
        myFileAppender.fatalMsg("Fatal Msg");
    }

    public static void myRollingFileAppender() {
        MyRollingFileAppender myRollingFileAppender = new MyRollingFileAppender(ApplicationMain.class, "src\\main\\resources\\rollingFileAppender\\log4j.properties");
        myRollingFileAppender.infoMsg("Info Msg");
        myRollingFileAppender.debugMsg("Debug Msg");
        myRollingFileAppender.warnMsg("Warn Msg");
        myRollingFileAppender.errorMsg("Error Msg");
        myRollingFileAppender.fatalMsg("Fatal Msg");
    }

    public static void myDailyRollingFileAppender() {
        MyDailyRollingFileAppender myDailyRollingFileAppender = new MyDailyRollingFileAppender(ApplicationMain.class, "src\\main\\resources\\dailyRollingFileAppender\\log4j.properties");
        myDailyRollingFileAppender.infoMsg("Info Msg");
        myDailyRollingFileAppender.debugMsg("Debug Msg");
        myDailyRollingFileAppender.warnMsg("Warn Msg");
        myDailyRollingFileAppender.errorMsg("Error Msg");
        myDailyRollingFileAppender.fatalMsg("Fatal Msg");
    }
}
