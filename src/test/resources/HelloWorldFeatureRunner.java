package test.resources;

import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(value = Cucumber.class)
@Cucumber.Options(tags={"@hello"})
public class HelloWorldFeatureRunner {
}
