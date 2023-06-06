import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import person.Man;
import person.Woman;

@Test
public class Other {
//    @BeforeClass //чомусь так не спрацьовує
//    public void creationPerson(){
//        Man man = new Man("John","Breake",45,false);
//        Woman woman = new Woman("Alice","Grey",56,true);
//        }

    public void testManIsRetired() {
        Man man = new Man("John", "Breake", 45, false);
        if (man.getAge() > 65) {
            Assert.assertTrue(man.isRetired(), "Incorrect method for man");
        } else {
            Assert.assertFalse(man.isRetired(), "Incorrect method for man");
        }
    }
        public void testWomanIsRetired () {
            Woman woman = new Woman("Alice", "Grey", 56, true);
            if (woman.getAge() > 60) {
                Assert.assertTrue(woman.isRetired(), "Incorrect method for women");
            } else {
                Assert.assertFalse(woman.isRetired(), "Incorrect method for women");
            }
        }
        public void testRegisterPartner () {
            Woman woman = new Woman("Alice", "Grey", 56, true);
            woman.registerPartner("Brown");
            Assert.assertEquals(woman.getLastName(), "Brown", "Error register partner");
        }
            public void testDeregisterPartner () {
            Woman woman = new Woman("Alice", "Grey", 56, true);
            woman.registerPartner("Brown");
            woman.deregisterPartnership(true);
            Assert.assertEquals(woman.getLastName(), "Grey", "Error deregister partner");
        }

    }
