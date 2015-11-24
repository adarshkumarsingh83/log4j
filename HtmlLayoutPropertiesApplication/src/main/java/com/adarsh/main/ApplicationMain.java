package com.adarsh.main;

import com.adarsh.log4j.dailyRollingFileAppender.MyDailyRollingFileAppender;
import com.adarsh.log4j.dollingFileAppender.MyRollingFileAppender;
import com.adarsh.log4j.fileAppender.MyFileAppender;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh
 * Date: 7/5/12
 * Time: 9:46 AM
 * To change this template use File | Settings | File Templates.
 */
public class ApplicationMain {

    public static void main(String[] args) {
        myFileAppender();
        myRollingFileAppender();
        myDailyRollingFileAppender();
    }

    public static void myFileAppender(){
        MyFileAppender myFileAppender=new MyFileAppender(ApplicationMain.class, "E:\\backup\\SAMPLEPROGRAM\\HtmlLayoutPropertiesApplication\\src\\main\\resources\\myFileAppender\\log4j.properties");
        myFileAppender.debugMsg("Debug Msg");
        myFileAppender.infoMsg("Info Msg");
        myFileAppender.warnMsg("Warn Msg");
        myFileAppender.errorMsg("Error Msg");
        myFileAppender.fatalMsg("Fatal Msg");
    }

    public static void myRollingFileAppender() {
        MyRollingFileAppender myRollingFileAppender = new MyRollingFileAppender(ApplicationMain.class, "src\\main\\resources\\myRollingFileAppender\\log4j.properties");
        myRollingFileAppender.debugMsg("Debug Msg");
        myRollingFileAppender.infoMsg("Info Msg");
        myRollingFileAppender.warnMsg("Warn Msg");
        myRollingFileAppender.errorMsg("Error Msg");
        myRollingFileAppender.fatalMsg("Fatal Msg");
    }

    public static void myDailyRollingFileAppender() {
        MyDailyRollingFileAppender myDailyRollingFileAppender = new MyDailyRollingFileAppender(ApplicationMain.class, "src\\main\\resources\\myDailyRollingFileAppender\\log4j.properties");
        myDailyRollingFileAppender.debugMsg("Debug Msg");
        myDailyRollingFileAppender.infoMsg("Info Msg");
        myDailyRollingFileAppender.warnMsg("Warn Msg");
        myDailyRollingFileAppender.errorMsg("Error Msg");
        myDailyRollingFileAppender.fatalMsg("Fatal Msg");
    }
}
