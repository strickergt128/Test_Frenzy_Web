package Frenzy_Web;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Categorias extends Test_Buttons_Home{
  @Test(testName = "Test Categoiras",description="Test de categorias, socios y paginas web de socios",priority=6)
  public void Categorias_Test() {
	  try {
		  WebDriverWait wait = new WebDriverWait(driver,30);
		  String Frenzy = "https://frenzy.com.gt/#/menu/home";
		  //Categorias
		  int c = 1;
		  while (c>0) {
			  if (!driver.findElements(By.xpath("(//DIV[@class='contentBoxCategory flexHorizontalCenter col-xs-12 col-sm-4 col-md-4 col-lg-4 ng-scope'])[" + c + "]")).isEmpty()) {
				  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//DIV[@class='contentBoxCategory flexHorizontalCenter col-xs-12 col-sm-4 col-md-4 col-lg-4 ng-scope'])[" + c + "]")));
				  driver.findElement(By.xpath("(//DIV[@class='contentBoxCategory flexHorizontalCenter col-xs-12 col-sm-4 col-md-4 col-lg-4 ng-scope'])[" + c + "]")).click();
				  JavascriptExecutor jse = (JavascriptExecutor)driver;
				  System.out.println("****Se accedio a la Categoria No." + c + "****");
				  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//DIV[@class='col-xs-12 col-sm-12 col-md-11 col-lg-8']")));
				  int a = 1;
				  while (a>0) {
					  if(!driver.findElements(By.xpath("(//DIV[@class='boxCustomer'])[" + a + "]")).isEmpty()){
						  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//DIV[@class='boxCustomer'])[" + a + "]")));
						  driver.findElement(By.xpath("(//DIV[@class='boxCustomer'])[" + a + "]")).click();
						  System.out.println("Se accedio al socio NO." + a);
						  jse.executeScript("scroll(0, 0)");
						  String winHandleBefore = driver.getWindowHandle();
						  wait.until(ExpectedConditions.elementToBeClickable(By.className("contentWeb")));
						  driver.findElement(By.className("contentWeb")).click();
						  System.out.println("Se accedió al sitio web del socio");
						  
						  for (String handle1 : driver.getWindowHandles()) {
							  driver.switchTo().window(handle1);
						  }
						  driver.close();
						  driver.switchTo().window(winHandleBefore);
	                
	                
						  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//DIV[@onclick='goBack()'][text()='\n" + 
								  "\n" + 
								  "        ']")));
						  driver.findElement(By.xpath("//DIV[@onclick='goBack()'][text()='\n" + 
								  "\n" + 
								  "        ']")).click();
						  ++a;
					  }else{
						  driver.navigate().to(Frenzy);
						  System.out.println("---------------No se Encontraron más socios---------------");
						  break;
					  }
				  }
				  ++c;
			  }else {
				  driver.navigate().to(Frenzy);
				  System.out.println("---------------No se encontraron más categorias---------------");
				  break;
			  }
		
		  }
	  	}catch (Exception e) {
	  		e.printStackTrace();
	  		Assert.fail("hoverServices method failed in Categorias y Socios " + e.getMessage());
	  	}
  }
}
