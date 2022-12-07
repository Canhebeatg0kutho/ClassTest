import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTestFail {

    @BeforeEach
    void setUp() {
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

    @Test
    void testEmploymentFail(){
        Exception empMsg = assertThrows(IllegalArgumentException.class,() ->{new Employee("Bob","12345679801","Freelance","Non-Binary",19);});
        assertEquals("This is an invalid employment type",empMsg.getMessage());
    }

    @Test
    void testGenderFail(){
        Exception genMsg = assertThrows(IllegalArgumentException.class,() ->{new Employee("Bob","12345679801","Full-time","RonaldoSexual",19);});
        assertEquals("This is not a gender",genMsg.getMessage());
    }

    @Test
    void testAgeFail(){
        Exception ageLowMsg = assertThrows(IllegalArgumentException.class,() ->{new Employee("Bob","12345679801","Contract","Non-Binary",11);});
        assertEquals("Age must be over 16",ageLowMsg.getMessage());

        Exception ageHighMsg = assertThrows(IllegalArgumentException.class,() ->{new Employee("Bob","12345679801","Contract","Non-Binary",80);});
        assertEquals("Age must be under 66",ageHighMsg.getMessage());
    }

    @AfterEach
    void tearDown() {
    }
}