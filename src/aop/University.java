package aop;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("UniversityBean")
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents(){
        Student st1 = new Student("sidor ivanov", 3, 10.3);
        Student st2 = new Student("ivan sidorov", 5, 5.3);
        Student st3 = new Student("petr skuratov", 2, 8.3);

        students.add(st1);
        students.add(st2);
        students.add(st3);
    }
    public List<Student> getStudents(){
        System.out.println("method begin working getStudents");
        System.out.println(students.get(3));
        System.out.println("information from method getStudents: " + students);
        return students;
    }
}
