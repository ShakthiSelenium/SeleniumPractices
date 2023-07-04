package selenium.homeassignment.day10;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().window().maximize(); // maximize the page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Simple Alert
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		Alert simple = driver.switchTo().alert();
		String text = simple.getText();
		System.out.println("Text From Simple Alert--"+text);
		simple.accept();
		Thread.sleep(3000);
		//Confirm Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		Alert confirm = driver.switchTo().alert();
		String text1 = confirm.getText();
		System.out.println("Text From Confirm Alert--"+text1);
		confirm.dismiss();
		Thread.sleep(3000);
		
		//Sweet Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click(); //Dismiss
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		
		//Sweet Modal Dialog
		driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@aria-label='Close'])[2]")).click();
		
		//Prompt alert 
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("From Selenium");
		prompt.accept();
		
		////Sweet Alert Confirmation
		driver.findElement(By.xpath("(//span[text()='Delete'])")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='Yes'])")).click();
		
		//Minimize and Maximize
		driver.findElement(By.xpath("(//button[contains(@class,'ui-button-outlined')]/span[text()='Show'])[2]")).click();
		driver.findElement(By.xpath("//span[contains(@class,'icon-minus')]")).click();
		driver.findElement(By.xpath("//span[contains(@class,'ui-icon-plus')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(@class,'ui-icon-extlink')]")).click();
		driver.findElement(By.xpath("(//span[contains(@class,'ui-icon-closethick')])[3]")).click();
		//driver.close();
		
		}
}