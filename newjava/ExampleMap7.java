import java.util.ArrayList;
import java.util.List;

class Employee{
    int eid;
    String name;
    String branch;

    Employee(int eid,String name,String branch){
        this.eid=eid;
        this.name=name;
        this.branch=branch;
    }
}
class EmployeeDto{
   String name;
    EmployeeDto(String name) {
        super();
        this.name=name;

    }

    @Override
    public String toString() {
        return name;
    }
    
}
public class ExampleMap7 {
    public static void main(String[] args) {
         ArrayList<Employee> list=new ArrayList<Employee>();
        list.add(new Employee(1,"Ankit","CSE"));
        list.add(new Employee(2,"Rahul","MCA"));
        
        List<EmployeeDto> grace5=list.stream().map(emp->new EmployeeDto(emp.name)).toList();
        System.out.println(grace5);
        
    }
}