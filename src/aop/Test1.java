package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        University uni = context.getBean("UniversityBean", University.class);

        uni.addStudents();
        try {
            List<Student> students = uni.getStudents();
            System.out.println(students);
            }
        catch (IndexOutOfBoundsException i){
            System.out.println("there is no item with this number");
        }
        context.close();
    }
}
