package selenium.homeassignment.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafTapsCreateAccount 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("LocalName");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("SiteName");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("xpathCollection");
		
		WebElement industry = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select industryop = new Select(industry);
		industryop.selectByVisibleText("Computer Software");
		
		WebElement ownership = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select ownershipop = new Select(ownership);
		ownershipop.selectByVisibleText("S-Corporation");
		
		WebElement source = driver.findElement(By.xpath("//select[@id='dataSourceId']"));
		Select sourceop = new Select(source);
		sourceop.selectByValue("LEAD_EMPLOYEE");
		
		WebElement marketingcampaign = driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
		Select marketingcampaignop = new Select(marketingcampaign);
		marketingcampaignop.selectByIndex(6);
		
		WebElement state = driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
		Select stateop = new Select(state);
		stateop.selectByValue("TX");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	}

}
