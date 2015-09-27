/**
 * 
 */
package world.we.deserve;

import java.util.ArrayList;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import uk.co.jemos.podam.api.PodamFactory;
import world.we.deserve.bo.SpaceTime;
import world.we.deserve.pojo.HumanBeign;

/**
 * @author Miguel Ángel Dev (miguelangelprogramacion@gmail.com)
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:cucumber.xml")
public class ExistenceStepsdef {
	
	@Autowired
	PodamFactory factory;
	
	@Autowired
	SpaceTime spaceTime;
	
	@Given("^We are human beings in particular space-time$")
	public void i_m_a_human_being_in_particular_space_time() throws Throwable {
		ArrayList list = factory.manufacturePojo(ArrayList.class,HumanBeign.class);
		spaceTime.register(list);
	}
	
	@When("^A day is finished$")
	public void a_day_is_finished() throws Throwable {
		spaceTime.aDayIsFinished();
	}
}
