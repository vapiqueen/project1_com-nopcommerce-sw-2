package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);

    }

    //userShouldNavigateToComputerPageSuccessfully
    @Test
    public void verifyUserShouldNavigateToComputerPageSuccessfully() {
        //click on the ‘Computers’Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']")).click();

        //Verify the text ‘Computers’
        String expectedText = "Computers";
        String actualText = driver.findElement(By.xpath("//h1[text() = 'Computers']")).getText();
        Assert.assertEquals("Computers", expectedText, actualText);
    }

    @Test
    public void VerifyUserShouldNavigateToElectronicsPageSuccessfully() {

        //click on the ‘Electronics’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']")).click();
        // Verify the text ‘Electronics’
        String expectedText = "Electronics";
        String actualText = driver.findElement(By.xpath("//h1[text() = 'Electronics']")).getText();
        Assert.assertEquals("Electronics", expectedText,actualText);
    }

    @Test
    public void VerifyUserShouldNavigateToApparelPagesSuccessfully() {
        //click on the ‘Apparel’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']")).click();
        //Verify the text ‘Apparel’
        String expectedText = "Apparel";
        String actualText = driver.findElement(By.xpath("//h1[text() = 'Apparel']")).getText();

        Assert.assertEquals("Apparel", expectedText,actualText);

    }

    @Test
    public void VerifyUserShouldNavigateToDigitalDownloadsPagesSuccessfully() {
        //click on the ‘Digital downloads’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Digital downloads ']")).click();
        //Verify the text ‘Digital downloads’
        String expectedText = "Digital downloads";
       String actualText = driver.findElement(By.xpath("//h1[text() = 'Digital downloads']")).getText();
       Assert.assertEquals("Digital downloads", expectedText,actualText);
    }

    @Test
    public void VerifyUserShouldNavigateToBooksPagesSuccessfully() {
        //click on the ‘Books’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books ']")).click();
        //Verify the text ‘Books’
        String expectedText = "Books";
        String acctualText = driver.findElement(By.xpath("//h1[text() = 'Books']")).getText();
        Assert.assertEquals("Books", expectedText,acctualText);
    }

    @Test
    public void VerifyUserShouldNavigateToJewelryPagesSuccessfully() {
        //click on the ‘Jewellery’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry ']")).click();
        //Verify the text ‘Jewellery’
        String expectedText = "Jewelry";
        String actualText = driver.findElement(By.xpath("//h1[text() = 'Jewelry']")).getText();
        Assert.assertEquals("Jewelry", expectedText,actualText);
    }

    @Test
    public void VerifyUserShouldNavigateToGiftCardsPagesSuccessfully() {
        //click on the ‘Gift Cards’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']")).click();
        //Verify the text ‘Gift Cards ’
        String expectedText = "Gift Cards";
        String actualText = driver.findElement(By.xpath("//h1[text() = 'Gift Cards']")).getText();

        Assert.assertEquals("Gift Cards",expectedText,actualText);
    }

    @After

    public void tearDown() {
        closeBrowser(); // closing the browser


    }
}


