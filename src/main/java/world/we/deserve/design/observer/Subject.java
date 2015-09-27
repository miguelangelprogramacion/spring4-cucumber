/**
 * 
 */
package world.we.deserve.design.observer;

import world.we.deserve.design.observer.Observer;

/**
 * @author Miguel Ángel Dev (miguelangelprogramacion@gmail.com)
 * Taken from: http://www.javacodegeeks.com/2013/08/observer-design-pattern-in-java-example-tutorial.html
 */
public interface Subject {

	//methods to register and unregister observers
	public void register(Observer obj);
	public void unregister(Observer obj);

	//method to notify observers of change
	public void notifyObservers();

	//method to get updates from subject
	public Object getUpdate(Observer obj);

}
