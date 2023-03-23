package exsAdminCMS.Notification;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class notifications {
    public void getNotificationButton(WebDriver driver) {
        //			addNft.nftadd(driver);
			driver.findElement(By.className("card_13")).click(); //main notification button
			driver.findElement(By.linkText("Add Notification")).click(); //Add notification button
    }
    
	public void ByCategory(WebDriver driver) {
		Select dropdown = new Select(driver.findElement(By.id("notification_type")));
		dropdown.selectByValue("by-categories");
		
		Select category = new Select(driver.findElement(By.id("categories")));
		category.selectByValue("2");  //jujitsu
		
		Select Bynft = new Select(driver.findElement(By.id("by-nfts")));
		Bynft.selectByValue("685");  //NFT Id
		
		Select usertype = new Select(driver.findElement(By.id("users")));
		usertype.selectByValue("nft-owners");  //NFT Id
		
		driver.findElement(By.name("title")).sendKeys("Automate"); //Title
		driver.findElement(By.name("description")).sendKeys("Notification Send By selenium"); //Description
		driver.findElement(By.name("link")).sendKeys("No link available");  //Link
		driver.findElement(By.className("notification-submit")).click(); //Add notification
	}
	
	public void ByAthlete(WebDriver driver) {
		Select dropdown = new Select(driver.findElement(By.id("notification_type")));
		dropdown.selectByValue("by-athletes");
		
		Select category = new Select(driver.findElement(By.id("athletes")));
		category.selectByValue("20504");  //athlete value
		
		Select Bynft = new Select(driver.findElement(By.id("by-nfts")));
		Bynft.selectByValue("685");  //NFT Id
		
		Select usertype = new Select(driver.findElement(By.id("users")));
		usertype.selectByValue("nft-owners");  //NFT Id
		
		driver.findElement(By.name("title")).sendKeys("Automate"); //Title
		driver.findElement(By.name("description")).sendKeys("Notification Send By selenium"); //Description
		driver.findElement(By.name("link")).sendKeys("No link available");  //Link
		driver.findElement(By.className("notification-submit")).click(); //Add notification
	}
	
	public void ByNfts(WebDriver driver) throws InterruptedException {
		
		Select dropdown = new Select(driver.findElement(By.id("notification_type")));
		driver.wait(3000);
		dropdown.selectByValue("by-nfts");
		
		
		Select Bynft = new Select(driver.findElement(By.id("by-nfts")));
		Bynft.selectByValue("685");  //NFT Id
		
		Select usertype = new Select(driver.findElement(By.id("users")));
		usertype.selectByValue("nft-owners");  //NFT Id
		
		driver.findElement(By.name("title")).sendKeys("Automate"); //Title
		driver.findElement(By.name("description")).sendKeys("Notification Send By selenium"); //Description
		driver.findElement(By.name("link")).sendKeys("No link available");  //Link
		driver.findElement(By.className("notification-submit")).click(); //Add notification
	}
	
	public void ByRewards(WebDriver driver) {
		Select dropdown = new Select(driver.findElement(By.id("notification_type")));
		dropdown.selectByValue("by-nfts");
		
		Select category = new Select(driver.findElement(By.id("categories")));
		category.selectByValue("2");  //jujitsu
		
		Select Bynft = new Select(driver.findElement(By.id("by-nfts")));
		Bynft.selectByValue("685");  //NFT Id
		
		Select usertype = new Select(driver.findElement(By.id("users")));
		usertype.selectByValue("nft-owners");  //NFT Id
		
		driver.findElement(By.name("title")).sendKeys("Automate"); //Title
		driver.findElement(By.name("description")).sendKeys("Notification Send By selenium"); //Description
		driver.findElement(By.name("link")).sendKeys("No link available");  //Link
		driver.findElement(By.className("notification-submit")).click(); //Add notification
	}
	
	public void ByEvent(WebDriver driver) {
		Select dropdown = new Select(driver.findElement(By.id("notification_type")));
		dropdown.selectByValue("by-nfts");
		
		Select category = new Select(driver.findElement(By.id("categories")));
		category.selectByValue("2");  //jujitsu
		
		Select Bynft = new Select(driver.findElement(By.id("by-nfts")));
		Bynft.selectByValue("685");  //NFT Id
		
		Select usertype = new Select(driver.findElement(By.id("users")));
		usertype.selectByValue("nft-owners");  //NFT Id
		
		driver.findElement(By.name("title")).sendKeys("Automate"); //Title
		driver.findElement(By.name("description")).sendKeys("Notification Send By selenium"); //Description
		driver.findElement(By.name("link")).sendKeys("No link available");  //Link
		driver.findElement(By.className("notification-submit")).click(); //Add notification
	}
}

