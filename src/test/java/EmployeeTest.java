import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
class EmployeeTest {
   private Employee employee;
    ArrayList<Employee> employees = new ArrayList<Employee>();


    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        employees.add(new Employee("Richard","12345678912","Contract","Man",66));
        employees.add(new Employee("Shauna","98765432109","Full-time","Woman",22));
        employees.add(new Employee("Bob","12345679801","Part-time","Non-Binary",19));
    }

    @Test
    void testNamePass(){
        assertEquals("Richard",employees.get(0).getName());
    }

    @Test
    void testPpsPass(){
        assertEquals("12345678912",employees.get(0).getId());
    }

    @Test
    void testEmploymentPass(){
        assertEquals("Contract",employees.get(0).getEmployment());
        assertEquals("Full-time",employees.get(1).getEmployment());
        assertEquals("Part-time",employees.get(2).getEmployment());
    }

    @Test
     void test

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
}