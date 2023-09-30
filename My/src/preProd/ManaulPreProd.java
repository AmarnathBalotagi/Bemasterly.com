package preProd;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class ManaulPreProd {
	

	
		public static void main(String[] args) throws Throwable {
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Actions actions = new Actions(driver);
			String[] names = {
					"X Science-2 20M Online",
					"X Science-1 20M Online",
					"X Science-2 10M Online",
					"X Science-1 10M Online"
		
					};
			
				driver.get("https://caasinst4.padhaao.com/login");
				driver.manage().window().maximize();
				driver.findElement(By.id("username")).sendKeys("caasinst4");
				driver.findElement(By.id("password")).sendKeys("Genext@123");
				driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
				driver.findElement(By.xpath("//span[normalize-space()='TestPro']")).click();
				driver.findElement(By.xpath("//li[@data-content='Create Exam']//a[@class='nav-link']//*[name()='svg']")).click();
				
				int k=0;
				for (int j=1;j<4;j++) {

					
					
				
				
				//String name=names[k];
				driver.findElement(By.xpath("//input[@id='examname']")).sendKeys(names[k]);
				
				Select selectExam = new Select(driver.findElement(By.id("ExamType")));
				selectExam.selectByValue("18397");
				Thread.sleep(2000);
				k++;
				
				Select selectOfferings = new Select(driver.findElement(By.id("offerings")));
				selectOfferings.selectByValue("3_4");
				Thread.sleep(2000);
				
				WebElement BatchDropdown = driver.findElement(By.xpath("//div[@id='grade_student']//button[@title='None selected']"));
				BatchDropdown.click();
				 WebElement mshb10th = driver.findElement(By.xpath("//input[@value='301']"));
				 mshb10th.click();
				 
				Select selectMode = new Select(driver.findElement(By.id("test_mode")));
				selectMode.selectByVisibleText("Offline Assessment");
				Thread.sleep(3000);
				
				WebElement Manualgenerated = driver.findElement(By.xpath("(//div[@class='custom-control custom-radio d-flex align-items-center ml-3'])[1]"));
				Manualgenerated.click();
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,500)");
				Thread.sleep(2000);
				
				WebElement subjects = driver.findElement(By.xpath("(//button[@title='None selected'])[1]"));
				subjects.click();
				Thread.sleep(2000);
				
				actions.sendKeys(Keys.ARROW_DOWN, Keys.SPACE).perform();
				
				

				
			        
				
			        //String TemplateName = selectTemplate.toString();
			        //System.out.println("Selected option: " + TemplateName);
			    
				

				/*WebElement MonthlyPracticeTestMaths = driver.findElement(By.xpath("//option[@value='174']']"));
				MonthlyPracticeTestMaths.click();*/
				Thread.sleep(1000);
				
				//js.executeScript("window.scrollBy(0,500)");
				
				//driver.findElement(By.xpath("//div[@class='col-md-6 nomal_time anti_print_purpose']//label[@class='pt-3']")).click();
				Thread.sleep(1000);
				
				
				
				WebElement Chapter = driver.findElement(By.xpath("//input[@id='justAnInputBox1']"));
				Chapter.click();
				WebElement chooseChapter = driver.findElement(By.xpath("//span[normalize-space()='Chemistry']//input[@type='checkbox']"));
				chooseChapter.click();
				Thread.sleep(1000);
				WebElement Closedropdown = driver.findElement(By.xpath("//div[@class='col-md-6 nomal_time anti_print_purpose']//label[@class='pt-3']"));
				
				Closedropdown.click();
			    
				
				
				
				
				//System.out.println();
				
			  
			     WebElement marks = driver.findElement(By.id("marks"));
			     marks.sendKeys("800");
			     
			     WebElement time = driver.findElement(By.id("time"));
			     time.sendKeys("90");
			     
				WebElement ContinueBtn = driver.findElement(By.xpath("//button[@id='button_page_1']"));
				
				
				ContinueBtn.click();
				
				Thread.sleep(2000);
				
				
				WebElement addNew = driver.findElement(By.xpath("//button[normalize-space()='Add New']"));
			
				addNew.click();
				Thread.sleep(3000);
				List<WebElement> queCheck = driver.findElements(By.xpath("//label[contains(@for,'customCheck')]"));
				WebElement addContinue = driver.findElement(By.xpath("(//button[@id='qlAdd'])[1]"));
				System.out.println("Total no"+ queCheck.size());
				List<WebElement> pagination = driver.findElements(By.xpath("//li/a[contains(@href,'changeQue')]"));
				
				int p=1;
				for(int t=0;t<8;t++)
				{
					for (int i=0;i<queCheck.size();i++)
					{
					queCheck.get(i).click();
					
					//Thread.sleep(1000);
					if(i==20) {break;}
					
					}
					
					addContinue.click();
				pagination.get(p).click();
				
				p++;
				}
				
				
				/*WebElement AssignQP = driver.findElement(By.id("assign_qp_auto_generate_online"));
				//js.executeScript("window.scrollBy(300,600)");
				js.executeScript("arguments[0].scrollIntoView(true);", AssignQP);
				//js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
				
				//actions.click(AssignQP).perform();
				
				Thread.sleep(3000);
				js.executeScript("arguments[0].click();", AssignQP);
				//actions..click(AssignQP).perform();
				
					
				driver.navigate().back();
				driver.findElement(By.xpath("//li[@data-content='Create Exam']//a[@class='nav-link']//*[name()='svg']")).click();
				*/
			
				}
			}

}
