package spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Pet pet = context.getBean("myPet", Pet.class);
//        pet.say();
//        Person person = context.getBean("myPerson", Person.class);
//        Person person1 = context.getBean("myPerson1", Person.class);
//        System.out.println("Surname is " + person1.getSurname());
//        System.out.println("Age is " + person1.getAge());
//
//        System.out.println("Surname is " + person.getSurname());
//        System.out.println("Age is " + person.getAge());
//        System.out.println();
        context.close();
    }
}
