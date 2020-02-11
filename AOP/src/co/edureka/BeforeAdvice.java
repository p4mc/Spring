package co.edureka;

import java.lang.reflect.Method;
import java.util.Date;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("LOG: calling method "+arg0.getName()+" with "+arg1.length+" arguments @ "+new Date());
		
	}


}
