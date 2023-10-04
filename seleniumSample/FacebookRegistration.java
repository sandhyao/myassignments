package seleniumSample;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FacebookRegistration { 
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		
		driver.get("https://en-gb.facebook.com/"); 
		
		driver.findElement(By.linkText("Create new account")).click(); 
		
	//	Thread.sleep(2000); 
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("firstname")).sendKeys("Sandhya");
		driver.findElement(By.name("lastname")).sendKeys("oli");
		driver.findElement(By.name("reg_email__")).sendKeys("sandheya@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("sandhya123"); 
		
		
		//to enter date
		 WebElement date = driver.findElement(By.name("birthday_day")); 
	       Select dd = new Select(date);
			dd.selectByVisibleText("9");

			//to enter month
			WebElement month =driver.findElement(By.name("birthday_month"));
			Select mth =new Select(month);
			mth.selectByVisibleText("Mar");
			
			//to enter year
			WebElement year =driver.findElement(By.id("year"));
			Select yr =new Select(year);
			yr.selectByVisibleText("1989");
			
			Thread.sleep(2000);
			//to select gender
			driver.findElement(By.xpath("//label[text()='Female']")).click();
			
			}
}