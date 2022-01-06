import org.junit.Before;
import org.junit.Test;
import staff.management.Director;
import staff.management.Manager;


import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() { director = new Director("James Cameron","js 21 64 16 A", 200000, "Executive", 1000000);}

    @Test
    public void hasName(){
        assertEquals("James Cameron", director.getName());
    }

    @Test
    public void hasNationalInsuranceNumber(){
        assertEquals("js 21 64 16 A", director.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(200000, director.getSalary());
    }

    @Test
    public void hasDeptName(){
        assertEquals("Executive", director.getDeptName());
    }

    @Test
    public void getBudget(){
        assertEquals(1000000,director.getBudget(),0.0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(204000, director.payBonus(),0.0);
    }

}
