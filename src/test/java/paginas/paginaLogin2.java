package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class paginaLogin2 {
	    private WebDriver driver;
	  
	    // Localizadores de elementos
	    private By emailTextBoxLocator = By.name("userName");
	    private By passwordTextBoxLocator = By.name("password");
	    private By nextButtonLocator = By.name("submit");
	    private By titleLocator = By.xpath("//tbody//tr//td//h3");
	    private By invalidLoginLocator = By.xpath("//span[contains(text(),'Enter your userName and password correct')]");
	    
	    public paginaLogin2(WebDriver driver) {
	        this.driver = driver;
	    }
	  
	    public void ingresarCredenciales(String strEmail, String strPassword) { 
	        WebElement emailTextBox = driver.findElement(emailTextBoxLocator);
	        WebElement passwordTextBox = driver.findElement(passwordTextBoxLocator);
	        WebElement nextButton = driver.findElement(nextButtonLocator);
	        
	        emailTextBox.sendKeys(strEmail);
	        passwordTextBox.sendKeys(strPassword);
	        nextButton.click();
	    }
	    
	    public String obtenerTitulo() {
	        WebElement title = driver.findElement(titleLocator);
	        return title.getText();
	    }
	  
	    public String obtenerMensajeInvalido() {
	        WebElement invalidLogin = driver.findElement(invalidLoginLocator);
	        return invalidLogin.getText();
	    }
}



