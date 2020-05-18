import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MyTestClass {
    public static void main (String args[]) {
System.setProperty("webdriver.gecko.driver","/Users/karankundan/Downloads/geckodriver");

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"u_0_m\"]")).sendKeys("Test Selenium");
        driver.findElement(By.xpath("//*[@id=\"u_0_7\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"u_0_13\"]")).click();//signup
        Select sel = new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
        sel.selectByVisibleText("Mar");
        Select sel3 = new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
        sel3.selectByIndex(19);
        Select sel4 = new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
        sel4.selectByIndex(1994);
       // driver.findElement(By.xpath("//*[@id=\"month\"]"))

    }
}
