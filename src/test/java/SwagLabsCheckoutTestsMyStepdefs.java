import com.feudaloverlords.swaglabs.pom.*;
import com.feudaloverlords.swaglabs.utilities.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class SwagLabsCheckoutTestsMyStepdefs
{
    private WebDriver driver;
    HomePage homePage;
    InventoryPage inventoryPage;
    CartPage cartPage;
    CheckoutOnePage checkoutOnePage;
    CheckoutTwoPage checkoutTwoPage;
    CheckoutThreePage checkoutThreePage;

    @Given("I have a web driver")
    public void iHaveAWebDriver()
    {
        if (driver == null)
        {
            driver = DriverFactory.get();
        }

        driver.get("https://www.saucedemo.com/");
        homePage = new HomePage(driver);
    }

    @Given("I am a logged in as a standard user")
    public void iAmALoggedInAsAStandardUser()
    {
        User user = User.STANDARD;
        inventoryPage = homePage.login(user);
    }

    @Given("that I am on step one of the checkout process")
    public void thatIAmOnStepOneOfTheCheckoutProcess()
    {
        GlobalLinks.CART.getPage(driver);

        Assertions.assertEquals("https://www.saucedemo.com/cart.html", driver.getCurrentUrl());
    }

    @When("I enter {string} {string} and {string}")
    public void iEnterAnd(String arg0, String arg1, String arg2)
    {
        cartPage = new CartPage(driver);
        CartPage.Links.CHECKOUT.getPage(driver);

        checkoutOnePage = new CheckoutOnePage(driver);
        checkoutTwoPage = checkoutOnePage.continueCheckout(arg0, arg1, arg2);
    }

    @Then("the page url should be {string}")
    public void thePageUrlShouldBe(String expected)
    {
        Assertions.assertEquals(expected, driver.getCurrentUrl());
    }

    @Given("that I am on step two of the checkout process")
    public void thatIAmOnStepTwoOfTheCheckoutProcess()
    {
        GlobalLinks.CART.getPage(driver);

        cartPage = new CartPage(driver);
        CartPage.Links.CHECKOUT.getPage(driver);

        checkoutOnePage = new CheckoutOnePage(driver);
        checkoutTwoPage = checkoutOnePage.continueCheckout("arg0", "arg1", "arg2");

        Assertions.assertEquals("https://www.saucedemo.com/checkout-step-two.html", driver.getCurrentUrl());
    }

    @Then("the summary total should be equal to the summary subtotal plus tax")
    public void theSummaryTotalShouldBeEqualToTheSummarySubtotalPlusTax()
    {
        double expectedTotal = checkoutTwoPage.getItemTotal(driver) + checkoutTwoPage.getTax(driver);

        Assertions.assertEquals(expectedTotal, (double)checkoutTwoPage.getTotal(driver));
    }

    @Then("click the Finish button")
    public void clickTheFinishButton()
    {
        CheckoutTwoPage.Links.FINISH.getPage(driver);
    }
}
