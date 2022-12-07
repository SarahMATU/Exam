import java.util.*;

public class EmployeeList {

    ArrayList<Employee> newEmployee = new ArrayList<Employee>();

    public List<Employee> getEmployee(){
    return newEmployee;
}

    public void addEmployees(Employee obj){

            Employee newEmp = new Employee(obj.getEmName(), obj.getEmPPS());
            newEmployee.add(newEmp);

    }

    public void getListSize(){

        System.out.println("Current Employee Count is: "+ newEmployee.size());

    }

}
