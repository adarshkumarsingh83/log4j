package com.adarsh.log4j.rollingFileAppender;
import org.apache.log4j.*;

public class MyRollingFileAppender {

	private Logger loggerObject;
	private RollingFileAppender rollingFileAppender;
	private PatternLayout patternLayout;
	private String pattern="%n %3c %p %7r [%t] %3c %4m %n";
	
	
	public MyRollingFileAppender(Class className,String fileName) {
		super();
		this.loggerEnviorment(className, fileName);
	}
   
	private void loggerEnviorment(Class <Object> className,String fileName){		
		try{
		   loggerObject=Logger.getLogger(className);
		   PropertyConfigurator.configure(fileName);
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
