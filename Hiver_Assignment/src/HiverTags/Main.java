package HiverTags;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) throws InterruptedException{
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
        
        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();
        
        // Maximize the browser
        driver.manage().window().maximize();
        
        // Launch Website
        //driver.get("https://mail.google.com");
        
        //Thread.sleep(5000);
        
        String email = "gmail@gmail.com";
        String password = "password";
        
        // Open Gmail and log in
        driver.get("https://mail.google.com");
        // Wait for Gmail to load
        Thread.sleep(100000);
        
        driver.findElement(By.id("identifierId")).sendKeys(email);
        driver.findElement(By.id("identifierNext")).click();
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.id("passwordNext")).click();
        
        
        WebElement color1 = driver.findElement(By.xpath("/html/body/div[8]/div[3]/div/div[2]/div[1]/div[6]/div/div/div[3]/div[2]/section/div[2]/div/span[1]"));
        WebElement color2 = driver.findElement(By.xpath("/html/body/div[8]/div[3]/div/div[2]/div[1]/div[6]/div/div/div[3]/div[2]/section/div[2]/div/span[2]"));
        WebElement color3 = driver.findElement(By.xpath("/html/body/div[8]/div[3]/div/div[2]/div[1]/div[6]/div/div/div[3]/div[2]/section/div[2]/div/span[3]"));
        WebElement color4 = driver.findElement(By.xpath("/html/body/div[8]/div[3]/div/div[2]/div[1]/div[6]/div/div/div[3]/div[2]/section/div[2]/div/span[4]"));
        WebElement color5 = driver.findElement(By.xpath("/html/body/div[8]/div[3]/div/div[2]/div[1]/div[6]/div/div/div[3]/div[2]/section/div[2]/div/span[5]"));
        WebElement color6 = driver.findElement(By.xpath("/html/body/div[8]/div[3]/div/div[2]/div[1]/div[6]/div/div/div[3]/div[2]/section/div[2]/div/span[6]"));
        WebElement color7 = driver.findElement(By.xpath("/html/body/div[8]/div[3]/div/div[2]/div[1]/div[6]/div/div/div[3]/div[2]/section/div[2]/div/span[7]"));
        WebElement color8 = driver.findElement(By.xpath("/html/body/div[8]/div[3]/div/div[2]/div[1]/div[6]/div/div/div[3]/div[2]/section/div[2]/div/span[8]"));
        WebElement color9 = driver.findElement(By.xpath("/html/body/div[8]/div[3]/div/div[2]/div[1]/div[6]/div/div/div[3]/div[2]/section/div[2]/div/span[9]"));
        
        CreateTags createTag = new CreateTags();
        ApplyTag applyTag = new ApplyTag();
        
        // Create a new tag from the Tags panel
        createTag.createTagFromTagsPanel(driver, "NewTag1", color1);
        
        // Create another tag from the Tags panel
        createTag.createTagFromTagsPanel(driver, "NewTag2", color2);
        
        // Apply tags to conversations
        applyTag.applyTagToConversation(driver, "NewTag1");
        applyTag.applyTagToConversation(driver, "NewTag2");
        
        // Close the browser
        driver.quit();
    }
    
}


