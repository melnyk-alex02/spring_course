package spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Dog dog = context.getBean("dogBean", Dog.class);
        Dog dog1 = context.getBean("dogBean", Dog.class);
        System.out.println(dog.equals(dog1));

        context.close();
    }
}
