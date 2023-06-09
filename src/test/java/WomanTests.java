import org.testng.Assert;
import org.testng.annotations.Test;

public class WomanTests {
    @Test(groups = {"alltests"})
    public void testWomanIsRetiredTrue() {
        person.Woman woman = new person.Woman("Alice", "Grey", 65, true);
        Assert.assertTrue(woman.isRetired(), "Incorrect method for women");
    }
    @Test(groups = {"alltests"})
    public void testWomanIsRetiredFalse() {
        person.Woman woman = new person.Woman("Alice", "Grey", 45, true);
        Assert.assertFalse(woman.isRetired(), "Incorrect method for women");
    }
    @Test(groups = {"alltests"})
    public void testRegisterPartner() {
        person.Woman woman = new person.Woman("Alice", "Grey", 56, true);
        woman.registerPartner("Brown");
        Assert.assertEquals(woman.getLastName(), "Brown", "Error register partner");
    }

    @Test(groups = {"alltests"})
    public void testDeregisterPartner() {
        person.Woman woman = new person.Woman("Alice", "Grey", 56, true);
        woman.registerPartner("Brown");
        woman.deregisterPartnership(true);
        Assert.assertEquals(woman.getLastName(), "Grey", "Error deregister partner");
    }

}
