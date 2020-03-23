package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;

public class base {
	public WebDriver driver;
	public Properties prop;
	public WebDriver initialiseDriver() throws IOException {
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browser = prop.getProperty("browser");
		if(browser.equals("chrome")) {
		//if(System.getProperty("browser").contains("chrome")) {
			//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\java\\resources\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\java\\resources\\chromedriver.exe");
			/*ChromeOptions co = new ChromeOptions(); //Create object of chrome options class
			if(System.getProperty("browser").contains("headless")) 
			{
			co.addArguments("headless"); //passing headless option to the object
			}*/
			driver = new ChromeDriver(); //giving headless as knowledge to driver
		}else if(browser.equals("firefox")) {//(System.getProperty("browser").contentEquals("firefox")) {
			System.setProperty("webdriver.gecko.driver", prop.getProperty("firefoxdriver"));
			driver = new FirefoxDriver();
		}else if(browser.equals("ie")) {//(System.getProperty("browser").contentEquals("ie")) {
			System.setProperty("webdriver.ie.driver", prop.getProperty("iedriver"));
			driver = new InternetExplorerDriver();
			}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public void getScreenshot(WebDriver driver, String data) throws IOException {
		DateFormat df = new SimpleDateFormat("ddmmyyHHmmss");
		String date=df.format(new Date());
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFiles(src,new File("C:\\Study\\Screenshots"));
		FileHandler.copy(src, new File("C:\\Study\\Screenshots\\"+data+date+"screenshot.png"));
	}	


}
