package hibernate_one_to_many;

import hibernate_one_to_many.Entity.Department;
import hibernate_one_to_many.Entity.Employee;
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
//            Department dep = new Department("IT", 100, 500);
//            Employee emp1 = new Employee("sasha", "loh", 200 );
//            Employee emp2 = new Employee("oleg", "koniv", 101);
//            Employee emp3 = new Employee("nina","osipova", 122);
//            Employee emp4 = new Employee("igor", "sincev", 400);
//
//
//
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//            dep.addEmployeeToDepartment(emp3);
//            dep.addEmployeeToDepartment(emp4);

            System.out.println("get departmentr");


            session.beginTransaction();
//            session.save(dep);
            Department dep = session.get(Department.class, 1);
            System.out.println("show department");
            System.out.println(dep);
            System.out.println("loading out other components");
            dep.getEmps().get(0);
            session.getTransaction().commit();
            System.out.println("show employees of the department");
            System.out.println(dep.getEmps());
            System.out.println("Done");
        }
        finally{
            session.close();
            factory.close();
        }
    }
}
