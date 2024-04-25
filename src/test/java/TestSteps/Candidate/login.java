package TestSteps.Candidate;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static TestSteps.Candidate.Hooks.wait;

public class login {
    @When("User Type password (.*)$")
    public void user_type_passwords(String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys(password);

    }

    @Then("Error message should be displayed to the User")
    public void Error_message_displayed_to_the_user() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='err-wrpr text']"))).isDisplayed();
    }

    @When("User Type username (.*)$")
    public void userTypeUsernameUsername(String userName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys(userName);
    }

    @And("User clicks on submit button")
    public void userClicksOnSubmitButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Login']"))).click();
    }
}
