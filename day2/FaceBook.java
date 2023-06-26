package selenium.homeassignment.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		//url: https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("RajaShakthi");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Murali");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("7878787878");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Shakthi@123");
		
		WebElement dob = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select dobselect = new Select(dob);
		dobselect.selectByVisibleText("7");
		
		WebElement dob1 = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select dobselectmonth = new Select(dob1);
		dobselectmonth.selectByVisibleText("Sep");
		
		WebElement dob2 = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select dobselectyear = new Select(dob2);
		dobselectyear.selectByVisibleText("1988");
		
		driver.findElement(By.xpath("//input[@value='1']")).click();
		
	}

}
