import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);

        //User Should Navigate To Register Page Successfully
        //Click on the 'Register' link
        WebElement register = driver.findElement(By.linkText("Register"));
        register.click();
        //Verify the text 'Register' tab
        String expectedText = "Register";
        String actualText = driver.findElement(By.tagName("a")).getText();
        Assert.assertEquals("Not redirected to Register page", expectedText, actualText);
    }
@Test
public void VerifyUserShouldClickOnRegisterSuccessfully() {
        //User Should Register Account Successfully
         driver.findElement(By.linkText("Register")).click();
         //User should click on gender button
        driver.findElement(By.id("gender")).click();
    //User should successfully Enter First name
    driver.findElement(By.id("FirstName")).sendKeys("Aarti");
//User should successfully Enter Last name
    driver.findElement(By.name("LastName")).sendKeys("Doshi");
//User should select Day Month and Year
    driver.findElement(By.name("DateOfBirthDay")).sendKeys("3");
    driver.findElement(By.name("DateOfBirthMonth")).sendKeys("January");
    driver.findElement(By.name("DateOfBirthYear")).sendKeys("1999");
    //User should Enter Email address
    driver.findElement(By.id("Email")).sendKeys("window12@gmail.com");
    //User should Enter Password
driver.findElement(By.name("Password")).sendKeys("Hello123");
//User should Confrim password
    driver.findElement(By.id("ConfirmPassword")).sendKeys("Hello123");
    //User should Click on Register Button
    driver.findElement(By.name("register-button")).click();

    String expectedMessage = "Your registration completed";
    String actualMessage = driver.findElement(By.xpath("//div[@class='result']")).getText();
    Assert.assertEquals("Your Registration completed",expectedMessage,actualMessage);
    }
}
