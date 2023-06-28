package selenium.homeassignment.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//label[contains(text(),'Username')]/following-sibling::input")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//label[contains(text(),'Password')]/following-sibling::input")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@id='password']/following::input")).click();
		driver.findElement(By.xpath("//div[@id='label']/a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//div[@class='x-panel-header']/a[contains(text(),'Leads')]")).click();
		driver.findElement(By.xpath("(//ul[@class='shortcuts']//a)[2]")).click();
		driver.findElement(By.xpath("//span[@class='requiredField']/following::input[@id='createLeadForm_companyName']")).sendKeys("Healthcare");
		driver.findElement(By.xpath("//span[@class='requiredField']/following::input[@id='createLeadForm_firstName']")).sendKeys("Yazhini");
		driver.findElement(By.xpath("//span[@class='requiredField']/following::input[@id='createLeadForm_lastName']")).sendKeys("M");
		
		WebElement source = driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));
		Select sourceop = new Select(source);
		sourceop.selectByVisibleText("Employee");
		
		WebElement ownership = driver.findElement(By.xpath("//select[@id='createLeadForm_ownershipEnumId']"));
		Select ownershipop = new Select(ownership);
		ownershipop.selectByIndex(5);
		
		WebElement marketingcampaign = driver.findElement(By.xpath("//select[@id='createLeadForm_marketingCampaignId']"));
		Select marketingcampaignop = new Select(marketingcampaign);
		marketingcampaignop.selectByValue("9001");
		
		WebElement country = driver.findElement(By.xpath("//select[@id='createLeadForm_generalCountryGeoId']"));
		Select countryop = new Select(country);
		countryop.selectByVisibleText("India");
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		System.out.println("After Create Lead Submit button click loading page title -"+driver.getTitle());
		
	}

}
