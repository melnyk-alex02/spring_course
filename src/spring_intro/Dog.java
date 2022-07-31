package spring_intro;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("dogBean")

public class Dog implements Pet{

//    private String name;
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }

    public void init(){
        System.out.println("Class Dog:init method");
    }

    public void destroy(){
        System.out.println("Class Dog:destroy method");
    }
    public Dog(){
        System.out.println("dog bean is created");
    }
    @Override 
    public void say(){
        System.out.println("bow");
    }
}
