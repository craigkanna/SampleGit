package gitHubTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GitHubTest {

	
	
	@Test
	public void loginTest() throws IOException
	{
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		// wd.get("https://www.flipkart.com/?gclid=CjwKCAjw-4_mBRBuEiwA5xnFIGMBZAWunOW1IDtA7CZWICwnhj7DXR1rFVpscJDg69rfsa_7Hfzj9hoCiKIQAvD_BwE&ef_id=CjwKCAjw-4_mBRBuEiwA5xnFIGMBZAWunOW1IDtA7CZWICwnhj7DXR1rFVpscJDg69rfsa_7Hfzj9hoCiKIQAvD_BwE:G:s&s_kwcid=AL!739!3!326554955738!e!!g!!flipkart&semcmpid=sem_8024046704_brand_eta_goog");
		
	File src =	((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);// now we have clicked 'Print' button here.
	
	// 'TakesScreenshot' oru Interface, 'wd' oru Interface, So doing CASTING by using brackets ((()))... 'getScreenshotAs' Interface is used to do Screenshot.
	
	FileUtils.copyFile(src, new File("C:\\SeleniumWorkspace\\GitHubTest\\Screenshot\\123.jpg"));
			// FileUtils is used for doing the actions, i.e., moving the Physical Folder, etc...
	}
	
	
	
}
