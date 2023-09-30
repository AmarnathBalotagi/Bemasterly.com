package Amar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class student_Bulk {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		String[] names = {"Dave", "Paul", "Susan", "Mike"};
		int Num = 200;
		
			driver.get("https://prodtest4.bemasterly.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("prodtest4");
			driver.findElement(By.id("password")).sendKeys("Genext@123");
			driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
			driver.findElement(By.xpath("//span[normalize-space()='Institute Setup']")).click();
			driver.findElement(By.xpath("//span[normalize-space()='Students']")).click();
			WebElement AddStudent = driver.findElement(By.xpath("//a[@class='btn btn-primary1 ml-md-2']"));
			AddStudent.click();
			
			for (int i = 0; i < names.length; i++) {
				
			String name=names[i];
			WebElement Student_Name = driver.findElement(By.id("first_name"));
			Student_Name.sendKeys(name);
			System.out.println(name);
			
			
			String Roll = String.valueOf(Num);
			
			WebElement RollNo = driver.findElement(By.id("roll_no"));
			RollNo.sendKeys(Roll);
			Num++;
			
			
			//Thread.sleep(50000);
			//driver.quit();
			WebElement MobileNo = driver.findElement(By.id("mobileid"));
			MobileNo.sendKeys("1234567890");
			WebElement Email = driver.findElement(By.xpath("//input[@name='email']"));
			Email.sendKeys("Karan@gamil.com");
			Select Gender = new Select(driver.findElement(By.id("default-06")));
			Gender.selectByValue("Male");
			js.executeScript("window.scrollBy(0,400)");
			WebElement ParentFisrtName = driver.findElement(By.xpath("(//input[@id='lname'])[1]"));
			ParentFisrtName.sendKeys("Mohan");
			WebElement ParentLastName = driver.findElement(By.xpath("(//input[@id='lname'])[2]"));
			ParentLastName.sendKeys("Sharma");
			Select Relation = new Select(driver.findElement(By.name("parent_relationship[]")));
			Relation.selectByValue("Father");
			WebElement ParentEmail = driver.findElement(By.id("parent_email"));
			ParentEmail.sendKeys("Karan@gamil.com");
			WebElement ParentMobileNo = driver.findElement(By.id("parent_mobile"));
			ParentMobileNo.sendKeys("1234567890");
			js.executeScript("window.scrollBy(0,800)");
			
			WebElement Address = driver.findElement(By.name("add1"));
			Address.sendKeys("Lower Parel");
			WebElement Pincode = driver.findElement(By.name("pincode"));
			Pincode.sendKeys("400013");
			Select State = new Select(driver.findElement(By.id("state")));
			State.selectByVisibleText("Maharashtra");
			try {
				Select City = new Select(driver.findElement(By.id("city")));
				City.selectByVisibleText("Mumbai");
		      } catch (StaleElementReferenceException e) {
		    	  Select City = new Select(driver.findElement(By.id("city")));
					City.selectByVisibleText("Mumbai");
		      }
			
			
			driver.findElement(By.id("form_submit")).click();
			
			driver.findElement(By.xpath("//a[@class='btn btn-primary1 ml-md-2']")).click();
			
			}
			
	}
	
	}

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
		


