/**
 * 
 */
package world.we.deserve;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author Miguel Ángel Dev (miguelangelprogramacion@gmail.com)
 * Run the feature file (existence.feature) and load scenarios
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty" }, 
glue = { "world.we.deserve", "cucumber.api.spring"}
,features="classpath:existence.feature"
)
public class RunCukesTest {

}
