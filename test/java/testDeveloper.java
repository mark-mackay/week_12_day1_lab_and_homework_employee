import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;


public class testDeveloper {
    Developer developer;
    @Before
    public void before(){
        developer = new Developer("Kat", "NY-23-48-64", 95000.00);
    }

    @Test

    public void testHasName(){
        assertEquals("Kat", developer.getName());
    }
    @Test
    public void testHasSalary(){
        assertEquals(95000.00, developer.getSalary(), 0.01);
    }
    @Test
    public void testHasNI(){
        assertEquals("NY-23-48-64", developer.getNiNumber());
    }
    @Test
    public void testRaiseSalary(){
        developer.raiseSalary(12000.00);
        assertEquals(107000.00, developer.getSalary(), 0.01);
    }
    @Test
    public void testGetBonus(){
        double result = developer.payBonus();
        assertEquals(950.00, result, 0.01);
    }
    @Test
    public void testSendNullName(){
        String nullObject = null;
        developer.setName(nullObject);
        assertEquals("Kat", developer.getName());
    }
}
