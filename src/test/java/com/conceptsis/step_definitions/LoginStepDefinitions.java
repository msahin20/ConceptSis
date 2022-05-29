package com.conceptsis.step_definitions;

import com.conceptsis.pages.LoginPage;
import com.conceptsis.utilitites.ConfigurationReader;
import com.conceptsis.utilitites.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginStepDefinitions {
    LoginPage loginPage =new LoginPage();

    @Given("User is on the Login Page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get("https://conceptsis.com/Login.aspx");

    }
    @When("User enters username")
    public void user_enters_username() {
        loginPage.inputBox.sendKeys(ConfigurationReader.getProperty("username")+ Keys.ENTER);

    }
    @When("User enters password")
    public void user_enters_password() throws InterruptedException {
        Thread.sleep(2000);
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
        Thread.sleep(2000);
        loginPage.submit.click();
        //Thread.sleep(3000);

    }


    @Then("User see the title {string}")
    public void user_see_the_title(String string) {
        String actualTitle = Driver.getDriver().getTitle();
        Driver.closeDriver();
        Assert.assertEquals(string,actualTitle);
    }

}
