package hibernate_test_one_to_many_uni.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "departments")
public class Department {
    public Department(){}

    public Department(String department_name, int min_salary, int max_salary) {
        this.department_name = department_name;
        this.min_salary = min_salary;
        this.max_salary = max_salary;
    }

    public void addEmployeeToDepartment(Employee employee){
        if(emps == null){
            emps = new ArrayList<Employee>();
        }
        emps.add(employee);

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String department_name;
    @Column(name = "min_salary")
    private int min_salary;
    @Column(name = "max_salary")
    private int max_salary;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name ="department_id")
    private List<Employee> emps;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public int getMin_salary() {
        return min_salary;
    }

    public void setMin_salary(int min_salary) {
        this.min_salary = min_salary;
    }

    public int getMax_salary() {
        return max_salary;
    }

    public void setMax_salary(int max_salary) {
        this.max_salary = max_salary;
    }

    public List<Employee> getEmps() {
        return emps;
    }

    public void setEmps(List<Employee> emps) {
        this.emps = emps;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", department_name='" + department_name + '\'' +
                ", min_salary=" + min_salary +
                ", max_salary=" + max_salary +
                '}';
    }
}
