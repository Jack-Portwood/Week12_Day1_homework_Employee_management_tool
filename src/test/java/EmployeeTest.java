import Staff.Employee;
import Staff.Management.Director;
import Staff.Management.Manager;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Test
    public void raiseSalary(){
        employee = new Manager("Daffyd", "AB 42069", 42000, "Bongz & Bluntz");
        assertEquals(42024, employee.raiseSalary(24), 0.1);
    }

    @Test
    public void payBonus(){
        employee = new Manager("Daffyd","AB 42069", 42000, "Bongz & Bluntz");
        assertEquals(420, employee.payBonus(), 0.1);

    }

    @Test
    public void getBudget() {
        employee = new Director("Deek","D-33-K ",34,1000000);
        assertEquals(1000000, employee.getBudget());

    }





}
