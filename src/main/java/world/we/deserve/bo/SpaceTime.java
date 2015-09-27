/**
 * 
 */
package world.we.deserve.bo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import world.we.deserve.design.observer.Observer;
import world.we.deserve.design.observer.Subject;
import world.we.deserve.pojo.HumanBeign;

/**
 * @author Miguel Ángel Dev (miguelangelprogramacion@gmail.com)
 *
 */
@Component
public class SpaceTime implements Subject<HumanBeign>{
	
	private List<HumanBeign> observers;
	private String message;
	private boolean changed;
	private final Object MUTEX= new Object();
	
	/**
	 * 
	 */
	public SpaceTime() {
		super();
		observers = new ArrayList<HumanBeign>();
	}

	public void register(List<HumanBeign> observerList)
	{
		observerList.forEach(obj -> register(obj));
	}
	
	/* (non-Javadoc)
	 * @see world.we.deserve.design.observer.Subject#register(java.util.Observer)
	 */
	@Override
	public void register(HumanBeign obj) {
		if(obj == null) throw new NullPointerException("Null Observer");
		if(!observers.contains(obj)) observers.add(obj);		
	}

	/* (non-Javadoc)
	 * @see world.we.deserve.design.observer.Subject#unregister(java.util.Observer)
	 */
	@Override
	public void unregister(HumanBeign obj) {
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
	public Object getUpdate(HumanBeign obj) {
		return this.message;
	}

	/**
	 * Notify to all registered HB, that one day is finished
	 */
	public void aDayIsFinished() {		
		this.notifyObservers();
	}
}
