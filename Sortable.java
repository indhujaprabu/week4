package week3day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement frame1=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame1);
		
	//WebElement list1=driver.findElement(By.xpath("//ul[@id='sortable']/li[1]"));
	WebElement list2=driver.findElement(By.xpath("//ul[@id='sortable']/li[2]"));
	//WebElement list3=driver.findElement(By.xpath("//ul[@id='sortable']/li[3]"));
	WebElement list4=driver.findElement(By.xpath("//ul[@id='sortable']/li[4]"));
	//WebElement list5=driver.findElement(By.xpath("//ul[@id='sortable']/li[5]"));
	//WebElement list6=driver.findElement(By.xpath("//ul[@id='sortable']/li[6]"));
	Actions builder=new Actions(driver);
	builder.click(list4).clickAndHold().moveToElement(list2).moveByOffset(0,10).release().build().perform();

	
	}

}
