import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;



public class EmployeeTestFail {

    @BeforeEach
    void setup(){

    }

    void testEmployee(){
        Employee employeeNew = new Employee("Sarah", "65432W");
    }

    @Test
    void testConstructor(String emName, String emPPS){
        Employee employeeNew =  new Employee("Sarah", "65432W");
        Assertions.assertEquals("Darah", employeeNew.getEmName());
        Assertions.assertEquals("6231W", employeeNew.getEmPPS());

    }

    @Test
    void testNameFail(){
        Employee employeeNew = new Employee("Darah", "65432W");

    }

}
