import org.junit.Before;
import org.junit.Test;
import management.Manager;

import static org.junit.Assert.assertEquals;

public class testManager {
    Manager manager;
    @Before
    public void before(){
        manager = new Manager("Kat", "NY-23-48-64", 95000.00, "Finance");
    }

    @Test

    public void testManagerHasName(){
        assertEquals("Kat", manager.getName());
    }
    @Test
    public void testManagerHasSalary(){
        assertEquals(95000.00, manager.getSalary(), 0.01);
    }
    @Test
    public void testManagerHasNI(){
        assertEquals("NY-23-48-64", manager.getNiNumber());
    }
    @Test
    public void testRaiseSalary(){
        manager.raiseSalary(12000.00);
        assertEquals(107000.00, manager.getSalary(), 0.01);
    }
    @Test
    public void testGetBonus(){
        double result = manager.payBonus();
        assertEquals(950.00, result, 0.01);
    }
    @Test
    public void testHasDepartment(){
        assertEquals("Finance", manager.getDeptName());
    }
}
