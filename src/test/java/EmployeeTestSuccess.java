import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;


public class EmployeeTestSuccess {

    @BeforeEach
    void setup(){

    }

    @Test
    void testConstructor(String emName, String emPPS){
        Employee employeeNew =  new Employee("Sarah", "65432T");
        Assertions.assertEquals("Sarah", "Sarah", employeeNew.getEmName());
        Assertions.assertEquals("65432T", "65432T", employeeNew.getEmPPS());

    }

    @Test
    void testNameSuccess(){
        Employee employeeNew =  new Employee("Sarah", "65432T");
        Assertions.assertEquals("Sarah", employeeNew.getEmName());
    }

    @Test
    void testPPSSuccess(){
        Employee employeeNew =  new Employee("Sarah", "65432T");
        Assertions.assertEquals("65432T", employeeNew.getEmPPS());
    }

    @AfterEach
    void teardown(){

    }

}
