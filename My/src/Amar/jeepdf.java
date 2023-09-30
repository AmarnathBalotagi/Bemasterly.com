package Amar;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class jeepdf {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		String[] names = { 
				 "MHCET Bio 1", "MHCET Bio 2", 
				 "MHCET Bio 3", "MHCET Bio 4", 
				 "MHCET Bio 5", "MHCET Bio 6", 
				 "MHCET Bio 7", "MHCET Bio 8", 
				 "MHCET Bio 9", "MHCET Bio 10"
						};
		
		
			driver.get("https://prodtest21.bemasterly.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("Prodtest21");
			driver.findElement(By.id("password")).sendKeys("Genext@123");
			driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
			driver.findElement(By.xpath("//span[normalize-space()='TestPro']")).click();
			driver.findElement(By.xpath("//li[@data-content='Create Exam']//a[@class='nav-link']//*[name()='svg']")).click();
			Actions actions = new Actions(driver);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			int k=0;
			for (int j=1;j<50;j++){
			
			//String name=names[k];
			driver.findElement(By.xpath("//input[@id='examname']")).sendKeys(names[k]);
			
			Select selectExam = new Select(driver.findElement(By.id("ExamType")));
			selectExam.selectByValue("17574");
			Thread.sleep(2000);
			
			
			Select selectOfferings = new Select(driver.findElement(By.id("offerings")));
			selectOfferings.selectByValue("35_36");
			Thread.sleep(2000);
			
			WebElement BatchDropdown = driver.findElement(By.xpath("//div[@id='grade_student']//button[@title='None selected']"));
			BatchDropdown.click();
			 WebElement mshb9th = driver.findElement(By.xpath("//input[@value='2794']"));
			 mshb9th.click();
			 
			Select selectMode = new Select(driver.findElement(By.id("test_mode")));
			selectMode.selectByVisibleText("Offline Assessment");
			
			
			Thread.sleep(2000);
			WebElement TemplateDropdown = driver.findElement(By.id("template"));
			TemplateDropdown.click();
			
			Select selectTemplate = new Select(TemplateDropdown);
			selectTemplate.selectByValue("395");
			
			
			Thread.sleep(1000);
			//actions.sendKeys(Keys.ESCAPE).build().perform();
			
			js.executeScript("window.scrollBy(0,600)");
			
			//driver.findElement(By.xpath("//div[@class='col-md-6 nomal_time anti_print_purpose']//label[@class='pt-3']")).click();
			Thread.sleep(2000);
			

			WebElement ContinueBtn = driver.findElement(By.xpath("//button[@id='button_page_1']"));
			Thread.sleep(3000);
			
			ContinueBtn.click();
			Thread.sleep(20000);
			//js.executeScript("window.scrollBy(0,700)");
			//actions.sendKeys(Keys.ARROW_DOWN).perform();
//			WebElement elementbox = driver.findElement(By.xpath("//select[@id='layoutSelector']"));
//	
//			//actions.moveToElement(elementbox).perform();
//			//WebElement link = driver.findElement(By.id("link15"));
//		//	wait.until(ExpectedConditions.presenceOfElementLocated((By) link));
//			
//			js.executeScript("arguments[0].scrollIntoView(true);", elementbox);
//			//js.executeScript("window.scrollBy(0,700)");
//			
//			Select layout = new Select(driver.findElement(By.id("layoutSelector")));
//			layout.selectByValue("split");
//			Thread.sleep(2000);
			
			
			WebElement AssignQP = driver.findElement(By.id("assign_qp_auto_generate"));
			//js.executeScript("window.scrollBy(300,600)");
			js.executeScript("arguments[0].scrollIntoView(true);", AssignQP);
			//js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
			
			//actions.click(AssignQP).perform();
			
			
			js.executeScript("arguments[0].click();", AssignQP);
			//actions..click(AssignQP).perform();
			
			System.out.println(names[k]);
			k++;
			driver.navigate().back();
			driver.findElement(By.xpath("//li[@data-content='Create Exam']//a[@class='nav-link']//*[name()='svg']")).click();
			
			}
		}


	}

//"Neet Exam 1", "Neet Exam 2", "Neet Exam 3", "Neet Exam 4",
//"Neet Exam 5", "Neet Exam 6", "Neet Exam 7", "Neet Exam 8", "Neet Exam 9",
//"Neet Exam 10", "Neet Exam 11", "Neet Exam 12", "Neet Exam 13", "Neet Exam 14",
//"Neet Exam 15", "Neet Exam 16", "Neet Exam 17", "Neet Exam 18", "Neet Exam 19",
//"Neet Exam 20", "Neet Exam 21", "Neet Exam 22", "Neet Exam 23", "Neet Exam 24",
//"Neet Exam 25"
/*"Jee Exam 1", "Jee Exam 2", "Jee Exam 3", "Jee Exam 4",
				"Jee Exam 5", "Jee Exam 6", "Jee Exam 7", "Jee Exam 8", "Jee Exam 9",
				"Jee Exam 10", "Jee Exam 11", "Jee Exam 12", "Jee Exam 13", "Jee Exam 14",
				"Jee Exam 15", "Jee Exam 16", "Jee Exam 17", "Jee Exam 18", "Jee Exam 19",
				"Jee Exam 20", "Jee Exam 21", "Jee Exam 22", "Jee Exam 23", "Jee Exam 24",
				"Jee Exam 25", "Jee Exam 26", "Jee Exam 27", "Jee Exam 28", "Jee Exam 29",
				"Jee Exam 30", "Jee Exam 31", "Jee Exam 32", "Jee Exam 33", "Jee Exam 34",
				"Jee Exam 35", "Jee Exam 36", "Jee Exam 37", "Jee Exam 38", "Jee Exam 39",
				"Jee Exam 40", "Jee Exam 41", "Jee Exam 42", "Jee Exam 43", "Jee Exam 44",
				"Jee Exam 45", "Jee Exam 46", "Jee Exam 47", "Jee Exam 48", "Jee Exam 49",
				"Jee Exam 50"*/


