/**
 * 
 */
package world.we.deserve;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author Miguel Ángel Dev (miguelangelprogramacion@gmail.com)
 *
 */
@Component
public class Launch {
	public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(CucumberSampleComponentScan.class);
    	Launch app = context.getBean(Launch.class);
		app.helloworld();		
    }

	/**
	 * Hello World! (this is a strange world)
	 */
	private void helloworld() {
		System.out.println("Hello World!");		
	}
}
