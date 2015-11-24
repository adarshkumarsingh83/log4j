package com.adarsh.log4j.dailyRollingFileAppender;
import org.apache.log4j.*;
import org.apache.log4j.xml.DOMConfigurator;

public class MyDailyRollingFileAppender {

	private Logger loggerObject;
	private PatternLayout patternLayout;
	private DailyRollingFileAppender dailyRollingFileAppender;
	private String datePattern="yyy-MM-dd-HH-mm";
	private String pattern="%n %p %7r [%t] %3c %4m %n";
	
	public MyDailyRollingFileAppender(Class className,String xmlConfigFile) {
		super();
		this.loggerEnviorment(className, xmlConfigFile);
	}
   public void loggerEnviorment(Class <Object> className,String xmlConfigFile){
	   try{
		   this.loggerObject=Logger.getLogger(className);
           DOMConfigurator.configure(xmlConfigFile);
	   }catch(Exception e){
		   e.printStackTrace();
	   }
   }
   
   public void debugMsg(String msg){
	   this.loggerObject.debug(msg);
   }
   
   public void infoMsg(String msg){
	   this.loggerObject.info(msg);
   }
   
   public void warnMsg(String msg){
	   this.loggerObject.warn(msg);
   }
   public void errorMsg(String msg){
	   this.loggerObject.error(msg);
   }
   public void fatalMsg(String msg){
	   this.loggerObject.fatal(msg);
   }
}
