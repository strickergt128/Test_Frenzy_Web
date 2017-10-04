package Frenzy_Web;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends SignUp {
  @Test(testName="Login",description="Probar el Login con diferentes cuentas",priority=3)
  public void LoginUser() throws InterruptedException {
	  try {
		  //Varables Datos Usuario
		  String Correo2 = "dilancastro196@gmail.com";
		  String Contrase�a2 = "skgjlskdf";
		  String Correo = "dilancastro7@hotmail.com";
		  String Contrase�a = "PlayStation4";
		  //Variables Localizaci�n Botones y Campos
		  
		  String InpCorreoElec = "//INPUT[@type='email']";
		  String InpContrase�a = "//INPUT[@type='password']";
		  String btnOK = "//BUTTON[@type='button'][text()='OK']";
		  String btnEntar = "//DIV[@class='accessOrCreate flexVerticalCenter justifyContentCenter']";
		  String AlertCorreo = "(//DIV[@role='dialog'])[2]";
		  
		  
		  //LLenar Campos de Login Incorrectos
		  WebDriverWait wait = new WebDriverWait(driver,30);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(InpCorreoElec)));
		  driver.findElement(By.xpath(InpCorreoElec)).sendKeys(Correo2);
		  driver.findElement(By.xpath(InpContrase�a)).sendKeys(Contrase�a2);
		  driver.findElement(By.xpath(btnEntar)).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AlertCorreo)));
		  driver.findElement(By.xpath(btnOK)).click();
		  //Contrase�a Incorrecta
		  driver.findElement(By.xpath(InpCorreoElec)).clear();
		  driver.findElement(By.xpath(InpContrase�a)).clear();
		  driver.findElement(By.xpath(InpCorreoElec)).sendKeys(Correo);
		  driver.findElement(By.xpath(InpContrase�a)).sendKeys(Contrase�a2);
		  driver.findElement(By.xpath(btnEntar)).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AlertCorreo)));
		  driver.findElement(By.xpath(btnOK)).click();
		  //Usuario Incorrecto
		  driver.findElement(By.xpath(InpCorreoElec)).clear();
		  driver.findElement(By.xpath(InpContrase�a)).clear();
		  driver.findElement(By.xpath(InpCorreoElec)).sendKeys(Correo2);
		  driver.findElement(By.xpath(InpContrase�a)).sendKeys(Contrase�a);
		  driver.findElement(By.xpath(btnEntar)).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AlertCorreo)));
		  driver.findElement(By.xpath(btnOK)).click();
		  //Llenar Campos de Login Correctos
		  driver.findElement(By.xpath(InpCorreoElec)).clear();
		  driver.findElement(By.xpath(InpContrase�a)).clear();
		  driver.findElement(By.xpath(InpCorreoElec)).sendKeys(Correo);
		  driver.findElement(By.xpath(InpContrase�a)).sendKeys(Contrase�a);
		  driver.findElement(By.xpath(btnEntar)).click();
		  System.out.println("Se inicio Sesion");
	  	}catch (Exception e) {
	  		e.printStackTrace();
	  		Assert.fail("Method failed in login " + e.getMessage());
	  	}
  }
}
