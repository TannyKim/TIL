package selenimu_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumProject {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naver.com");
		
		/*Thread
		.sleep(3000);*/
		
		String buttonSelector = "#NM_FAVORITE > div.group_nav > a";
		WebElement searchButton = driver.findElement(By.cssSelector(buttonSelector));
		searchButton.click();
		
		String movieSelector = "#gnb > div.ly_service > div.group_service.NM_FAVORITE_ALL_LY > dl:nth-child(3) > dd:nth-child(3) > a";
		WebElement selectMovie = driver.findElement(By.cssSelector(movieSelector));
		selectMovie.click();
		
		String menuSelector = "#scrollbar > div.scrollbar-box > div > div > ul > li:nth-child(3) > a";
		WebElement selectMenu = driver.findElement(By.cssSelector(menuSelector));
		selectMenu.click();
		
		String firstXpath ="//*[@id=\"old_content\"]/table/tbody/tr[2]/td[2]/div/a";
		WebElement trendingMovie = driver.findElement(By.xpath(firstXpath));
		trendingMovie.click();
		
		String searchSelector = "#content > div.article > div.section_group.section_group_frst > div:nth-child(5) > div:nth-child(2) > a";
		WebElement searchReview = driver.findElement(By.cssSelector(searchSelector));
		searchReview.click();
	}
	
	

}




