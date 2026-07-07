package processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor{
	@Override
    public Object postProcessBeforeInitialization(Object bean,String beanName)throws BeansException{
		System.out.println("4. Before Initialization : "+ beanName);
		return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean,String beanName)throws BeansException {
           System.out.println("6. After Initialization : "+ beanName);
           return bean;
    }
}
