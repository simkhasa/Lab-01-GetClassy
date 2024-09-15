import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class PersonTest {
    private Person person1;
    @BeforeEach
    void setUp() {
        person1 = new Person("0000099", "Mickey", "Mouse", "Mr.", 1999);
    }

    @Test
    void setID() {
        person1.setID("0111111");
        assertEquals("0111111", person1.getID());
    }

    @Test
    void setFirstName() {
        person1.setFirstName("Minnie");
        assertEquals("Minnie", person1.getFirstName());
    }

    @Test
    void setLastName() {
        person1.setLastName("Mice");
        assertEquals("Mice", person1.getLastName());
    }

    @Test
    void setTitle() {
        person1.setTitle("Mrs.");
        assertEquals("Mrs.", person1.getTitle());
    }

    @Test
    void setYOB() {
        person1.setYOB(2000);
        assertEquals(2000, person1.getYOB());
    }

    @Test
    void fullName() {
        assertEquals("Mickey Mouse", person1.fullName());
    }

    @Test
    void formalName() {
        assertEquals("Mr. Mickey Mouse", person1.formalName());
    }

    @Test
    void testToString() {
        assertEquals("Person{ID='0000099', firstName='Mickey', lastName='Mouse', title='Mr.', YOB=1999}", person1.toString());
    }

    @Test
    void toCSV() {
        assertEquals("0000099, Mickey, Mouse, Mr., 1999", person1.toCSV());
    }

    @Test
    void toJSON() {
        assertEquals("{\"ID\":\"0000099\", \"firstName\":\"Mickey\", \"lastName\":\"Mouse\", \"title\":\"Mr.\", \"YOB\":1999}", person1.toJSON());
    }

    @Test
    void toMXL() {
        assertEquals("<Person><ID>0000099</ID><firstName>Mickey</firstName><lastName>Mouse</lastName><title>Mr.</title><YOB>1999</YOB></Person>", person1.toMXL());
    }
}