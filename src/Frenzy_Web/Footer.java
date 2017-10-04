package Frenzy_Web;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Footer extends PlayStore_and_Appstore {
  @Test(testName="Test Footer",description="Test de los botones del footer",priority=11)
  public void Footer_Test() {
	  try {
		  //Variables
		  String ButtonMail = "//P[@class='emailFooter'][text()='V']";
		  String ButtonFacebook = "//A[@class='faceFooter']";
		  String QueEsFrenzy = "//P[@ui-sref='what_is_frenzy'][text()='¿Qué es Frenzy?']";
		  String Terminos = "(//P[text()='Términos y condiciones'])[1]";
		  
		  //Click en Email
		  driver.findElement(By.xpath(ButtonMail)).click();
		  String winHandleBefore = driver.getWindowHandle();
		  //Click en Facebook
		  driver.findElement(By.xpath(ButtonFacebook)).click();
		  for (String handle1 : driver.getWindowHandles()) {
          	 driver.switchTo().window(handle1);
          	}
          driver.close();
          driver.switchTo().window(winHandleBefore);
          //Click en Que es Frenzy
          driver.findElement(By.xpath(QueEsFrenzy)).click();
          //Click en Terminos y condiciones
          driver.findElement(By.xpath(Terminos)).click();
          driver.navigate().back();
		  
	  }catch (Exception e) {
		  e.printStackTrace();
		  Assert.fail("hoverServices method failed in ServicesFrenzy " + e.getMessage());
	  }
  }
}
