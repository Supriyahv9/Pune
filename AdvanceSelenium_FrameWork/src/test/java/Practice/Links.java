package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Links {
	
	@Test
	public void Links() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shoppersstack.com/");
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		
		for(int i =0;i<alllinks.size();i++) {
			
			WebElement ele = alllinks.get(i);
			String url=ele.getAttribute("href");
			System.out.println(url);
		}
	}
			
			public void verifyLinkIsActive() {
				
				try {
					
					
				
			}
				
			}
			
			
		
		
	}

}
