package week3day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement frame1=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame1);
		//builder.clickAndHold(item1).moveToElement(item5).release().perform();

		//builder.keyDown(Keys.CONTROL).click(item1).click(item5).click(item3).keyUp		(Keys.CONTROL).perform();
         WebElement item1=driver.findElement(By.xpath("//ol[@id='selectable']/li[1]"));
         WebElement item2=driver.findElement(By.xpath("//ol[@id='selectable']/li[2]"));
         WebElement item3=driver.findElement(By.xpath("//ol[@id='selectable']/li[3]"));
         WebElement item4=driver.findElement(By.xpath("//ol[@id='selectable']/li[4]"));
         WebElement item5=driver.findElement(By.xpath("//ol[@id='selectable']/li[5]"));
         WebElement item6=driver.findElement(By.xpath("//ol[@id='selectable']/li[6]"));
         WebElement item7=driver.findElement(By.xpath("//ol[@id='selectable']/li[7]"));
         Actions builder=new Actions(driver);
         //builder.keyDown(Keys.CONTROL).click(item1).click(item5).click(item3).keyUp	.(Keys.CONTROL).perform();
         builder.clickAndHold(item1).moveToElement(item5).release().perform();
	}

}
