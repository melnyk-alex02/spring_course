package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("method main starts");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Library1 lib = context.getBean("libBean", Library1.class);
        String bookName = lib.returnBook();
        System.out.println("book which were returned " + bookName);

        context.close();
        System.out.println("method main ends");
    }
}
