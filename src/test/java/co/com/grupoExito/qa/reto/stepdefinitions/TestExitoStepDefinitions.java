package co.com.grupoExito.qa.reto.stepdefinitions;


import co.com.grupoExito.qa.reto.tasks.GoTo;
import co.com.grupoExito.qa.reto.tasks.Open;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import net.serenitybdd.screenplay.actors.OnStage;

public class TestExitoStepDefinitions {
	@Given("^el ingreso al sitio web (.*)$")
	public void elIngresoAlSitioWeb(String strUrl) {
		 OnStage.theActorCalled("ActorSistecredito").wasAbleTo(
	             Open.theWebSite(strUrl)
	     );
	}


	@When("^ingreso (.+) y (.+)$")
	public void ingresoIngenieroyefriRMGmailComYSolangeRuiz(String usuario, String clave) {
		OnStage.theActorInTheSpotlight().attemptsTo(
				GoTo.iniciarSesion(usuario, clave)
		);
	}

	@Then("^valido (.*)$")
	public void validoHolaYEFRI(String mensaje) {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}



}
