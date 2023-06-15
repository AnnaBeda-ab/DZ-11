import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import person.Man;

public class ManTests {

    @Test(groups = {"alltests"}) //тут я окремим провайдером переберу різні значення пенсійного віку
    public void testManIsRetiredTrue() {
        Man man = new Man("John", "Break", 75, true);
        Assert.assertTrue(man.isRetired(), "Incorrect method for man");
    }

    @Test(groups = {"alltests"}) //тут я окремим провайдером переберу різні значення не пенсійного віку
    public void testManIsRetiredFalse() {
        Man man = new Man("John", "Break", 45, true);
        Assert.assertFalse(man.isRetired(), "Incorrect method for man");
    }
}
