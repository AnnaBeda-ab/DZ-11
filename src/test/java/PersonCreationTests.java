import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import person.Man;
import person.Woman;

public class PersonCreationTests {
     Man man;
    public Woman woman;

    @BeforeClass(alwaysRun = true)
    public void createPerson() {
        man = new Man("John", "Break", 25, true);
        woman = new person.Woman("Alice", "Grey", 56, true);
    }

    @Test(description = "checks getting first name of created object", groups = {"alltests", "setget"})
    public void testGettingFirstName() {
        Assert.assertEquals(man.getFirstName(), "John", "The first name get is incorrect");
    }

    @Test(description = "checks setting first name after creation the object", groups = {"alltests", "setget"})
    public void testSettingFirstName() {
        man.setFirstName("Alex");
        Assert.assertEquals(man.getFirstName(), "Alex", "The first name set is incorrect");
    }

    @Test(description = "checks getting last name of created object", groups = {"alltests", "setget"})
    public void testGettingLastName() {
        Assert.assertEquals(man.getLastName(), "Break", "The last name get is incorrect");
    }

    @Test(description = "checks setting last name after creatoin the object", groups = {"alltests", "setget"})
    public void testSettingLastName() {
        man.setLastName("Down");
        Assert.assertEquals(man.getLastName(), "Down", "The last name set is incorrect");
    }

    @Test(description = "checks getting age of created object", groups = {"alltests", "setget"})
    public void testGettingAge() {
        Assert.assertEquals(man.getAge(), 25, "The age get is incorrect");
    }

    @Test(description = "checks setting age after creation the object", groups = {"alltests", "setget"})
    public void testSettingAge() {
        man.setAge(65);
        Assert.assertEquals(man.getAge(), 65, "The age set is incorrect");
    }
}


