package stepDefinition;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginFeature
{
    WebDriver driver;
    @Given("^USER IN A LOGIN PAGE$")
    public void user_IN_A_LOGIN_PAGE() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

//    @When("'TITLE OF LOGIN PAGE$")
//    public void title_page_login()
//    {
//       String title= driver.getTitle();
//       System.out.println(title);
//       Assert.assertEquals("Facebook","title");
//    }
@When("^TITLE OF LOGIN PAGE$")
public void title_OF_LOGIN_PAGE() throws Throwable {
    // Write code here that turns the phrase above into concrete actions

}

}
