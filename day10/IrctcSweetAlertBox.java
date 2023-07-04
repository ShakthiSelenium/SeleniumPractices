package selenium.homeassignment.day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IrctcSweetAlertBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(op);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize(); // maximize the page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//input[@role='searchbox'])[1]")).sendKeys("MAS");
		driver.findElement(By.xpath("//span[text()='MGR CHENNAI CTL - MAS']")).click();
		driver.findElement(By.xpath("(//input[@role='searchbox'])[2]")).sendKeys("Cape");
		driver.findElement(By.xpath("//span[text()='KANYAKUMARI - CAPE']")).click();
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Refresh')]")).click();
		driver.findElement(By.xpath("//div[contains(@class,'WL col-xs')]/strong")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Book Now')]")).click();
		
		driver.findElement(By.xpath("(//span[contains(text(),'No')])[4]")).click();
	}

}
