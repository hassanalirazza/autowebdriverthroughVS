package exsAdminCMS.adminLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class AdminLogin {

    public void login(WebDriver driver) {
        driver.findElement(By.name("user_email")).sendKeys("anis.mumtaz@mwanmobile.org");
        driver.findElement(By.name("user_password")).sendKeys("123123123");
        driver.findElement(By.xpath("/html/body/section[2]/div/div/div/div/form/div[3]/div[1]")).click();
    }
    

    
    public void logout(WebDriver driver) {
        driver.findElement(By.xpath("/html/body/section[1]/div/div/div[2]/div/button")).click();
        driver.findElement(By.className("dropdown-item")).click();
    }
}
