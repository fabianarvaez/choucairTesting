package testing_choucair_servicios;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class choucairTestBotonLeerMas {
	
	private WebDriver driver;
	By locator_partialLinkText = By.xpath("//*[@id=\"main\"]/div/div/div/div/section[41]/div/div/div[1]/div/div/div[2]/div/div/a");
	
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.choucairtesting.com/servicio/");
	}
	
	//prueba de ingreso a página en sección servicio y prueba de botón "Leer mas"
		@Test
		public void testChoucairBotonLeerMas() {
						
			driver.findElement(locator_partialLinkText).click();
			
		}
		
		@After
		public void tearDown() {
			
			driver.quit();
		}

}
