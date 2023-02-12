package com.QAFox_LiveProject.automation.base;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.QAFox_LiveProject.automation.config.ConfigurationReader;




public class Base {

	public static Logger log=Logger.getLogger(Base.class);
	public static WebDriver driver;
	public static ConfigurationReader reader;
}
