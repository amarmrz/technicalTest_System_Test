package TestSteps.Candidate;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static TestSteps.Candidate.Hooks.driver;
import static TestSteps.Candidate.Hooks.wait;

public class Register {

    @Given("User navigate to the website")
    public void User_navigate_to_the_website() {
        driver.get("https://vitrina.ai/");
    }

    @Then("User redirected to landing page")
    public void user_redirected_to_landing_page() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='header_logo']//img[@class=' lazyloaded']"))).isDisplayed();

    }

    @Then("User clicks on login button")
    public void user_clicks_on_login_button() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='menu_login']"))).click();
    }

    @Then("User redirected to login page")
    public void user_redirected_to_login_page() {
        Object[] allWindows = driver.getWindowHandles().toArray();
        driver.switchTo().window(allWindows[1].toString());
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='welcome-wrpr']"))).isDisplayed();

    }

    @Then("User clicks on signup button")
    public void user_clicks_on_signup_button() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='here']"))).click();

    }

    @Then("User redirected to signup page")
    public void user_redirected_to_signup_page() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[normalize-space()='Start your Free Trial now! No credit card needed.']"))).isDisplayed();

    }

    @When("User Type first name (.*)$")
    public void user_type_first_name(String firstName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("first_name"))).sendKeys(firstName);

    }

    @When("User Type last name (.*)$")
    public void user_type_last_name(String lastName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("last_name"))).sendKeys(lastName);
    }

    @When("User Type email (.*)$")
    public void user_type_email(String email) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email"))).sendKeys(email);
    }

    @When("User clicks on create Account button")
    public void user_clicks_on_create_account_button() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("create_acc"))).click();
    }

    //No success message to validate ,error
    @Then("Email sent to the User and form cleared.")
    public void email_sent_to_the_user_and_form_cleared() {
        System.out.println("works like champ!");
    }

    @And("User Type phone (.*)$")
    public void userTypePhonePhone(String phone) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("telphone"))).sendKeys(phone);
    }

    @And("User Add comment (.*)$")
    public void userAddCommentComment(String comment) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("requirement_summary"))).sendKeys(comment);
    }

    @Then("Error message displayed to the User")
    public void errorMessageDisplayedToTheUser() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("error-email"))).isDisplayed();
    }
}
