package com.mannietest.customloglevellogj12.customlevel;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class FunnyLogging {
	
	public void testLogging()
	{
        Logger logger = Logger.getLogger(FunnyLogging.class);

        //Print the below two messages when in ERROR Log level
        logger.log(FunnyLogLevel.FUNNY, "I am a Funny log, because the Log level set is ERROR and my log level is FUNNY!!");
        logger.error("I am an ERROR message");
        
        //Do not print this in ERROR Log level
        logger.log(Level.DEBUG, "I am a DEBUG message");	
        
	}
}
