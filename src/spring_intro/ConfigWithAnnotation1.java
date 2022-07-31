package spring_intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class ConfigWithAnnotation1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Cat cat = context.getBean("catBean", Cat.class);
//
//        cat.say();

//        Person person = context.getBean("personBean", Person.class);
//        person.callYourPet();


//        System.out.println(person.getSurname());
//        System.out.println(person.getAge());

        context.close();
    }
}