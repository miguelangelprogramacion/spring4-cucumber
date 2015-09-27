/**
 * 
 */
package world.we.deserve.pojo;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author Miguel Ángel Dev (miguelangelprogramacion@gmail.com)
 *
 */
public class HumanBeign {

	int leftLiveDays;
	String name;
	
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
}
