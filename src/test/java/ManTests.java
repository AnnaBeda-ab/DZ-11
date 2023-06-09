import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import person.Man;

public class ManTests {
    private Man man;
    @BeforeClass
    public void setMan(){
        man = new Man("John", "Break", 75, true);
    }

    @Test(groups = {"alltests"}) //цей тест фейл,розраховую що бере об'єкт із 10 строки?
    public void testManIsRetiredTrue() {
        Assert.assertTrue(man.isRetired(), "Incorrect method for man");
    }

    @Test(groups = {"alltests"})
    public void testManIsRetiredFalse() {
        man.setAge(45);
        Assert.assertFalse(man.isRetired(), "Incorrect method for man");
    }
}
