import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import person.Man;

public class ManTests {
    Man man;
    @BeforeClass (alwaysRun = true)
    public void setMan(){
        man = new Man("John", "Break", 75, true);
    }

    @Test(groups = {"alltests"}) 
    public void testManIsRetiredTrue() {
        man.setAge(75);
        Assert.assertTrue(man.isRetired(), "Incorrect method for man");
    }

    @Test(groups = {"alltests"})
    public void testManIsRetiredFalse() {
        man.setAge(45);
        Assert.assertFalse(man.isRetired(), "Incorrect method for man");
    }
}
