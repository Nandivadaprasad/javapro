package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoqa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL 3501\\eclipse-workspace\\sel1\\driver1\\chromedriver.exe");
      
      WebDriver driver=new ChromeDriver();
      driver.get("https://demoqa.com/checkbox");
      driver.manage().window().maximize();
      System.out.println(driver.findElement(By.xpath("//*[@class='rct-icon rct-icon-uncheck']")).isEnabled());
      System.out.println(driver.findElement(By.xpath("//*[@class='rct-icon rct-icon-uncheck']")).isDisplayed());
      driver.findElement(By.xpath("//*[@class='rct-icon rct-icon-uncheck']")).click();
      Thread.sleep(2000);
      System.out.println(driver.findElement(By.xpath("//*[@class='rct-icon rct-icon-uncheck']")).isSelected());
      driver.navigate().to("https://demoqa.com/text-box");
      System.out.println(driver.getTitle());
      driver.findElement(By.id("userName")).sendKeys("lokesh");
      System.out.println(driver.findElement(By.id("userName")).getAttribute("Type"));
      System.out.println(driver.findElement(By.id("userName")).getAttribute("value"));
      
	}

}
