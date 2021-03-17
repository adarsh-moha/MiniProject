package com.fresco.cucumber;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.logging.Level;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MyChromeDriver extends ChromeDriver {
	public MyChromeDriver() {
		super(new MyCapabilities().getCaps());
	}

	public void printLogs() {
		File logfile = new File("web/.netlogs");
		try {
			if(logfile.exists())
				logfile.delete();
			logfile.createNewFile();
			FileOutputStream fos = new FileOutputStream(logfile);
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
			for (LogEntry log : this.manage().logs().get(LogType.PERFORMANCE).getAll())
				bw.write(log.toString());
			bw.close();
		}catch(Exception e) {e.printStackTrace();}
	}

	public void close() {
		printLogs();
		super.close();
	}
	public void quit() {
		printLogs();
		super.quit();
	}
}

class MyCapabilities {
	public Capabilities getCaps() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200", "--ignore-certificate-errors");
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		LoggingPreferences logPrefs = new LoggingPreferences();
		logPrefs.enable(LogType.PERFORMANCE, Level.ALL);
		caps.setCapability(CapabilityType.LOGGING_PREFS, logPrefs);
		caps.setCapability(ChromeOptions.CAPABILITY, options);
		return caps;
	}
}
