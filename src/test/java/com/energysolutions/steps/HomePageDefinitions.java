package com.energysolutions.steps;

import com.energysolutions.pageobjects.HomePage;
import com.energysolutions.pageobjects.LoginPage;
import com.energysolutions.pageobjects.SelectGenerator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageDefinitions {

    LoginPage loginPage;
    SelectGenerator generator;
    HomePage homePage;

    @Given("I am in energy solutions home page")
    public void i_am_in_energy_solutions_home_page() {
        loginPage.open();
    }

    @Given("login with test credentials")
    public void login_with_test_credentials() {
        loginPage.waitUntilLoginButtonClickable();
        loginPage.userName.clear();
        loginPage.userName.sendKeys("akedia@olympasllc.com");
        loginPage.password.clear();
        loginPage.password.sendKeys("Olympas@2512");
        loginPage.loginButton.click();

        generator.selectGenerator("");
    }

    @Given("Navigate to new order Page")
    public void Navigate_to_new_order_Page() {
        homePage.clickOnOrderLink();

    }

    @When("I add all the related details to book a bobtailin delivery")
    public void i_add_all_the_related_details_to_book_a_bobtailin_delivery() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I should see a confirmation message")
    public void i_should_see_a_confirmation_message() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The order status should be {string}")
    public void the_order_status_should_be(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
