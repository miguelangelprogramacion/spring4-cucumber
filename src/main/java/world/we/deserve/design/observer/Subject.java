/**
 * 
 */
package world.we.deserve.design.observer;

import world.we.deserve.design.observer.Observer;

/**
 * @author Miguel Ángel Dev (miguelangelprogramacion@gmail.com)
 * Taken from: http://www.javacodegeeks.com/2013/08/observer-design-pattern-in-java-example-tutorial.html
 */
public interface Subject<T extends Observer> {

	//methods to register and unregister observers
	public void register(T obj);
	public void unregister(T obj);

	//method to notify observers of change
	public void notifyObservers();

	//method to get updates from subject
	public Object getUpdate(T obj);

}
