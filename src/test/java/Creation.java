import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import person.Man;

public class Creation {

    Man man = new Man("John", "Break", 25, true);

    @Test(description="checks geting first name of created object")
    public void testGettingFirstName() {
        Assert.assertEquals(man.getFirstName(), "John", "The first name get is incorrect");
    }

    @Test(description = "checks setting first name after creation the object")
    public void testSettingFirstName() {
        man.setFirstName("Alex");
        Assert.assertEquals(man.getFirstName(), "Alex", "The first name set is incorrect");
    }
    @Test(description="checks getting first name of created object")
    public void testGettingLastName() {
        Assert.assertEquals(man.getLastName(), "Break", "The last name get is incorrect");
    }

    @Test(description = "checks setting last name after creation the object")
    public void testSettingLastName() {
        man.setLastName("Down");
        Assert.assertEquals(man.getLastName(), "Down", "The last name set is incorrect");
    }
    @Test(description="checks geting age of created object")
    public void testGettingAge() {
        Assert.assertEquals(man.getAge(), 25, "The age get is incorrect");
    }

    @Test(description = "checks setting age after creation the object")
    public void testSettingAge() {
        man.setAge(65);
        Assert.assertEquals(man.getAge(), 65, "The age set is incorrect");
    }
}





