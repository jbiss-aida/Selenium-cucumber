package com.e2eTest.automation.step_definitions;


import com.e2eTest.automation.page_objects.AuthenticationPage;

import com.e2eTest.automation.utils.ConfigureFile;
import com.e2eTest.automation.utils.SeleniumUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthenticationStepDefinition {

	private AuthenticationPage authenticationPage ; 
	private SeleniumUtils seleniumUtils ;
	private ConfigureFile configureFile ;

	public AuthenticationStepDefinition() {
		seleniumUtils = new SeleniumUtils();
		authenticationPage = new AuthenticationPage();
		configureFile = new ConfigureFile();
	}

	/*TC_01*/
	@Given("Je me connecte sur l application nopeCommerce")
	public void jeMeConnecteSurLApplicationNopeCommerce() {
		seleniumUtils.get(configureFile.getProperties("home.recette"));
	}

	@When("Je saisis l email {string}")
	public void jeSaisisLEmail(String email) {
		seleniumUtils.writeText(AuthenticationPage.getEmail(), email);
	}

	@When("Je saisis le password {string}")
	public void jeSaisisLePassword(String password) {
		seleniumUtils.writeText(AuthenticationPage.getPassword(), password);
	}

	@When("Je clique sur le bouton LOG IN")
	public void jeCliqueSurLeBoutonLOGIN() {
		seleniumUtils.click(AuthenticationPage.getBtnLogin());
	}

	@Then("Je me redirige vers la page home")
	public void jeMeRedirigeVersLaPageHome() {

	}

}