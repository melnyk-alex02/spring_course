package aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("libBean")
public class Library1 {
//    public void getBook(){
//        System.out.println("get book");
//        System.out.println("-------------------------------");
//    }
    public String returnBook(){
        int a = 10/0;
        System.out.println("return book");
        return "elon musk";
    }

    public void getMagazine(){
        System.out.println("get magazine");
        System.out.println("-------------------------------");
    }
    public void returnMagazine(){
        System.out.println("return magazine");
        System.out.println("-------------------------------");
    }
    public void addBook(String person_name, Book book){
        System.out.println("adding a book to library");
        System.out.println("-------------------------------");
    }
    public void addMagazine(){
        System.out.println("adding a magazine to library");
        System.out.println("-------------------------------");
    }
}
