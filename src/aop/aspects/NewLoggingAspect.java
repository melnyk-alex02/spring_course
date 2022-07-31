package aop.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {
//    @Around("execution(* returnBook())")
//    public void aroundReturnBookAdvice(){
//        System.out.println("aroundReturnBookAdvice: someone returning book to a library");
//    }
}
