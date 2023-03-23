// package exsAdminCMS;
package exsAdminCMS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import exsAdminCMS.test.AdminLogin;
import exsAdminCMS.test.VerifyLogin;
import io.github.bonigarcia.wdm.WebDriverManager;

public class hitURL {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.http.factory", "jdk-http-client"); // use for Ip configured
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://exs-cms.mwancloud.com/admin/login");
        // admin login function
        AdminLogin loginvariable = new AdminLogin();
        loginvariable.login(driver);
        VerifyLogin verify = new VerifyLogin();

        verify.verify(driver);

        // admin verify function
    }
}
