/**
 * 
 */
package world.we.deserve;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Miguel Ángel Dev (miguelangelprogramacion@gmail.com)
 *
 */
@Configuration
@ComponentScan
public class CucumberSampleComponentScan {

	public static void main(String[] args) {
        SpringApplication.run(CucumberSampleComponentScan.class, args);
    }
}
