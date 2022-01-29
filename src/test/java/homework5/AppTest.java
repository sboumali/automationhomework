package homework5;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AppTest {

    WebDriver driver;

    @BeforeMethod
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sofiane\\IdeaProject\\automation\\src\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

    }

    @Test
    public void test0() throws InterruptedException { //testing searchbar & submitbuttom
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Iphones");
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
    }

    @Test
    public void test1() throws InterruptedException { //testing the sign in
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("sofiane.boumali1983@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("srboumali83");
        driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
    }

    @Test
    public void test2() throws InterruptedException {//testing the buttom buy again
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("sofiane.boumali1983@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("srboumali83");
        driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).click();
    }

    @Test
    public void test3() throws InterruptedException {//testing the buttom add to cart
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("airpods");
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[6]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a")).click();
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();

    }

    @Test
    public void test4() throws InterruptedException {//testing the best seller
        driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/i")).click();
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"anonCarousel2\"]/ol/li[1]/div[2]/div/a[2]/span/div")).click();

    }

    @Test
    public void test5() throws InterruptedException {//testing to the amazon pharmacy
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).sendKeys("pharmacy");


    }

    @Test
    public void test6() throws InterruptedException {//testing sign out
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("sofiane.boumali1983@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("srboumali83");
        driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/i")).click();
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]")).click();

    }

    @Test
    public void test7() throws InterruptedException { //testing beauty and personal care
        driver.findElement(By.xpath("//*[@id=\"swm-link\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"sobe_d_b_4_4\"]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"FragranceNet\"]/div/img")).click();

    }

    @Test
    public void test8() throws InterruptedException { //testing
        driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/i")).click();
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[4]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"anonCarousel2\"]/ol/li[3]/div[2]/div/a[2]/span/div")).click();
        driver.findElement(By.xpath("//*[@id=\"issuancePriceblockAmabot_feature_div\"]/div/div/a/div/div/div/div/span")).click();

    }

    @Test
    public void test9() throws InterruptedException { // create an account
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"createAccountSubmit\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ap_customer_name\"]")).sendKeys("sofianeboumali");
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("sofaine.cheurfa@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("shfjuurrj");
        driver.findElement(By.xpath("//*[@id=\"ap_password_check\"]")).sendKeys("shfjuurrj");
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
    }


    @Test
    public void test10() throws InterruptedException { //testing to sign out
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("pet suplies");
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[41]/div/div/div/div/div[2]")).click();

    }

}
