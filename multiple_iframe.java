package IFrames;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Frames {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		

		driver.findElement(By.xpath("//section[.='Frames']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[.='iframes']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Multiple iframe")).click();
		Thread.sleep(2000);
		
		//Switch to frames
		 driver.switchTo().frame(1);
		
		 //driver.findElement(By.id("username")).sendKeys("Shabin");
		 //Thread.sleep(2000);
		 
		 driver.findElement(By.cssSelector("[id='email']")).sendKeys("Shabin@gmail.com");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.cssSelector("[id='password']")).sendKeys("Shabin4gy");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.cssSelector("[type='submit']")).click();

}
}
