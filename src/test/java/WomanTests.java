import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import person.Person;
import person.Woman;

public class WomanTests {
   Woman woman;

    @BeforeClass (alwaysRun = true)
    public void setWoman() {
         woman = new Woman("Alice", "Grey", 65, true);
    }

    @Test(groups = {"alltests"})
    public void testWomanIsRetiredTrue() {
        woman.setAge(70);
        Assert.assertTrue(woman.isRetired(), "Incorrect method for women");
    }

    @Test(groups = {"alltests"})
    public void testWomanIsRetiredFalse() {
        woman.setAge(45);
        Assert.assertFalse(woman.isRetired(), "Incorrect method for women");
    }

    @Test(groups = {"alltests"})
    public void testRegisterPartner() {
        woman.registerPartner("Brown");
        Assert.assertEquals(woman.getLastName(), "Brown", "Error register partner");
    }

    @Test(groups = {"alltests"})
    public void testDeregisterPartner() {
        woman.registerPartner("Blue");
        woman.deregisterPartnership(true);
        Assert.assertEquals(woman.getLastName(), "Grey", "Error deregister partner");
    }

}
