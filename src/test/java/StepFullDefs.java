//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.When;
//import io.cucumber.java.en.Then;
//import static org.junit.Assert.*;
//
//static String isItFriday(String today) {
//        return "Friday".equals(today) ? "TGIF" : "Nope";
//        }
//
//public class StepFullDefs {
//    private String today;
//    private String actualAnswer;
//
//    @Given("today is Sunday")
//    public void today_is_Sunday() {
//        today = "Sunday";
//    }
//
//@Given("today is Friday")
//public void today_is_Friday() {
//        today = "Friday";
//        }
//
//    @When("I ask whether it's Friday yet")
//    public void i_ask_whether_it_s_Friday_yet() {
//        actualAnswer = IsItFriday.isItFriday(today);
//    }
//
//    @Then("I should be told {string}")
//    public void i_should_be_told(String expectedAnswer) {
//        assertEquals(expectedAnswer, actualAnswer);
//    }
//}