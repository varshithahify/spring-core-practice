package aspectOrientedProgramming;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	@Before("execution(* aspectOrientedProgramming.PaymentService.pay(..))")
public void beforeAdvice(){
		System.out.println("Before Advice:Logging start");
	}
	
	@After("execution(* aspectOrientedProgramming.PaymentService.pay(..))")
	public void afterAdvice(){
			System.out.println("After Advice:Logging end");
		}
	
	@Around("execution(* aspectOrientedProgramming.PaymentService.pay(..))")
	public Object aroundAdvice(ProceedingJoinPoint joinPoint)throws Throwable{
		System.out.println("Around before");
		Object result =joinPoint.proceed();
		System.out.println("Around After");
		return result;
	
	}
}