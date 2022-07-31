package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;



@Component
@Aspect
@Order(1)
public class LoggingAndSecurityAspect {
    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAllAddMethods(JoinPoint joinPoint){
        MethodSignature mS = (MethodSignature)joinPoint.getSignature();
        System.out.println("MethodSignature: " + mS);
        System.out.println("MethodSignature.getMethod: " + mS.getMethod());
        System.out.println("MethodSignature.getReturnType(): " + mS.getReturnType());
        System.out.println("MethodSignature.getName: " + mS.getName());

        if(mS.getName().equals("addBook")){
            Object[] arguments = joinPoint.getArgs();
            for(Object obj : arguments){
                if(obj instanceof Book){
                    Book my_book = (Book) obj;
                    System.out.println(my_book.getName() + " " + my_book.getAuthor()+ " "+ my_book.getYearOf_Publication());

                }
                else if(obj instanceof String){
                    System.out.println(obj);
                }
            }
        }

        System.out.println("-------------------------------");
    }
//    @Pointcut("execution(* aop.Library1.get*())")
//    private void allGetMethodsFromLib1(){
//    }
//    @Pointcut("execution(* aop.Library1.return*())")
//    private void allReturnMethodsFromLib1(){
//    }
//    @Pointcut("allReturnMethodsFromLib1() || allGetMethodsFromLib1()")
//    private void allReturnAndGetMethods(){
//
//    }
//    @Before("allGetMethodsFromLib1()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: writing log #1");
//    }
//    @Before("allReturnMethodsFromLib1()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("beforeReturnLoggingAdvice: writing log #2");
//    }
//    @Before("allReturnAndGetMethods()")
//    public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing log #3");
//    }


//    @Pointcut("execution(public * get*())")
//    private void allGetMethods(){
//
//    }
//    @Before("allGetMethods()")
//    public void beforeGetBookAdvice(){
//        System.out.println("beforeGetBookAdvice: trying to get a book ");
//    }
////    @Before("execution(public void returnBook())")
////    public void beforeReturnBookAdvice(){
////        System.out.println("trying to return a book");
//    @Before("allGetMethods()")
//    public void beforeSecurityAdvice(){
//        System.out.println("beforeSecurityAdvice: checking rights for getting a book");
//    }

}
