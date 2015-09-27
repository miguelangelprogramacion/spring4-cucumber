/**
 * 
 */
package world.we.deserve.pojo;

import org.apache.commons.lang3.builder.ToStringBuilder;

import uk.co.jemos.podam.common.PodamIntValue;
import world.we.deserve.design.observer.Observer;
import world.we.deserve.design.observer.Subject;

/**
 * @author Miguel Ángel Dev (miguelangelprogramacion@gmail.com)
 *
 */
public class HumanBeign implements Observer{

	@PodamIntValue(minValue = 0, maxValue = 36525)
	private int leftLiveDays;
	private String name;
	
	/**
	 * 
	 */
	public HumanBeign() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	/**
	 * @param leftLiveDays
	 * @param name
	 */
	public HumanBeign(String name, int leftLiveDays) {
		super();
		this.leftLiveDays = leftLiveDays;
		this.name = name;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the leftLiveDays
	 */
	public int getLeftLiveDays() {
		return leftLiveDays;
	}

	/**
	 * @param leftLiveDays the leftLiveDays to set
	 */
	public void setLeftLiveDays(int leftLiveDays) {
		this.leftLiveDays = leftLiveDays;
	}
	
	public String toString() {
	     return new ToStringBuilder(this).
	       append("name", name).
	       append("leftLiveDays", leftLiveDays).
	       toString();
	   }


	/* (non-Javadoc)
	 * @see world.we.deserve.design.observer.Observer#update()
	 */
	@Override
	public void update() {
		this.leftLiveDays -= 1;		
	}
}
