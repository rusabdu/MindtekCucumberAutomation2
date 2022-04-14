package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.OrangeHRMHomePage;
import pages.OrangeHRMLoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class OrangeHRMSteps {

    WebDriver driver= Driver.getDriver();
    OrangeHRMLoginPage orangeHRMLoginPage=new OrangeHRMLoginPage();
    OrangeHRMHomePage orangeHRMHomePage=new OrangeHRMHomePage();

    @Given("user navigates to the OrangeHRM application")
    public void user_navigates_to_the_OrangeHRM_application() {
        driver.get(ConfigReader.getProperty("OrangeURL"));
    }

//    @When("user gives username {string} and password {string}")
  //  public void user_provides_username_and_password(String username, String password) {
    //    orangeHRMLoginPage.username.sendKeys(username);
  //      orangeHRMLoginPage.password.sendKeys(password);
  //      orangeHRMLoginPage.loginButton.click();

   // }
   @When("user gives username {string} and password {string}")
   public void user_gives_username_and_password(String username, String password) {
       orangeHRMLoginPage.username.sendKeys(username);
       orangeHRMLoginPage.password.sendKeys(password);
       orangeHRMLoginPage.loginButton.click();

   }
    @Then("user selects time header and clicks on Timesheet dropdown and clicks on My Timesheet option")
    public void user_selects_time_header_and_clicks_on_Timesheet_dropdown_and_clicks_on_My_Timesheet_option() {
        orangeHRMHomePage.timeModule.click();
        orangeHRMHomePage.myTimeModule.click();

    }


    @And("user navigates to the edit page by clicking on edit button")
    public void user_navigates_to_the_edit_page_by_clicking_on_edit_button() {
        orangeHRMHomePage.editButton.click();

    }

    @And("user clicks on reset button")
    public void user_clicks_on_reset_button() {
        orangeHRMHomePage.resetButton.click();

    }

}
