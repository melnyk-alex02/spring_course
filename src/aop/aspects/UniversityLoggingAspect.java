package aop.aspects;

import aop.Student;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
//    @Before("execution(*  getStudents())")
//    public void beforeGetStudentsLoggingAdvice(){
//        System.out.println("beforeGetStudentsLoggingAdvice: logging getting list of students before method ");
//    }
//
//    @AfterReturning(pointcut = "execution(*  getStudents())", returning = "students")
//    public void AfterReturningGetStudentsLoggingAdvice(List<Student>students) {
//        Student firstStudent  = students.get(0);
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "Mr." + nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//
//        double averageGrade = firstStudent.getAverageGrade();
//        averageGrade = averageGrade + 1;
//        firstStudent.setAverageGrade(averageGrade);
//
//        System.out.println("AfterReturningGetStudentsLoggingAdvice: logging getting list of students after method ");
//    }
//    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
//    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception){
//    System.out.println("afterThrowingGetStudentsLoggingAdvice: logging throwing exception");
//}
    @Around("execution( public String  returnBook())")
    public Object afterGetStudentsAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("afterGetStudentsAdvice: trying to return book");
        Object targetMethodReturning = null;
        try {
            targetMethodReturning = proceedingJoinPoint.proceed();

        }
        catch(Exception t){
            System.out.println("afterGetStudentsAdvice: exception was caught "  +  t);
            throw t;

        }
        System.out.println("afterGetStudentsAdvice: logging after successful returning");
        return targetMethodReturning;
    }
}
