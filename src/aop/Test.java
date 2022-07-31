package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Library1 lib = context.getBean("libBean", Library1.class);
        Book book = context.getBean("book", Book.class);

    }
}
