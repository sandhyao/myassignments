package seleniumSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeAssignment2 {

public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver(); 
		
		//to maximize the window
		driver.manage().window().maximize(); 
		
		//launch url
		driver.get("http://leaftaps.com/opentaps/control/main");
      // driver.get("https://www.facebook.com");
	
		//username		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		 
		//to get passord
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//to click login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//to get text
		System.out.println(driver.findElement(By.tagName("h2")).getText());
	
		// to click crmsfa
		driver.findElement(By.linkText("CRM/SFA")).click(); 
		
		//to get title
		System.out.println(driver.getTitle());
		
		//to close window
		//driver.close();
		
		//click Accounts tab 
		driver.findElement(By.linkText("Accounts")).click(); 
		driver.findElement(By.linkText("Create Account")).click();
		//driver.findElement(By.name("accountName")).sendKeys("sandhya");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		
		//select computer software as industry
       WebElement industry = driver.findElement(By.name("industryEnumId")); 
		
       Select dd = new Select(industry);
		dd.selectByVisibleText("Computer Software");
		
	//select s corporation from ownership
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select dd1 = new Select (ownership);
		dd1.selectByVisibleText("S-Corporation"); 
		
		WebElement source1 = driver.findElement(By.name("dataSourceId"));
		Select sourcedd = new Select(source1);
		sourcedd.selectByValue("LEAD_EMPLOYEE");
		
		//WebElement currency = driver.findElement(By.name("currencyUomId"));
		//Select curdd =new Select(currency);
		//curdd.selectByVisibleText("USD - United States Dollar");
		//driver.findElement(By.name("currencyUomId")).clear();
		
		WebElement marketing = driver.findElement(By.name("marketingCampaignId"));
		Select m_dd =new Select(marketing);
		m_dd.selectByIndex(6);
		
		//select state Texas
		WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select state_dd = new Select(state);
		state_dd.selectByValue("TX");
		
		//click account button
		driver.findElement(By.className("smallSubmit")).click();
		
		
		
		//driver.close();
		
}
	
}
