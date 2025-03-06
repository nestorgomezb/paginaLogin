package common;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Evidencia {

	public static void tomarEvidencia(WebDriver driver, String nombreArchivo) throws IOException {

		if (driver instanceof TakesScreenshot) {
			// Captura la evidencia
			TakesScreenshot screenshotDriver = (TakesScreenshot) driver;
			File screenshotFile = screenshotDriver.getScreenshotAs(OutputType.FILE);
		    // Genera una marca de tiempo con la fecha y hora actual
            SimpleDateFormat formatoFechaHora = new SimpleDateFormat("yyyyMMdd_HHmmss");
            String marcaTiempo = formatoFechaHora.format(new Date());
			FileUtils.copyFile(screenshotFile,new File("..\\Project_POM_Example_Solution\\Evidencias\\"+nombreArchivo +"-"+ marcaTiempo+".png"));

		} 
	}

}