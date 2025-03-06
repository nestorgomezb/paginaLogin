package pruebas;

import org.testng.Assert;
import org.testng.annotations.Test;

import common.Evidencia;
import common.commonSetup;
import paginas.paginaLogin;


public class LoginTest  extends commonSetup {

	paginaLogin login;
	@Test(priority=1)
	public void login_valid() throws Exception {

		try {
			login= new paginaLogin(driver);
			login.Credential("tutorial", "tutorial");
			Assert.assertEquals(login.getTitle(),"Login Successfully"
					+ "");


		} catch (Exception e) {
			Evidencia.tomarEvidencia(driver, "pruebaInicioSesionExitosa_Fallo");
			Assert.fail("Excepción durante la prueba: " + e.getMessage());
		}
	}
	@Test(priority=2)
	public void login_invalid() throws Exception {


		login= new paginaLogin(driver);   

		login.Credential("inv_user", "inv_pass");
		Assert.assertEquals(login.getInvalid(),"Enter your userName and password correct"
				+ "");
	}

}

