package spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
//        Dog myDog = context.getBean("myPet", Dog.class);
//        myDog.setName("Grisha");
//        Dog yourDog = context.getBean("myPet", Dog.class);
//        yourDog.setName("sidor");
//
//        System.out.println("My dog name is " + myDog.getName());
//        System.out.println("Your dog name is " + yourDog.getName());
//
//        System.out.println("Does Dog link in one bean?" + myDog.equals(yourDog));
        context.close();
    }
}
