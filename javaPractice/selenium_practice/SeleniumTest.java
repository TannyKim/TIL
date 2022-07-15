package selenimu_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naver.com");
		
		String buttonSelector = "#NM_FAVORITE > div.group_nav > ul.list_nav.NM_FAVORITE_LIST > li:nth-child(8) > a";
		WebElement webtoonButton = driver.findElement(By.cssSelector(buttonSelector));
		webtoonButton.click();
		
		String inputId = "gnb.keyword";
		WebElement searchInput = driver.findElement(By.id(inputId));
		searchInput.sendKeys("조석");
		searchInput.sendKeys(Keys.ENTER);
		
		String liSelector = "#content > div:nth-child(2) > ul > li > h5 > a";
		List<WebElement> items = driver.findElements(By.cssSelector(liSelector));
		
		for (WebElement item : items) {
			System.out.println(item.getText());
		}
		
		for (int i = 0; i < items.size(); i++) {
			// 0, 1, 2, 3, 4
			// 1, 2, 3, 4, 5
			if ((i+1) % 2 == 1) {
				WebElement item = items.get(i);
				System.out.println(i+":"+item.getText());
			}
		}
		
		
		
		
	}
}
