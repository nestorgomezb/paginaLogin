package pruebas;

import org.testng.Assert;
import org.testng.annotations.Test;

import common.Evidencia;
import common.commonSetup;
import paginas.paginaLogin2;

public class LoginTest2  extends commonSetup {
	paginaLogin2 login2;
	
	
	@Test(priority=1)
	public void login_valid() throws Exception {

		try {
			login2= new paginaLogin2(driver);
			login2.ingresarCredenciales("tutorial", "tutorial");
			Assert.assertEquals(login2.obtenerTitulo(),"Login Successfully");


		} catch (Exception e) {
			Evidencia.tomarEvidencia(driver, "pruebaInicioSesionExitosa_Fallo");
			Assert.fail("Excepción durante la prueba: " + e.getMessage());
		}
	}
	@Test(priority=2)
	public void login_invalid() throws Exception {


		login2= new paginaLogin2(driver);   

		login2.ingresarCredenciales("inv_user", "inv_pass");
		Assert.assertEquals(login2.obtenerMensajeInvalido(),"Enter your userName and password correct"
				+ "");
	}


}
