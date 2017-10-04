package Frenzy_Web;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Buttons_Home extends Navbar {
	@Test(testName = "Test Botones Home",description="Test de Botones de la Pagina Principal:'Go!','¿Donde Consigo El código de Promoción' y '¿Como gano y cambio Bits?'",priority=5)
	  public void buttonsHome() throws InterruptedException {
				try {
					String btnOK = "//BUTTON[@type='button'][text()='OK']";
					String btnGo = "//DIV[@class='buttonGO flexVerticalCenter justifyContentCenter']";
					String AlertGo = "//DIV[@role='dialog']";
					String btnTutorialCodigo = "//DIV[@class='buttonTutorialCodePromotion flexVerticalCenter justifyContentCenter']";
					String AlertTutorialCodigo = "//DIV[@class='boxModalTutorialCodePromotion']";
					String CerrarTutorialCodigo = "(//SPAN[@aria-hidden='true'][text()='T'][text()='T'])[1]";
					String btnTutorialGanarPuntos = "//DIV[@class='buttonTutorialHowWinPoints flexVerticalCenter justifyContentCenter']";
					String AlertTutorialGanarPuntos = "//DIV[@class='buttonTutorialHowWinPoints flexVerticalCenter justifyContentCenter']";
					String CerrarTutorialGanarPuntos = "(//SPAN[@aria-hidden='true'][text()='T'][text()='T'])[3]";
					  WebDriverWait wait = new WebDriverWait(driver,30);
					  		//Boton Go!
							wait.until(ExpectedConditions.elementToBeClickable(By.xpath(btnGo)));
							driver.findElement(By.xpath(btnGo)).click();
							wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AlertGo)));
							Thread.sleep(500);
							driver.findElement(By.xpath(btnOK)).click();
							System.out.println("El boton GO! y El Alert Funcionan correctamente");
							
							//Codigo de promoción Alert
							Thread.sleep(500);
							wait.until(ExpectedConditions.elementToBeClickable(By.xpath(btnTutorialCodigo)));
							driver.findElement(By.xpath(btnTutorialCodigo)).click();
							wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AlertTutorialCodigo)));
							Thread.sleep(500);
							driver.findElement(By.xpath(CerrarTutorialCodigo)).click();
							System.out.println("El boton donde consigo codigo de promoción y El Alert Funcionan correctamente");
							
							//Boton tutorial ganar y cambiar Bits
							wait.until(ExpectedConditions.elementToBeClickable(By.xpath(btnTutorialGanarPuntos)));
							driver.findElement(By.xpath(btnTutorialGanarPuntos)).click();
							wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AlertTutorialGanarPuntos)));
							Thread.sleep(500);
							driver.findElement(By.xpath(CerrarTutorialGanarPuntos)).click();
							System.out.println("El boton como gano y cambio Bits y el Alert funcionan correctamente");
				  }catch (Exception e) {
					  e.printStackTrace();
					  Assert.fail("Method failed in Buttons Home " + e.getMessage());
				  }
	  }
}
