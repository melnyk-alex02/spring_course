package spring_intro;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



@Component("personBean")
public class Person {
     @Autowired
     @Qualifier("catBean")
    private Pet pet;
//    @Value("${person.surname}")
    private String surname;
//    @Value("${person.age}")
    private int age;
    public void setSurname(String surname) {
        System.out.println("person surname was created");
        this.surname = surname;
    }

    public void setAge(int age) {
        System.out.println("person age was created");
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
//        @Autowired
        Person(@Qualifier("catBean") Pet pet){
        System.out.println("person bean is created");
        this.pet = pet;
    }
    public Person(){
        System.out.println("person bean is created");
    }

    public void setPet(Pet pet) {
        System.out.println("class person : set pet");
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hello pet");
        pet.say();
    }
}
