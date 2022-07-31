package aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {
    @Pointcut("execution(* aggg*(..))")
    public void allAddMethods(){

    }
}
