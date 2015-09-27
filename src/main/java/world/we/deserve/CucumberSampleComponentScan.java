/**
 * 
 */
package world.we.deserve;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

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
	
	@Bean
	public PodamFactory podamFactory() {        
        return new PodamFactoryImpl();
    }
}
