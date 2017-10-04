package Frenzy_Web;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Premios extends Bits {
	@Test(testName = "Test Premios",description="Test de Premios",priority=9)
	  public void Premios_Test() throws InterruptedException {
		try {
			WebDriverWait wait = new WebDriverWait(driver,30);
			String Premios = "https://frenzy.com.gt/#/menu/awards";
			//Ir hacia Premios
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//DIV[@class='textCenter col-xs-12 col-sm-12 col-md-10 col-lg-8']")));
			driver.navigate().to(Premios);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//DIV[@class='positionRelative flexVerticalCenter col-xs-12 col-sm-11 col-md-9 col-lg-7']")));
			//Probar el boton de '¿como canjeo mis premios?'
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//DIV[@class='buttonTutorialHowWin flexVerticalCenter justifyContentCenter']")));
				driver.findElement(By.xpath("//DIV[@class='buttonTutorialHowWin flexVerticalCenter justifyContentCenter']")).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//DIV[@class='boxModalTutorialExchangeAwards']")));
				driver.findElement(By.xpath("(//SPAN[@aria-hidden='true'][text()='T'][text()='T'])[1]")).click();
				System.out.println("El boton de: '¿Como canjeo mis premios'");
				
		}catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Method failed in Premios " + e.getMessage());
		}
	}
}
