package exsAdminCMS.rewards;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class rewards {
    public void getReward(WebDriver driver) {
        //			addNft.nftadd(driver);
			driver.findElement(By.xpath("/html/body/section[2]/div/div/div[12]/div")).click(); //main reward button
			driver.findElement(By.linkText("Athlete Reward Requests")).click(); 
    }
}
