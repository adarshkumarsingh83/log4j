package com.adarsh.spring.log;

import org.apache.log4j.Layout;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh
 * Date: 7/4/12
 * Time: 4:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class CustomLog4JRollingFileAppender
        extends org.apache.log4j.RollingFileAppender {

    protected boolean fileSystem = false;

    public CustomLog4JRollingFileAppender() {
    }

    public CustomLog4JRollingFileAppender(Layout layout, String filename, boolean append) throws IOException {
        super(layout, filename, append);
    }

    public CustomLog4JRollingFileAppender(Layout layout, String filename) throws IOException {
        super(layout, filename);
    }

    @Override
    public void setFile(String file) {
        if (fileSystem) {
            try {
                file = "c:/log/" + file;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        super.setFile(file);
    }

    public boolean getFileSystem() {
        return fileSystem;
    }

    public void setFileSystem(boolean fileSystem) {
        this.fileSystem = fileSystem;
    }
}
