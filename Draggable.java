package week3day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draggable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//builder.dragAndDrop(source,target).perform();
		// builder.dragAndDropBy(drag, 100, 100).perform();
		WebElement frame1=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame1);
		WebElement drag=driver.findElement(By.id("draggable"));
		Actions builder=new Actions(driver);
		builder.dragAndDropBy(drag, 100, 100).perform();
		

	}

}
