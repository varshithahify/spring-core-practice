package awareInterfaces;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class Student implements BeanNameAware,BeanFactoryAware,ApplicationContextAware,EnvironmentAware{
	@Override
    public void setBeanName(String name) {
        System.out.println("Bean Name : " + name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory)throws BeansException {
    	 System.out.println("BeanFactory : " + beanFactory.getClass().getSimpleName());
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    	System.out.println("ApplicationContext : " + applicationContext.getClass().getSimpleName());
    }
               
    @Override
    public void setEnvironment(Environment environment) {
        System.out.println("Java Version : "+ environment.getProperty("java.version"));

                
    }
}
   
           

        
               

   
