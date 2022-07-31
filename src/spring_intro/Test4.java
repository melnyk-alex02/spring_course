package spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext2.xml");

//        Dog yourDog = context.getBean("mePet", Dog.class);
////        Dog myDog = context.getBean("myPet", Dog.class);
//        yourDog.say();

        context.close();
    }
}
