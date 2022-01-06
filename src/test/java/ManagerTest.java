import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;


    @Before
    public void before() { manager = new Manager("Donald Trump","js 19 64 82 A", 100000, "HR");}

    @Test
    public void hasName(){
        assertEquals("Donald Trump", manager.getName());
    }

    @Test
    public void hasNationalInsuranceNumber(){
        assertEquals("js 19 64 82 A", manager.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(100000, manager.getSalary());
    }

    @Test
    public void hasDeptName(){
        assertEquals("HR", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(150000, manager.raiseSalary(50000),0.0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(101000, manager.payBonus(),0.0);
    }
}
