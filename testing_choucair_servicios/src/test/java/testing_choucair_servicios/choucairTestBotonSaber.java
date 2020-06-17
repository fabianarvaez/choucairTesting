package testing_choucair_servicios;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class choucairTestBotonSaber {
	
	private WebDriver driver;
	By locator_className = By.className("elementor-button-wrapper");
	
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.choucairtesting.com/servicio/");
	}
	
	
	//prueba de ingreso a página en sección servicio y prueba de botón "Saber mas2
	@Test
	public void testChoucairBotonSaberMas() {
		
		driver.findElement(locator_className).click();
		

		//if(driver.findElement(locator_className).isDisplayed()) {
		//	driver.findElement(arg0)
		//}
		//assertEquals()
	}
	
	@After
	public void tearDown() {
		
		//driver.quit();
	}

}
