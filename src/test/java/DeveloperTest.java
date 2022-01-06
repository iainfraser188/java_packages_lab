import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() { developer = new Developer("Bill Gates","js 19 64 82 A", 100000);}

    @Test
    public void hasName(){
        assertEquals("Bill Gates", developer.getName());
    }

    @Test
    public void hasNationalInsuranceNumber(){
        assertEquals("js 19 64 82 A", developer.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(100000, developer.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(150000, developer.raiseSalary(50000),0.0);
    }

    @Test
    public void canPayBonus(){

        assertEquals(101000,developer.payBonus(),0.0);

    }


}

