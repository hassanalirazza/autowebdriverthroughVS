package exsAdminCMS.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class adminlogout {
    public void logout(WebDriver driver) {
        driver.findElement(By.xpath("/html/body/section[1]/div/div/div[2]/div/button")).click();
        driver.findElement(By.className("dropdown-item")).click();
    }
}
