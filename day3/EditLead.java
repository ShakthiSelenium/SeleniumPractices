package selenium.homeassignment.day3;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		String texttofind="Shakthi";
		String editcompanyname = "GlobalMantra";
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//label[contains(text(),'Username')]/following-sibling::input")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//label[contains(text(),'Password')]/following-sibling::input")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@id='password']/following::input")).click();
		driver.findElement(By.xpath("//div[@id='label']/a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//div[@class='x-panel-header']/a[contains(text(),'Leads')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]/following::a")).click();
		driver.findElement(By.xpath("(//label[contains(text(),'First name:')]/following::input[@name='firstName'])[3]")).sendKeys(texttofind);
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(3000);
		 	driver.findElement(By.xpath("//div[contains(@class,'x-grid3-col-firstName')]/a")).click();
		   	String viewleadtitle = driver.getTitle();
			System.out.println("The title of the page appeared after clicking a lead to view is-"+viewleadtitle);
			
			driver.findElement(By.xpath("//a[contains(text(),'Qualify Lead')]/following-sibling::a")).click();
			
			WebElement editcompanyname1 = driver.findElement(By.xpath("//span[contains(text(),'Company Name')]/following::input[@id='updateLeadForm_companyName']"));
			editcompanyname1.clear();
			editcompanyname1.sendKeys(editcompanyname);
			driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
			boolean present;
			try 
			{
			   driver.findElement(By.xpath("//span[contains(text(),'"+editcompanyname+"')]"));
			   present = true;
			} catch (NoSuchElementException e) 
			{
			   present = false;
			}
			
			if (present)
				System.out.println("Company name updated successfully");
			else
				System.out.println("Company name updation failed");
			
			driver.close();

		}

	}
