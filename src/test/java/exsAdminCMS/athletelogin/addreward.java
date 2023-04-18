package exsAdminCMS.athletelogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class addreward {
    public void rewardadd(WebDriver driver) {
        driver.findElement(By.xpath("/html/body/section[2]/section[1]/div/ul/li[3]/a")).click(); //clicking marketplace
        driver.findElement(By.xpath("/html/body/section[2]/section[1]/div/ul/li[3]/ul/li[1]")).click(); // clicking add reward
        driver.findElement(By.xpath("/html/body/section[2]/section[2]/div[1]/div[2]/div[1]/div/div[2]/div/div/div[3]/div")).click();
        //driver.findElement(By.linkText("Select this service template")).click();
        driver.findElement(By.id("select-service-btn")).click();
    } 
}
