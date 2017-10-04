package Frenzy_Web;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Bits extends Que_Es_Frenzy {
	@Test(testName = "Test Bits",description="Test de Bits, Promociones y Botones",priority=8)
	  public void Bits_Test() throws InterruptedException {
		try {
			//Ir hacia Points
			 WebDriverWait wait = new WebDriverWait(driver,30);
			 String Bits = "https://frenzy.com.gt/#/menu/points";
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//DIV[@class='textCenter col-xs-12 col-sm-12 col-md-10 col-lg-8']")));
			 Thread.sleep(5000);
			 driver.navigate().to(Bits);
			 //Probar el boton de '¿como gano y cambio Bits?'
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//DIV[@class='boxPoints'])[1]")));
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//DIV[@class='buttonTutorialHowWin flexVerticalCenter justifyContentCenter']")));
			 driver.findElement(By.xpath("//DIV[@class='buttonTutorialHowWin flexVerticalCenter justifyContentCenter']")).click();
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//DIV[@class='boxModalTutorialWinPoints']")));
			 driver.findElement(By.xpath("//SPAN[@aria-hidden='true'][text()='T']")).click();
			 System.out.println("Elboton de Como gano Bits Funciona Correctamente");
			 //Probar Las Ofertas
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//DIV[@class='col-xs-12 col-sm-12 col-md-11 col-lg-10']")));
			 int d = 1;
			 while (d>0) {
				 if (!driver.findElements(By.xpath("(//DIV[@class='boxPoints'])["+ d + "]")).isEmpty()) {
					 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//DIV[@class='boxPoints'])["+ d + "]")));
					 driver.findElement(By.xpath("(//DIV[@class='boxPoints'])["+ d + "]")).click();
					 System.out.println("Se accedio a la Categoria No." + d);
					 JavascriptExecutor jse = (JavascriptExecutor)driver;
					 jse.executeScript("scroll(0, 0)");
					 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//DIV[@class='col-xs-12 col-sm-11 col-md-9 col-lg-7']")));
					 int e = 1;
					 while (e>0) {
						 if(!driver.findElements(By.xpath("(//DIV[@class='buttonExchangePointsAbsolute marginRight20px'])[" + e + "]" )).isEmpty()){
							 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//DIV[@class='buttonExchangePointsAbsolute marginRight20px'])[" + e + "]")));
							 driver.findElement(By.xpath("(//DIV[@class='buttonExchangePointsAbsolute marginRight20px'])["+ e + "]")).click();
							 
							 System.out.println("Se accedio a la promoción NO." + e);
							 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//SPAN[@aria-hidden='true'][text()='T'][text()='T'])[1]")));
							 Thread.sleep(1000);
							 driver.findElement(By.xpath("(//SPAN[@aria-hidden='true'][text()='T'][text()='T'])[1]")).click();
							 System.out.println("Se cerro el Alert");
							 ++e;
						 }else{
							 driver.navigate().back();
							 System.out.println("---------------No se Encontraron más Promociones---------------");
							 break;
						 }
					 }
					 ++d;
				 }else {
					 driver.navigate().back();
					 System.out.println("---------------No se encontraron más Puntos---------------");
					 break;
				 }
				 
			 }
			 
		}catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Method failed in Bits " + e.getMessage());
		}
	}
}
