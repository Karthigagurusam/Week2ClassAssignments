package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//We have to call WDM for the browser driver
				WebDriverManager.chromedriver().setup(); //verifies the version , download, set up

				//Launch the Chrome Browser
				ChromeDriver driver1 = new ChromeDriver();

				//1. Launch URL "http://leaftaps.com/opentaps/control/login"
				driver1.get("http://leaftaps.com/opentaps");

				//Maximize the browser
				driver1.manage().window().maximize();

				//2. Enter UserName and Password Using Id Locator
				driver1.findElement(By.id("username")).sendKeys("demosalesmanager");
				driver1.findElement(By.id("password")).sendKeys("crmsfa");

				// 3. Click on Login Button using Class Locator
				driver1.findElement(By.className("decorativeSubmit")).click();
				
			
				//4. Click on CRM/SFA
				driver1.findElement(By.linkText("CRM/SFA")).click();

				//5. Click on Leads Button
				driver1.findElement(By.linkText("Leads")).click();

				//6. Click on Create Lead 
				driver1.findElement(By.linkText("Create Lead")).click();

				// 7. Enter CompanyName Field Using id Locator
				driver1.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
				
				//8.Enter the first name using id locator
				driver1.findElement(By.id("createLeadForm_firstName")).sendKeys("Karthiga");
				
				//9.Enter the Last name using id locator
				driver1.findElement(By.id("createLeadForm_Lastname")).sendKeys("gurusamy");
				
				//10. Enter FirstName(Local) Field Using id Locator
				driver1.findElement(By.id("createLeadform_firstNamelocal")).sendKeys();
	
				//11. Enter Department Field Using any Locator of Your Choice
				driver1.findElement(By.id("createLeadForm_DepartmentName")).sendKeys("CSE");
			
				 // 12. Enter Description Field Using any Locator of your choice 
				driver1.findElement(By.id("createLeadform_DescriptionField")).sendKeys("Love coding");
				
				 // 13. Enter your email in the E-mail address Field using the locator of your choice
				driver1.findElement(By.id("createLeadform_EmailAddress")).sendKeys("gkarthigaguru@gmail.com");
				
				 // 14. Select State/Province as NewYork Using Visible Text
				WebElement dropdown1=driver1.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				Select select = new Select(dropdown1);
				select.selectByVisibleText("New York");

				 // 15. Click on Create Button
				driver1.findElement(By.className("smallSubmit")).click();
				
		             //     16. Get the Title of Resulting Page using driver.getTitle()
				String str = driver1.getTitle();
				if(str.equalsIgnoreCase("View Lead | opentaps CRM")) {
					System.out.println("Title: " +str);
				}
				else {
					System.out.println("Title not Found");
				}
				System.out.println("Lead Created Successfully");
				
		              //    17. Click on Duplicate button
				driver1.findElement(By.linkText("Duplicate Lead")).click();
		               //   18. Clear the CompanyName Field using .clear() And Enter new CompanyName
				WebElement m = driver1.findElement(By.id("createLeadForm_companyName"));
				m.clear();
				m.sendKeys("Amazon");
				//driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");
		               //   19.Clear the FirstName Field using .clear() And Enter new FirstName
				WebElement n = driver1.findElement(By.id("createLeadForm_firstName"));
				n.clear();
				n.sendKeys("Karthiga");
				//driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Karthiga");
				
		               //   20.Click on Create Lead Button
				driver1.findElement(By.className("smallSubmit")).click();
				
		                //  21. Get the Title of Resulting Page using driver.getTitle()
				String title = driver1.getTitle();
				if(title.equalsIgnoreCase("View Lead | opentaps CRM")) {
					System.out.println("Title: " +title);
				}
				else {
					System.out.println("Title not Found");
				}
				System.out.println("Lead Duplicated Successfully");
	}

}

