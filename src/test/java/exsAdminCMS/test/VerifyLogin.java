package exsAdminCMS.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class VerifyLogin {
    public void verify(WebDriver driver) {
        driver.findElement(By.name("user_pin")).sendKeys("204ec6dc");
        driver.findElement(By.xpath("/html/body/section[2]/div/div/div/div/form/div[2]/div")).click();
    }
}