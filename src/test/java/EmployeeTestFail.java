import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

public class EmployeeTestFail {

    @BeforeEach
    void setup(){

    }

    @Test
    void testConstructor(String emName, String emPPS){
        Employee employeeNew =  new Employee("Darah", "65432W");
        Assertions.assertEquals("Sarah","Darah",  employeeNew.getEmName());
        Assertions.assertEquals("65432W", "65432T", employeeNew.getEmPPS());

    }

    @Test
    void testNameFail(){
        Employee employeeNew =  new Employee("Darah", "65432W");
        Assertions.assertEquals("Darah", "Sarah", employeeNew.getEmName());
    }

    @Test
    void testPPSFail(){
        Employee employeeNew =  new Employee("Sarah", "65432W");
        Assertions.assertEquals("65432T", "65432W", employeeNew.getEmPPS());
    }

    @AfterEach
    void teardown(){

    }

}
