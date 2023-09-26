package HiverTags;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateTags {
	
	public void createTagFromTagsPanel(WebDriver driver, String tagName, WebElement tagColor) {
		// Dropdown shared mail 
		WebElement dropdownSharedMail = driver.findElement(By.xpath("//*[@id=\"h-shared-mailbox--container\"]/div/li/div/span[1]/svg"));
		dropdownSharedMail.click();
        
        // Open the Tags panel 
        WebElement openingTagsPanel = driver.findElement(By.xpath("//*[@id=\\\"h-tags\\\"]/p/span"));
        openingTagsPanel.click();
        
        // Click the button to create a new tag
        WebElement createTag = driver.findElement(By.xpath("//*[@id=\"h-smTags__create\"]/svg/path"));
        createTag.click();
        
        // Fill in tag name and color
        driver.findElement(By.id("h-smtagName")).sendKeys(tagName);
        tagColor.click();
        
        // Click the "Create" button
        WebElement createButton = driver.findElement(By.id("h-smTags-modal--confirm"));
        createButton.click();
        
        // Close the Tags panel
        WebElement closeTag = driver.findElement(By.xpath("//*[@id=\"h-smTags__close\"]/svg"));
        closeTag.click();
    }
}