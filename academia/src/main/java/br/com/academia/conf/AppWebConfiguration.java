package br.com.academia.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.academia.controller.HomeController;
import br.com.academia.dao.CategoryDao;
import br.com.academia.dao.ExercisesDao;
import br.com.academia.dao.TrainingDao;
import br.com.academia.dao.UsersDao;

@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = {HomeController.class, UsersDao.class, CategoryDao.class, TrainingDao.class, ExercisesDao.class})
public class AppWebConfiguration extends WebMvcConfigurerAdapter {
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver ();
		resolver.setPrefix("/WEB-INF/view/");  
        resolver.setSuffix(".jsp");
		return resolver;
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
}

