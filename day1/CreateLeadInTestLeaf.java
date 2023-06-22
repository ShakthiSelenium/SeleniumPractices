package selenium.homeassignment.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadInTestLeaf 
{
	public static void LoginTestleaf(ChromeDriver driver)
	{
		//ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		
		LoginTestleaf(driver);
			driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Leads")).click();
					driver.findElement(By.linkText("Create Lead")).click();
						driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS");
						driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shakthi");
						driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
						driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("rajashakthimurali@gmail.com");
						driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8989511111");
						driver.findElement(By.className("smallSubmit")).click();
						Thread.sleep(2000);
	}

}

