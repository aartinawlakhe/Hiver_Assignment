package HiverTags;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ApplyTag {
	
	public void applyTagToConversation(WebDriver driver, String tagName) {
        // Locate the conversation you want to tag
        WebElement conversation = driver.findElement(By.xpath("//*[@id=\":2t\"]"));
        conversation.click();
        
        // Click the "Add Tag" option in the context menu
        WebElement addTagOnConversation = driver.findElement(By.xpath("//*[@id=\":4\"]/div[2]/div[4]/div/span[1]/svg/g/path[1]"));
        addTagOnConversation.click();
        
        // Select the tag from the list
        WebElement clickTag = driver.findElement(By.xpath("//*[@id=\"h-smtag-dropdown-btn\"]/span"));
        clickTag.click();
        
        WebElement searchTagName = driver.findElement(By.xpath("//*[@id=\"hiver-tags-scroller\"]/input"));
        searchTagName.sendKeys(tagName);
        
        WebElement selectTagName = driver.findElement(By.xpath("//*[@id=\"hiver-tagsDropdownScroller\"]"));
        selectTagName.click();
        
        WebElement clickApply = driver.findElement(By.xpath("//*[@id=\"hiver-tags-scroller\"]/button"));
        clickApply.click();
        
    }
}
