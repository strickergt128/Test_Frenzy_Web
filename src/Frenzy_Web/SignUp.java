package Frenzy_Web;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUp extends InitialConfigs {
  @Test(testName="SignUp",description="Registrar a un usuario",priority=2)
  public void Test_SignUp() {
	  try {
		  String Frenzy = "https://frenzy.com.gt/#/menu/home";
		  	//Ir a la ruta
			driver.get(Frenzy);
			WebDriverWait wait = new WebDriverWait(driver,30);
			//Varables Datos Usuario
			String Nombre = "Dilan";
			String Correo = "dilancastro7@hotmail.com";
			String Contraseña = "PlayStation4";
			String Fecha = "04/08/2000";
			//Variables Localización Botones y Campos
			String Imagen = "(//IMG[@class='AppPlayStore'])[1]";
			String btnCorreoElec = "//DIV[@class='email flexVerticalCenter justifyContentCenter']";
			String btnRegistrate = "//DIV[@class='signUp flexVerticalCenter justifyContentCenter']";
			String InpNombre = "(//INPUT[@type='text'])[1]";
			String InpCorreoElec = "//INPUT[@type='email']";
			String InpContraseña = "//INPUT[@type='password']";
			String InpGenero = "(//DIV[@class='genre flexVerticalCenter justifyContentCenter'])[1]";
			String InpFecha = "//INPUT[@type='date']";
			String btnCrear = "//DIV[@class='accessOrCreate flexVerticalCenter justifyContentCenter']";
			String btnOK = "//BUTTON[@type='button'][text()='OK']";
			String AlertCorreo = "(//DIV[@role='dialog'])[2]";
			String btnLoginCorreo = "//DIV[@class='signUp flexVerticalCenter justifyContentCenter']";
			//Esperar que el boton sea clickleable
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Imagen)));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(btnCorreoElec)));
			//Click en Correo Electronico
			driver.findElement(By.xpath(btnCorreoElec)).click();
			//Click en Registrate
			driver.findElement(By.xpath(btnRegistrate)).click();
			//Llenar campo nombre
			driver.findElement(By.xpath(InpNombre)).sendKeys(Nombre);
			//Llenar Campo Correo Electronico
			driver.findElement(By.xpath(InpCorreoElec)).sendKeys(Correo);
			//Llenar Campo Contraseña
			driver.findElement(By.xpath(InpContraseña)).sendKeys(Contraseña);
			//Click Genero
			driver.findElement(By.xpath(InpGenero)).click();
			//Llenar Campo Fecha
			driver.findElement(By.xpath(InpFecha)).sendKeys(Fecha);
			//Click en Crear
			driver.findElement(By.xpath(btnCrear)).click();
			System.out.println("Se creo el Usuario");
			// Alert informacion de cuenta existente
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AlertCorreo)));
			driver.findElement(By.xpath(btnOK)).click();
			Thread.sleep(500);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(btnLoginCorreo)));
			driver.findElement(By.xpath(btnLoginCorreo)).click();
	  }catch (Exception e) {
		  e.printStackTrace();
		  Assert.fail("method failed in SignUp " + e.getMessage());
	  }
  }
}
