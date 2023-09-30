package Amar;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MhsbPdf {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		String[] names = { 


				"10th Geography 1",
				"10th Geography 2",
				"10th Geography 3",
				"10th Geography 4",
				"10th Geography 5",
				"10th Geography 6",
				"10th Geography 7",
				"10th Geography 8",
				"10th Geography 9",
				"10th Geography 10"
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
			selectExam.selectByValue("15584");
			Thread.sleep(2000);
			
			
			Select selectOfferings = new Select(driver.findElement(By.id("offerings")));
			selectOfferings.selectByValue("8_10");
			Thread.sleep(2000);
			
			WebElement BatchDropdown = driver.findElement(By.xpath("//div[@id='grade_student']//button[@title='None selected']"));
			BatchDropdown.click();
			 WebElement mshb10th = driver.findElement(By.xpath("//input[@value='1707']"));
			 mshb10th.click();
			 
			Select selectMode = new Select(driver.findElement(By.id("test_mode")));
			selectMode.selectByVisibleText("Offline Assessment");
			
			
			Thread.sleep(2000);
			WebElement TemplateDropdown = driver.findElement(By.id("template"));
			TemplateDropdown.click();
			
			Select selectTemplate = new Select(TemplateDropdown);
			selectTemplate.selectByValue("330");
			
			Thread.sleep(5000);
			js.executeScript("window.scrollBy(0,600)");
			Thread.sleep(2000);
			WebElement Chapter = driver.findElement(By.xpath("//button[@title='None selected']"));
			try {
				 Chapter.click(); 
		      } catch (StaleElementReferenceException e) {
		    	  Chapter.click(); 
		      }
			
			
			
			actions.sendKeys(Keys.ARROW_DOWN).perform();
			
		    Select selectChapter = new Select(driver.findElement(By.id("chapter")));
			
			List<WebElement> elementCount = selectChapter.getOptions();
			
			System.out.println("Number of items: " + elementCount.size());
			 for(int i=0;i<elementCount.size();i++) 
		    	{
		    	actions.sendKeys(Keys.ARROW_DOWN, Keys.SPACE).perform();
				}
			
			
		
			//actions.sendKeys(Keys.ESCAPE).build().perform();
			
			//js.executeScript("window.scrollBy(0,600)");
			
			//driver.findElement(By.xpath("//div[@class='col-md-6 nomal_time anti_print_purpose']//label[@class='pt-3']")).click();
			Thread.sleep(2000);
			

			WebElement ContinueBtn = driver.findElement(By.xpath("//button[@id='button_page_1']"));
			Thread.sleep(1000);
			
			ContinueBtn.click();
			Thread.sleep(3000);
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


