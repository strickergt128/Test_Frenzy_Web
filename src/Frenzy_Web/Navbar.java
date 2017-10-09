package Frenzy_Web;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Navbar extends Login {
	@Test(testName = "Test Navbar",description="Test de Botones del Navbar",priority=4)
	  public void NavbarTest() throws InterruptedException {
		try {
			//Bottons Navbar	
			String Frenzy = "https://frenzy.com.gt/#/menu/home";
			String QueEsFrenzy = "https://frenzy.com.gt/#/menu/what_is_frenzy";
			String Favoritos = "https://frenzy.com.gt/#/menu/favorites";
			String Bits = "https://frenzy.com.gt/#/menu/points";
			String Premios = "https://frenzy.com.gt/#/menu/awards";
			//content in pages
			String CBits = "(//DIV[@class='boxPoints'])[1]";
			
			WebDriverWait wait = new WebDriverWait(driver,30);
			Thread.sleep(5000);
			driver.navigate().to(QueEsFrenzy);
			System.out.println("Se Accedio a:'Que es Frenzy'");
			driver.navigate().to(Favoritos);
			System.out.println("Se Accedio a:'Favoritos'");
			driver.navigate().to(Bits);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(CBits)));
			 if(driver.findElements(By.xpath(CBits)).isEmpty()){
				 Assert.fail("Bits Failed in Load");
			 	}
			 driver.navigate().to(Premios);
			System.out.println("Se Accedio a:'Premios'");
			driver.navigate().to(Frenzy);
			System.out.println("Los Botones del Navbar Funcionan Correctamente");
		}catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Method Failed in Navbar " + e.getMessage());
        }
	}
}
