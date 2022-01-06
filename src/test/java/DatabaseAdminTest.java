import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;


    @Before
    public void before() { databaseAdmin = new DatabaseAdmin("Donald Trump","js 19 64 82 A", 100000);}

    @Test
    public void hasName(){
        assertEquals("Donald Trump", databaseAdmin.getName());
    }

    @Test
    public void hasNationalInsuranceNumber(){
        assertEquals("js 19 64 82 A", databaseAdmin.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(100000, databaseAdmin.getSalary());
    }


    @Test
    public void canRaiseSalary(){
        assertEquals(150000, databaseAdmin.raiseSalary(50000),0.0);
    }

    @Test
    public void canPayBonus(){

        assertEquals(101000,databaseAdmin.payBonus(),0.0);

    }


}
