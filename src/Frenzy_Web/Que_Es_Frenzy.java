package Frenzy_Web;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Que_Es_Frenzy extends Categorias {
	@Test(testName = "Test Que Es Frenzy",description="Test Video de Frenzy",priority=7)
	  public void QueEsFrenzy() throws InterruptedException {
				try {
						WebDriverWait wait = new WebDriverWait(driver,30);
						String QueEsFrenzy = "https://frenzy.com.gt/#/menu/what_is_frenzy";
						String Frenzy = "https://frenzy.com.gt/#/menu/home";
						String Video = "//DIV[@id='video']";
					  		// Ir hacia ¿Qué es Frenzy?
							driver.navigate().to(QueEsFrenzy);
							wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//IMG[@class='imgVideoButton']")));
							driver.findElement(By.xpath("//IMG[@class='imgVideoButton']")).click();
							wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Video)));
							System.out.println("El Video se Desplego");
							driver.navigate().to(Frenzy);
							Thread.sleep(2000);
							driver.navigate().refresh();  
					
				  }catch (Exception e) {
					  e.printStackTrace();
					  Assert.fail("Method failed in Que Es Frenzy " + e.getMessage());
				  }
	  }
}
