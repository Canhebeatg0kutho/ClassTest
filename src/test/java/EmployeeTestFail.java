import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTestFail {

    ArrayList<Employee> employees = new ArrayList<Employee>();

    @BeforeEach
    void setUp() {

//        employees.add(new Employee("Shauna","9876543210","Full-time","Woman",22));
//        employees.add(new Employee("Bob","12345679801","Freelance","Non-Binary",19));
//        employees.add(new Employee("Bob","12345679801","Freelance","RonaldoSexual",19));
//        employees.add(new Employee("Bob","12345679801","Freelance","Non-Binary",11));
    }
    @Test
    void testNameFail(){
        Exception nameShortMsg = assertThrows(IllegalArgumentException.class,() ->{new Employee("TJ","12345678912","Contract","Man",66);});
        assertEquals("Your name must be at least 3 characters",nameShortMsg.getMessage());

        Exception nameLongMsg = assertThrows(IllegalArgumentException.class,() ->{new Employee("ovuvuevuevue enyetuenwuevue ugbemugbem osas","12345678912","Contract","Man",66);});
        assertEquals("Your name cannot be longer than 25 characters",nameLongMsg.getMessage());
    }

    @Test
    void testPpsFail(){
        Exception idMsg = assertThrows(IllegalArgumentException.class,() ->{new Employee("Shauna","9876543210","Full-time","Woman",22);});
        assertEquals("This is not a valid PPS number",idMsg.getMessage());
    }

    @AfterEach
    void tearDown() {
    }
}