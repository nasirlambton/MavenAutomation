package com.test.MavenPgm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragDrop {
	
	WebDriver driver;
	
	@BeforeClass
	public void Initalization()
	{
 driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
	}

	@Test
	public void Test1(){
		// TODO Auto-generated method stub
		

		
		WebElement src = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		
		WebElement target = driver.findElement(By.id("bank"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(src, target).perform();
		
		WebElement src1 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement target1 = driver.findElement(By.id("amt7"));
		act.dragAndDrop(src1, target1).perform();
		
		WebElement src2 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement target2 = driver.findElement(By.id("loan"));
		act.dragAndDrop(src2, target2).perform();
		
		WebElement src3 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement target3 = driver.findElement(By.id("amt8"));
		act.dragAndDrop(src3, target3).perform();
		
		if(driver.findElement(By.xpath("//a[contains(text(),'Perfect!')]")).getText().contains("Perfect!")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
			
		
	}
	
	@Test
	public void Test2(){
		// TODO Auto-generated method stub

		
		WebElement src = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		
		WebElement target = driver.findElement(By.id("bank"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(src, target).perform();
		
		WebElement src1 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement target1 = driver.findElement(By.id("amt7"));
		act.dragAndDrop(src1, target1).perform();
		
		WebElement src2 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement target2 = driver.findElement(By.id("loan"));
		act.dragAndDrop(src2, target2).perform();
		
		WebElement src3 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement target3 = driver.findElement(By.id("amt8"));
		act.dragAndDrop(src3, target3).perform();
		
		if(driver.findElement(By.xpath("//a[contains(text(),'Perfect!')]")).getText().contains("Perfect!")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		
		
	}
	
	
	@Test
	public void Test3(){
		// TODO Auto-generated method stub
		

		
		WebElement src = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		
		WebElement target = driver.findElement(By.id("bank"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(src, target).perform();
		
		WebElement src1 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement target1 = driver.findElement(By.id("amt7"));
		act.dragAndDrop(src1, target1).perform();
		
		WebElement src2 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement target2 = driver.findElement(By.id("loan"));
		act.dragAndDrop(src2, target2).perform();
		
		WebElement src3 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement target3 = driver.findElement(By.id("amt8"));
		act.dragAndDrop(src3, target3).perform();
		
		if(driver.findElement(By.xpath("//a[contains(text(),'Perfect!')]")).getText().contains("Perfect!")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		
		
	}
	
	@AfterClass
	public void CleanUp()
	{
		driver.quit();
	}

}
