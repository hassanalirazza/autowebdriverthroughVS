package exsAdminCMS.athletelogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class athleteLogin {

    public void athletelogin(WebDriver driver) {
        driver.findElement(By.id("email")).sendKeys("nc1mwan@yopmail.com"); // athlete email
        driver.findElement(By.id("password")).sendKeys("c99b8b20bbf8"); //athlete password
        driver.findElement(By.xpath("/html/body/section[2]/div/div/div/div[1]/form/div[3]/div[1]/input")).click(); //Login button
        
    }
    

    
    // public void logout(WebDriver driver) {
    //     driver.findElement(By.xpath("/html/body/section[1]/div/div/div[2]/div/button")).click();
    //     driver.findElement(By.className("dropdown-item")).click();
    // }
}