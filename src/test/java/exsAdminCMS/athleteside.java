package exsAdminCMS;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import exsAdminCMS.athletelogin.addreward;
import exsAdminCMS.athletelogin.athleteLogin;
import io.github.bonigarcia.wdm.WebDriverManager;

public class athleteside {
    public static void main(String[] args) {
        System.setProperty("webdriver.http.factory", "jdk-http-client"); // use for Ip configured
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("https://athlete-staging.ex-sports.io/login");
        // athlete login file
        athleteLogin loginvariable = new athleteLogin();
        loginvariable.athletelogin(driver);


        // athlete login file
        addreward addingReward = new addreward();
        addingReward.rewardadd(driver);

    }
}
