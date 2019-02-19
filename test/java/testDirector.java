import org.junit.Before;
import org.junit.Test;
import management.Director;

import static org.junit.Assert.assertEquals;

public class testDirector {
    Director director;
    @Before
    public void before(){
        director = new Director("Kat", "NY-23-48-64", 95000.00, "Finance", 1000000.00);
    }

    @Test

    public void testHasName(){
        assertEquals("Kat", director.getName());
    }
    @Test
    public void testHasSalary(){
        assertEquals(95000.00, director.getSalary(), 0.01);
    }
    @Test
    public void testHasNI(){
        assertEquals("NY-23-48-64", director.getNiNumber());
    }
    @Test
    public void testRaiseSalary(){
        director.raiseSalary(12000.00);
        assertEquals(107000.00, director.getSalary(), 0.01);
    }
    @Test
    public void testGetBonus(){
        double result = director.payBonus();
        assertEquals(1900.00, result, 0.01);
    }
    @Test
    public void testHasDepartment(){
        assertEquals("Finance", director.getDeptName());
    }
    @Test
    public void testHasBudget(){
        assertEquals(1000000.00, director.getBudget(), 0.01);
    }
}
