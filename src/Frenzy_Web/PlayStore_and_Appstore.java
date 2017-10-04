package Frenzy_Web;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlayStore_and_Appstore extends Premios {
	@Test(testName = "Test PlayStore and AppStore",description="Test de Botones de Google Play y AppStore",priority=10)
	  public void Buttons_PlayStore_and_AppStore(){
				try {
					 WebDriverWait wait = new WebDriverWait(driver,30);
					  String Frenzy = "https://frenzy.com.gt/#/menu/home";
					//Boton Play Store
							driver.navigate().to(Frenzy);
							String winHandleBefore = driver.getWindowHandle();
							wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//IMG[@class='PlayStore']")));
							driver.findElement(By.xpath("//IMG[@class='PlayStore']")).click();
							for (String handle1 : driver.getWindowHandles()) {
			                 	 driver.switchTo().window(handle1);
			                 	}
			                 driver.close();
			                 driver.switchTo().window(winHandleBefore);
							// Boton App Store
							wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//IMG[@class='AppStore']")));
							driver.findElement(By.xpath("//IMG[@class='AppStore']")).click();
							for (String handle1 : driver.getWindowHandles()) {
			                 	 driver.switchTo().window(handle1);
			                 	}
			                 driver.close();
			                 driver.switchTo().window(winHandleBefore);
				  }catch (Exception e) {
					  e.printStackTrace();
					  Assert.fail("Method failed in Buttons PlayStore and Appstore " + e.getMessage());
				  }
	  }
}
