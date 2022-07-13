package pac1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;
@Test
public class base {
	public static WebDriver driver;
	public static FileReader fi;
	Properties p=new Properties();
	@Test
	public void tearUp() throws IOException
	{
		if(driver==null)
	System.out.println(System.getProperty("user.dir"));
    fi=new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\Config.properties");
    p.load(fi);
    
   
    if(p.getProperty("browser").equalsIgnoreCase("chrome"))
    {
    	 base.driver=new ChromeDriver();
    }
    else if(p.getProperty("browser").equalsIgnoreCase("ie"))
    {
    	 base.driver=new InternetExplorerDriver();
    	
    }
    else if(p.getProperty("browser").equalsIgnoreCase("firefox"))
    		{
    	base.driver=new FirefoxDriver();
    	
    }
	driver.get(p.getProperty("url"));   	
}
	public void teardown()
	{
		//driver.close();
	//driver.quit();
	}
}