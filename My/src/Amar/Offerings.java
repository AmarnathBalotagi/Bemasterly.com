package Amar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Offerings {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions actions = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
			driver.get("https://prodtest4.bemasterly.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("Prodtest4");
			driver.findElement(By.id("password")).sendKeys("Genext@123");
			driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
			driver.findElement(By.xpath("//span[normalize-space()='Institute Setup']")).click();
			driver.findElement(By.xpath("//span[normalize-space()='Offerings']")).click();
			
			
			String[] off1 = {"JEE Demo",
					"NEET Demo",
					"JEE",
					"NEET",
					"MH-CET(Trial)",
					"MH-CET",
					};
			
			
			
			/*for (int i=0;i < off1.length;i++) {
			WebElement addOffering =driver.findElement(By.xpath("//a[normalize-space()='Add offerings']"));
			addOffering.click();
				
			Select selectExam = new Select(driver.findElement(By.id("examName")));
			selectExam.selectByVisibleText(off1[i]);
			Select selectMedium = new Select(driver.findElement(By.id("medium")));
			selectMedium.selectByIndex(1);
			Select selectStd = new Select(driver.findElement(By.id("standard")));
			selectStd.selectByIndex(1);
			WebElement selectSubject = driver.findElement(By.xpath("//div[@class='multiselect-dropdown']"));

	        selectSubject.click();
	        driver.findElement(By.xpath("//input[@placeholder='Search']")).click();
	        actions.sendKeys(Keys.TAB, Keys.SPACE).perform();;
	        
	    	driver.findElement(By.cssSelector("label[for='subject']")).click();
	       
	      WebElement save = driver.findElement(By.id("saveBtn"));
	      save.click();
	      System.out.println(off1[i]+" Created sucessfully ");
	     
			}*/
			
			//MHSB
			int k=0;
			String[] off2 = {"MHSB","MHSB (Trial)"};
			String[] std = {"X","IX"};
			for (int j=0;j < off2.length;j++) {
				
				WebElement addOffering =driver.findElement(By.xpath("//a[normalize-space()='Add offerings']"));
				addOffering.click();
					
				Select selectExam = new Select(driver.findElement(By.id("examName")));
				selectExam.selectByVisibleText(off2[j]);
				Select selectMedium = new Select(driver.findElement(By.id("medium")));
				selectMedium.selectByIndex(1);
				Select selectStd = new Select(driver.findElement(By.id("standard")));
				selectStd.selectByVisibleText(std[k]);
				WebElement selectSubject = driver.findElement(By.xpath("//div[@class='multiselect-dropdown']"));

		        selectSubject.click();
		        driver.findElement(By.xpath("//input[@placeholder='Search']")).click();
		        actions.sendKeys(Keys.TAB, Keys.SPACE).perform();;
		        
		    	driver.findElement(By.cssSelector("label[for='subject']")).click();
		       
		      WebElement save = driver.findElement(By.id("saveBtn"));
		      save.click();
		      k++;
		     
				}
	       
    }
}

