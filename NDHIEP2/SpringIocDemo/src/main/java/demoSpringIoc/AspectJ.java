package demoSpringIoc;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AspectJ {
		@Before ("execution(* demoSpringIoc.HelloOPA.*(..))")
		public void logBefore(JoinPoint joinPoint) {
		    System.out.println("before method: " + joinPoint.getSignature().getName());
			
		
	}

}
