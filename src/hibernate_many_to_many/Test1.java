package hibernate_many_to_many;


import hibernate_many_to_many.Entity.Children;
import hibernate_many_to_many.Entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Children.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;

        try{
            session = factory.getCurrentSession();



//            Children child = new Children("ira", 15);
//
//            Section section = new Section("dance");
//            Section section1 = new Section("chess");
//            Section section2 = new Section("pool");
//
//            child.addSectionToChildren(section);
//            child.addSectionToChildren(section1);
//            child.addSectionToChildren(section2);
//            Section section1 = new Section("math");
//            Children child1 = new Children("dave", 9);
//            Children child2 = new Children("michale ", 12);
//            Children child3 = new Children("egor", 8);
//
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);

            session.beginTransaction();
            Children child = session.get(Children.class , 8);
            session.delete(child);


//            Children child = session.get(Children.class, 4);
//            System.out.println(child);
//            System.out.println();
//            System.out.println(child.getSections());
//            Section section = session.get(Section.class, 3);
//
//            System.out.println(section);
//            System.out.println();
//            System.out.println(section.getChildrenList());\

//            Section section = session.get(Section.class, 1);
//            session.delete(section);
            session.getTransaction().commit();
            System.out.println("done");
        }
        finally{
            session.close();
            factory.close();
        }
    }
}
