package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("elon musk")
    private String name;

    public int getYearOf_Publication() {
        return yearOf_Publication;
    }

    public String getAuthor() {
        return author;
    }

    @Value("ash van")
    private String author;
    @Value("2013")
    private int yearOf_Publication;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
