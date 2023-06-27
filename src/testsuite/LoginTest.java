package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);

    }
    //userShouldNavigateToLoginPageSuccessfully
    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        // click on Login link
        driver.findElement(By.linkText("Log in")).click();

        //Verify the text Welcome,Please sign In!
        String expectedText = "Welcome, Please Sign In!";
       // String actualText = driver.findElement((By.xpath("//h1[text()='Welcome, Please Sign In!']"));
        String actualText = driver.findElement(By.tagName("h1")).getText();

       Assert.assertEquals("Not redirected to Login page", expectedText, actualText);

    }
        //user Should Log in Successfully With Valid Credential
       @Test
       public void verifyUserLoginInWithValidCredentials() {
           // finding and clicking log in button
           driver.findElement(By.linkText("Log in")).click();

           // finding and entering email and password
           driver.findElement(By.id("Email")).sendKeys("window12@gmail.com");
           driver.findElement(By.id("Password")).sendKeys("Hello123");

           // clicking the login button
           driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();

           //verifying user is logged in successful or not by verifying the text displayed on the screen
           String expectedMessage = "Log out";
           String actualMessage = driver.findElement(By.linkText("Log out")).getText();
           Assert.assertEquals("User is not logged in successfully", expectedMessage, actualMessage);

           //Verify the 'Log out' text is display

           String expectedText = "Log out";
           //String actualText = driver.findElement(By.xpath("//button[@class='button-1 logout-button']")).getText();
           String actualText = driver.findElement(By.linkText("Log out")).getText();
           Assert.assertEquals("Log out link is not displayed", expectedText, actualText);
          // System.out.println("Log out successfully");

       }
       //Verify The Error Message
       @Test
    public void verifyErrorWithInvalidCredentials(){
           driver.findElement(By.linkText("Log in")).click();
           driver.findElement(By.id("Email")).sendKeys("window12@gmail.com");
           driver.findElement(By.id("Password")).sendKeys("Hello12");
           driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
           // verifying the error message displayed or not
           String expectedText = "Login was unsuccessful. Please correct the errors and try again.\n" +
                   "No customer account found";
           String actualText = driver.findElement(By.xpath("//div [@class = 'message-error validation-summary-errors']")).getText();
           Assert.assertEquals("Error message not displayed correctly", expectedText, actualText);


    }
        @After
        public void tearDown() {

        closeBrowser();
        }
    }

