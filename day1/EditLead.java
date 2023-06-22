package selenium.homeassignment.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Leads")).click();
					driver.findElement(By.linkText("Create Lead")).click();
						driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS");
						driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shakthi");
						driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
						driver.findElement(By.className("smallSubmit")).click();
						Thread.sleep(2000);
						driver.findElement(By.linkText("Edit")).click();
						driver.findElement(By.id("updateLeadForm_companyName")).clear();
						driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Infosys");
						driver.findElement(By.className("smallSubmit")).click();		
	}

}
