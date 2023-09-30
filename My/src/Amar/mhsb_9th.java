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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;




public class mhsb_9th {
// MHSB 10th
	public static void main(String[] args) throws Throwable {
		
	WebDriver driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	String[] names = {"X Geo 20M Online Test",
			"X Algebra 20M OnlTest",
			"X Geo Const Test 20M",
			"X Geo 10M OnlTest",
			"X Algebra 10M OnlTest",
			"X Eng Kumarbharati(BS)80m",
			"English Board Style",
			"X Algebra Test 20M",
			"Eng (PPG)UT",
			"Eng(PPW) UT",
			"X Eng(PPW)Unit 20m",
			"X-Eng(PPG)Unit-20m",
			"X ENG LATEST (WS)-20",
			"X ENG LATEST (GRAMMAR)-20",
			"X Geo Test 20M",
			"X Algebra MCQ Test 10M",
			"X Algebra Board Pat 40M",
			"X Sci & Tech 1 Board Pat 40M",
			"X Geo Board Pat 40 M",
			"X Sci & Tech 2 Board Pat 40M",
			"X Geo Unit Test 20M",
			"X Sci & Tech 2 Test 20M",
			"X Sci & Tech 2 MCQ Test 10M",
			"X Geo MCQ Test -10 M",
			"X Sci & Tech 1 -Test-20M",
			"X Sci & Tech 1 -MCQ Test 10M",
			"X Algebra Unit Test 20M",
			};
	
		driver.get("https://prodtest21.bemasterly.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Prodtest21");
		driver.findElement(By.id("password")).sendKeys("Genext@123");
		driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='TestPro']")).click();
		driver.findElement(By.xpath("//li[@data-content='Create Exam']//a[@class='nav-link']//*[name()='svg']")).click();
		Actions actions = new Actions(driver);
		int k=5;
		for (int j=6;j<29;j++){

			
		
		//String name=names[k];
		driver.findElement(By.xpath("//input[@id='examname']")).sendKeys(names[k]);
		
		Select selectExam = new Select(driver.findElement(By.id("ExamType")));
		selectExam.selectByValue("15584");
		Thread.sleep(2000);
		k++;
		
		Select selectOfferings = new Select(driver.findElement(By.id("offerings")));
		selectOfferings.selectByValue("8_10");
		Thread.sleep(2000);
		
		WebElement BatchDropdown = driver.findElement(By.xpath("//div[@id='grade_student']//button[@title='None selected']"));
		BatchDropdown.click();
		 WebElement mshb9th = driver.findElement(By.xpath("//input[@value='1065']"));
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
	      } catch (StaleElementReferenceException e) {
	    	  selectTemplate.selectByIndex(j); 
	      }
		
		//actions.sendKeys(Keys.ENTER).perform();

	        //String TemplateName = selectTemplate.toString();
	        //System.out.println("Selected option: " + TemplateName);
	    
		

		/*WebElement MonthlyPracticeTestMaths = driver.findElement(By.xpath("//option[@value='174']']"));
		MonthlyPracticeTestMaths.click();*/
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		
		//driver.findElement(By.xpath("//div[@class='col-md-6 nomal_time anti_print_purpose']//label[@class='pt-3']")).click();
		Thread.sleep(4000);
		
		
		
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
		//Assign_Que_Paper.click();
		
	
		
		/*Object ChapterBox = driver.findElement(By.xpath("//ul[@class='multiselect-container dropdown-menu show']"));
		//actions.click();
		WebElement element = driver.findElement(By.xpath("//label[normalize-space()='2 - Pythagoras Theorem']"));
		
	    Point location = element.getLocation();
		int x = location.getX();
		int y = location.getY();
		System.out.println(x);
		System.out.println(y);
		//563  703   --1
		//563  735   --2
		for(int l=1;l<6;l++) {
			
		int t = 105;
		actions.moveByOffset(170, 105).click().perform();
		t=t+32;
		}
		
		
		//Chapter.sendKeys(Keys.ARROW_DOWN);
		//Chapter.sendKeys(Keys.ARROW_DOWN);
		//Chapter.sendKeys(Keys.ENTER);*/
		
	
		
	
		/*String[] names = {"X Geo 20M Online Test",
				"X Algebra 20M OnlTest",
				"X Geo Const Test 20M",
				"X Geo 10M OnlTest",
				"X Eng Kumarbharati(BS)80m",
				"English Board Style",
				"X Algebra Test 20M",
				"Eng (PPG)UT",
				"Eng(PPW) UT",
				"X Eng(PPW)Unit 20m",
				"X-Eng(PPG)Unit-20m",
				"X ENG LATEST (WS)-20",
				"X ENG LATEST (GRAMMAR)-20",
				"X Geo Test 20M",
				"X Algebra MCQ Test 10M",
				"X Algebra Board Pat 40M",
				"X Sci & Tech 1 Board Pat 40M",
				"X Geo Board Pat 40 M",
				"X Sci & Tech 2 Board Pat 40M",
				"X Geo Unit Test 20M",
				"X Sci & Tech 2 Test 20M",
				"X Sci & Tech 2 MCQ Test 10M",
				"X Geo MCQ Test -10 M",
				"X Sci & Tech 1 -Test-20M",
				"X Sci & Tech 1 -MCQ Test 10M",
				"X Algebra Unit Test 20M",
				};*/
		
		
		
		
		
		//Select selectchapter = new Select(ChapterDropdown);
		/*List<WebElement> Chapter = ChapterDropdown.findElements(By.tagName("li"));
		
		for (WebElement option : Chapter) {
		    String text = option.getText();
		    System.out.println(text);
		}*/
		

