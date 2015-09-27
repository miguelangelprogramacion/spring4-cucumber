/**
 * 
 */
package world.we.deserve.bo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import world.we.deserve.design.observer.Observer;
import world.we.deserve.design.observer.Subject;

/**
 * @author Miguel Ángel Dev (miguelangelprogramacion@gmail.com)
 *
 */
@Component
public class SpaceTime implements Subject{
	
	private List<Observer> observers;
	private String message;
	private boolean changed;
	private final Object MUTEX= new Object();

	
	public void register(List<Observer> observerList)
	{
		observers.addAll(observerList);
	}
	
	/* (non-Javadoc)
	 * @see world.we.deserve.design.observer.Subject#register(java.util.Observer)
	 */
	@Override
	public void register(Observer obj) {
		if(obj == null) throw new NullPointerException("Null Observer");
		if(!observers.contains(obj)) observers.add(obj);		
	}

	/* (non-Javadoc)
	 * @see world.we.deserve.design.observer.Subject#unregister(java.util.Observer)
	 */
	@Override
	public void unregister(Observer obj) {
		 observers.remove(obj);	
	}

	/* (non-Javadoc)
	 * @see world.we.deserve.design.observer.Subject#notifyObservers()
	 */
	@Override
	public void notifyObservers() {
		List<Observer> observersLocal = null;
		//synchronization is used to make sure any observer registered after message is received is not notified
		synchronized (MUTEX) {
			if (!changed) return;
			observersLocal = new ArrayList<>(this.observers);
			this.changed=false;
		}
		observersLocal.forEach(obj -> obj.update());		
	}

	/* (non-Javadoc)
	 * @see world.we.deserve.design.observer.Subject#getUpdate(java.util.Observer)
	 */
	@Override
	public Object getUpdate(Observer obj) {
		return this.message;
	}
}
