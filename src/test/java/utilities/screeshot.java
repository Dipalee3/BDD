package utilities;

import java.io.File;
import java.io.IOException;
import java.time.Instant;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class screeshot {

	
	public static void screenCapture(WebDriver driver) throws IOException {
				
	//TakesScreenshot---- interface
		// getScreenshotAs(OutPut.FILE)
				// take screenshot
		
		
		File screenShotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//specify the name of the file 
		
		long timestamp=Instant.now().getEpochSecond();
		System.out.println(timestamp);
		
		String screenShotFileName="Capture"+timestamp+".png";
		
		// location where you want to save the file
		
		String screenShotPath=System.getProperty("user.dir")+File.separator+screenShotFileName;
		
		
		FileHandler.copy(screenShotFile, new File(screenShotPath));
		
		
		
		
		
		
		
	}
	
	
}
