package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import controller.MainController;
 
@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = {MainController.class})
public class ApplicationConfiguration {
     
 
}
