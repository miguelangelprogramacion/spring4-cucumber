/**
 * 
 */
package world.we.deserve;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cucumber.api.java.en.Given;

/**
 * @author Miguel Ángel Dev (miguelangelprogramacion@gmail.com)
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:cucumber.xml")
public class ExistenceStepsdef {
	
	@Autowired
	TestingComponent testingComponent;

	@Given("^I'm a human being in particular space-time$")
	public void i_m_a_human_being_in_particular_space_time() throws Throwable {
		testingComponent.greeting();
	}
	
}
