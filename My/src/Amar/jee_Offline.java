package Amar;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class jee_Offline {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		String[] names = {
				 "Monthly Practice Test Mat",
				 "Monthly Practice Test Che", 
				 "Monthly Practice Test Phy", 
				 "Weekly Practice Test Mat", 
				 "Weekly Practice Test Che", 
				 "Weekly Practice Test Phy", 
				 "Full Subject Test Maths", 
				 "Full Subject Test Phys", 
				 "Full Mock Test", 
				 "Daily Practice Test Mat", 
				 "Daily Practice Test Che", 
				 "Daily Practice Test Phy", 
				 "Full Subject Test Chem"
				};
		
			driver.get("https://prodtest21.bemasterly.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("Prodtest21");
			driver.findElement(By.id("password")).sendKeys("Genext@123");
			driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
			driver.findElement(By.xpath("//span[normalize-space()='TestPro']")).click();
			driver.findElement(By.xpath("//li[@data-content='Create Exam']//a[@class='nav-link']//*[name()='svg']")).click();
			
			int k=0;
			for (int j=0;j<14;j++) {

			
			//String name=names[k];
			driver.findElement(By.xpath("//input[@id='examname']")).sendKeys(names[k]);
			
			Select selectExam = new Select(driver.findElement(By.id("ExamType")));
			selectExam.selectByValue("18397");
			Thread.sleep(2000);
			k++;
			System.out.println(names[k]);
			
			Select selectOfferings = new Select(driver.findElement(By.id("offerings")));
			selectOfferings.selectByValue("3_4");
			Thread.sleep(2000);
			
			WebElement BatchDropdown = driver.findElement(By.xpath("//div[@id='grade_student']//button[@title='None selected']"));
			BatchDropdown.click();
			 WebElement JeeMains = driver.findElement(By.xpath("//input[@value='1063']"));
			 JeeMains.click();
			 
			Select selectMode = new Select(driver.findElement(By.id("test_mode")));
			selectMode.selectByVisibleText("Offline Assessment");
			
			
			Thread.sleep(2000);
			WebElement TemplateDropdown = driver.findElement(By.id("template"));
			TemplateDropdown.click();
			
			Select selectTemplate = new Select(TemplateDropdown);
			//selectTemplate.selectByValue("174");
			List<WebElement> Templates = selectTemplate.getOptions();

			
		        
		        selectTemplate.selectByIndex(j);
		        //String TemplateName = selectTemplate.toString();
		        //System.out.println("Selected option: " + TemplateName);
		    
			

			/*WebElement MonthlyPracticeTestMaths = driver.findElement(By.xpath("//option[@value='174']']"));
			MonthlyPracticeTestMaths.click();*/
			Thread.sleep(1000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@class='col-md-6 nomal_time anti_print_purpose']//label[@class='pt-3']")).click();
			Thread.sleep(1000);
			
			
			
			WebElement Chapter = driver.findElement(By.xpath("//button[@title='None selected']"));
			Chapter.click();
			Actions actions = new Actions(driver);
			actions.sendKeys(Keys.ARROW_DOWN).perform();
			
		    Select selectChapter = new Select(driver.findElement(By.id("chapter")));
			
			List<WebElement> elementCount = selectChapter.getOptions();
			
			System.out.println("Number of items: " + elementCount.size());
			
			
			
			//System.out.println();
			
		    for(int i=0;i<elementCount.size();i++) 
		    	{
		    	actions.sendKeys(Keys.ARROW_DOWN, Keys.SPACE).perform();
				}
			WebElement ContinueBtn = driver.findElement(By.xpath("//button[@id='button_page_1']"));
			
			
			ContinueBtn.click();
			Thread.sleep(3000);
			WebElement AssignQP = driver.findElement(By.id("assign_qp_auto_generate"));
			//js.executeScript("window.scrollBy(300,600)");
			js.executeScript("arguments[0].scrollIntoView(true);", AssignQP);
			//js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
			
			//actions.click(AssignQP).perform();
			
			Thread.sleep(3000);
			js.executeScript("arguments[0].click();", AssignQP);
			//actions..click(AssignQP).perform();
			
				
			driver.navigate().back();
			driver.findElement(By.xpath("//li[@data-content='Create Exam']//a[@class='nav-link']//*[name()='svg']")).click();
			
		
			}
		}

	
			
			
		
			
			
			
			
			
		

	}


