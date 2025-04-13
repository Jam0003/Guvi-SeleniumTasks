package SeleniumTask2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task3GuviRegistration
{
    public static void main(String[] args) throws InterruptedException {
    	
       
        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();
     
        // Maximize to browser window
        driver.manage().window().maximize();
        
        // Launch the website
        driver.get("https://www.guvi.in/");

        // Locate and click on the Signup button
        WebElement signupButton = driver.findElement(By.xpath("//a[contains(text(),'Sign up')]"));
        signupButton.click();

        // Fill in the signup form
        WebElement nameInput = driver.findElement(By.id("name"));
        nameInput.sendKeys("JameelGuviUserAQ");

        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys("User01@test.com");

        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("#ABC123456");
        
        Thread.sleep(2000);
        
        WebElement mobilenumber = driver.findElement(By.id("mobileNumber"));
        mobilenumber.sendKeys("1234567890");

        Thread.sleep(3000);

        // Click on the Signup button to submit the form
       // WebElement signupForm = driver.findElement(By.tagName("form"));
       // signupForm.submit();
        
        driver.findElement(By.id("signup-btn")).click();
        
        Thread.sleep(5000);

        /* As discussed previous in thi current url there is no registration alert is coming, unable to continue the steps
        
        driver.navigate().back();
        
       Wait for the page to load and verify successful registration (You can add more verification steps if needed)
        String pageTitle = driver.getTitle();
        if (pageTitle.contains("Thank you")) {
            System.out.println("Registration successful!");
        } else {
            System.out.println("Registration failed!");
        }
     
        
        Thread.sleep(5000);
        // Locate and click on the Login button
        WebElement loginButton = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
        loginButton.click();

        // Fill in the login form
        WebElement loginEmailInput = driver.findElement(By.id("email"));
        loginEmailInput.sendKeys("User1@test.com");

        WebElement loginPasswordInput = driver.findElement(By.id("password"));
        loginPasswordInput.sendKeys("#ABC123456");

        Thread.sleep(3000);

        // Click on the Login button to submit the form
        WebElement loginForm = driver.findElement(By.tagName("form"));
        loginForm.submit();

        // Wait for the page to load and verify successful login (You can add more verification steps if needed)
        String pageTitle = driver.getTitle();
        if (pageTitle.contains("Dashboard")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed!");
        }
        
        Thread.sleep(2000);\
        */

        // Close the browser
       driver.quit();
    }
}