/**
 * 
 */
package world.we.deserve;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cucumber.api.java.en.Given;
import uk.co.jemos.podam.api.PodamFactory;
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
	
	@Given("^We are human beings in particular space-time$")
	public void i_m_a_human_being_in_particular_space_time() throws Throwable {
		HumanBeign s = factory.manufacturePojo(HumanBeign.class);
		System.out.println(s);
	}
	
}
