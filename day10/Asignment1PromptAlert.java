package selenium.homeassignment.day10;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asignment1PromptAlert 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize(); // maximize the page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys(Keys.CONTROL+"a"+ Keys.DELETE);
		prompt.sendKeys("Shakthi");
		prompt.accept();
		
		WebElement source = driver.findElement(By.xpath("//p[@id='demo']"));
		String fromSource = source.getText();
		
		if(fromSource.contains("Shakthi"))
			System.out.println("Yes! the source contains your name---" + fromSource);
		else
			System.out.println("No the source is not having your name");
			
	}

}
