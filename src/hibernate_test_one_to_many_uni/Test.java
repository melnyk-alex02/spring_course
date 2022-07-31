package hibernate_test_one_to_many_uni;


import hibernate_test_one_to_many_uni.Entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test {
    public static void main(String[] args) {
        SessionFactory factory =  new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;

        try{
            session = factory.getCurrentSession();
            Department dep = new Department("HR", 230, 1500);
            Employee emp1 = new Employee("oleg", "melnyk", 500);
            Employee emp2 = new Employee("elena", "sechnikov", 400);
            dep.addEmployeeToDepartment(emp1);
            dep.addEmployeeToDepartment(emp2);
            session.beginTransaction();
            session.save(dep);

                    //            Department dep = session.get(Department.class, 1);
//            System.out.println(dep);
//            System.out.println(dep.getEmps());
//            System.out.println(emp);
//            System.out.println(emp.getDepartment());
            session.getTransaction().commit();
            System.out.println("done");
        }
        finally{
            session.close();
            factory.close();
        }
    }
}
