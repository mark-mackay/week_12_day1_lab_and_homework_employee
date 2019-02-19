import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class testDatabaseAdmin {
    DatabaseAdmin dbAdmin;
    @Before
    public void before(){
        dbAdmin = new DatabaseAdmin("Kat", "NY-23-48-64", 95000.00);
    }

    @Test

    public void testHasName(){
        assertEquals("Kat", dbAdmin.getName());
    }
    @Test
    public void testHasSalary(){
        assertEquals(95000.00, dbAdmin.getSalary(), 0.01);
    }
    @Test
    public void testHasNI(){
        assertEquals("NY-23-48-64", dbAdmin.getNiNumber());
    }
    @Test
    public void testRaiseSalary(){
        dbAdmin.raiseSalary(12000.00);
        assertEquals(107000.00, dbAdmin.getSalary(), 0.01);
    }
    @Test
    public void testGetBonus(){
        double result = dbAdmin.payBonus();
        assertEquals(950.00, result, 0.01);
    }

}
