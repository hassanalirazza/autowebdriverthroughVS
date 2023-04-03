// package exsAdminCMS;
package exsAdminCMS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import exsAdminCMS.Notification.notifications;
import exsAdminCMS.adminLogin.AdminLogin;
import exsAdminCMS.adminLogin.VerifyLogin;
import exsAdminCMS.rewards.rewards;
import io.github.bonigarcia.wdm.WebDriverManager;

public class adminside {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.http.factory", "jdk-http-client"); // use for Ip configured
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://exs-cms.mwancloud.com/admin/login");
        
        // admin login file
        AdminLogin loginvariable = new AdminLogin();
        loginvariable.login(driver);
        
        // admin verify file
        VerifyLogin verify = new VerifyLogin();
        verify.verify(driver);

        // admin Notification click function
//        notifications notification = new notifications();
//        notification.getNotificationButton(driver);

        // admin Notification click function
        rewards reward = new rewards();
        reward.getReward(driver); 


    }
}
