package io.thoughtscript.example.acceptance;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;

import static org.junit.jupiter.api.Assertions.assertEquals;

//These all have to be public visibility
@Slf4j
public class StepDefinitions {

    private int actual;

    //These all have to be public visibility
    @Given("some number crunching")
    public void setup() {
        log.info("prepping...");
    }

    @When("I multiply {int} and {int}")
    public void multiply(Integer x, Integer y) {
        log.debug("Multiplying {} and {}", x, y);
        actual = x * y;
    }

    @When("I add {int} {int} and {int}")
    public void tripleAddition(Integer x, Integer y, Integer z) {
        log.debug("Adding {} {} and {}", x, y, z);
        actual = x + y + z;
    }

    @Then("the result is {int}")
    public void the_result_is(Integer expected) {
        log.info("Result: {} (expected {})", actual, expected);
        assertEquals(expected, actual);
    }
}
