package preProd;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mhsb9th {
	
	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;

		String[] names = {"X Geo 20M Online Test",
				"X Algebra 20M OnlTest",
				"X Geo Const Test 20M",
				"X Geo 10M OnlTest",
				"T001",
				"T002",
				"T003",
				"T004",
				"T005",
				"T006"
				
				};
		
			driver.get("https://caasinst4.padhaao.com/login");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("caasinst4");
			driver.findElement(By.id("password")).sendKeys("Genext@123");
			driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
			driver.findElement(By.xpath("//li[@class='nk-menu-item']//a[@class='nk-menu-link ']")).click();
			driver.findElement(By.xpath("//li[@data-content='Create Exam']//a[@class='nav-link']//*[name()='svg']")).click();
			Actions actions = new Actions(driver);
			int k=0;
			for (int j=2;j<29;j++){

				
			
			//String name=names[k];
			driver.findElement(By.xpath("//input[@id='examname']")).sendKeys(names[k]);
			
			Select selectExam = new Select(driver.findElement(By.id("ExamType")));
			selectExam.selectByValue("15584");
			Thread.sleep(2000);
			k++;
			
			Select selectOfferings = new Select(driver.findElement(By.id("offerings")));
			selectOfferings.selectByValue("8_9");
			Thread.sleep(2000);
			
			WebElement BatchDropdown = driver.findElement(By.xpath("//div[@id='grade_student']//button[@title='None selected']"));
			BatchDropdown.click();
			 WebElement mshb9th = driver.findElement(By.xpath("//input[@value='304']"));
			 mshb9th.click();
			 
			Select selectMode = new Select(driver.findElement(By.id("test_mode")));
			selectMode.selectByVisibleText("Offline Assessment");
			
			
			Thread.sleep(2000);
			WebElement TemplateDropdown = driver.findElement(By.id("template"));
			TemplateDropdown.click();
			
			Select selectTemplate = new Select(TemplateDropdown);
			//selectTemplate.selectByValue("174");
			List<WebElement> Templates = selectTemplate.getOptions();

			
			try {
				selectTemplate.selectByIndex(j);
				actions.click().perform();
		      } catch (StaleElementReferenceException e) {
		    	  selectTemplate.selectByIndex(j); 
		    	  actions.click().perform();
		      }
			
			//actions.sendKeys(Keys.ENTER).perform();

		        //String TemplateName = selectTemplate.toString();
		        //System.out.println("Selected option: " + TemplateName);
		    
			

			/*WebElement MonthlyPracticeTestMaths = driver.findElement(By.xpath("//option[@value='174']']"));
			MonthlyPracticeTestMaths.click();*/
			Thread.sleep(2000);
			
			js.executeScript("window.scrollBy(0,500)");
			
			
			//driver.findElement(By.xpath("//body/div[@class='wrapper']/div[@class='wrapper']/div[@class='content-wrapper']/section[@class='content']/div[@class='container-fluid']/div[@class='row']/section[@class='col-lg-9']/div[@class='card animated-slow slideUp']/form[@id='page_1']/div[@class='card-body pt-2']/div[@class='row']/div[@class='col-md-6 homework form-group pb-2']/div[@class='form-group pt-3 border-top custSelectColor']/label[1]")).click();
			Thread.sleep(3000);
			
			
			
			WebElement Chapter = driver.findElement(By.xpath("//input[@id='justAnInputBox1']"));
			try {
				 Chapter.click(); 
		      } catch (StaleElementReferenceException e) {
		    	  Chapter.click(); 
		      }
			/**/
			
			
			actions.sendKeys(Keys.ARROW_DOWN).perform();
			
		    Select selectChapter = new Select(driver.findElement(By.id("justAnInputBox1")));
			
			List<WebElement> elementCount = selectChapter.getOptions();
			
			System.out.println("Number of items: " + elementCount.size());
			
			
			
			//System.out.println();
			
		    for(int i=0;i<elementCount.size();i++) 
		    	{
		    	actions.sendKeys(Keys.ARROW_DOWN, Keys.SPACE).perform();
				}
		    
			WebElement ContinueBtn = driver.findElement(By.xpath("//button[@id='button_page_1']"));
			Thread.sleep(3000);
			
			ContinueBtn.click();
			Thread.sleep(3000);
			WebElement AssignQP = driver.findElement(By.id("assign_qp_auto_generate"));
			//js.executeScript("window.scrollBy(300,600)");
			js.executeScript("arguments[0].scrollIntoView(true);", AssignQP);
			//js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
			
			//actions.click(AssignQP).perform();
			
			
			js.executeScript("arguments[0].click();", AssignQP);
			//actions..click(AssignQP).perform();
			
				
			driver.navigate().back();
			driver.findElement(By.xpath("//li[@data-content='Create Exam']//a[@class='nav-link']//*[name()='svg']")).click();
			
		
			}
		}


}
