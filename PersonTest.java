import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class PersonTest {
    private Person person1;
    @BeforeEach
    void setUp() {
        person1 = new Person("000011", "Sneha", "Sim", "Ms.", 1940);
    }

    @Test
    void setID() {
        person1.setID("0111111");
        assertEquals("0111111", person1.getID());
    }

    @Test
    void setFirstName() {
        person1.setFirstName("neha");
        assertEquals("neha", person1.getFirstName());
    }
    }

    @Test
    void setTitle() {
        person1.setTitle("Ms.");
        assertEquals("Ms.", person1.getTitle());
    }

    @Test
    void setYOB() {
        person1.setYOB(1042);
        assertEquals(1042, person1.getYOB());
    }

    @Test
    void fullName() {
        assertEquals("Sneha Sim", person1.fullName());
    }

    @Test
    void formalName() {
        assertEquals("Ms. Sneha Sim", person1.formalName());
    }

    @Test
    void testToString() {
        assertEquals("Person{ID='000011', firstName='Sneha', lastName='Sim', title='Mr.', YOB=1940}", person1.toString());
    }

    @Test
    void toCSV() {
        assertEquals("0000011, Sneha, Sim, Ms., 1940", person1.toCSV());
    }

    @Test
    void toJSON() {
        assertEquals("{\"ID\":\"0000011\", \"firstName\":\"Sneha\", \"lastName\":\"Sim\", \"title\":\"Ms.\", \"YOB\":1940}", person1.toJSON());
    }

    @Test
    void toMXL() {
        assertEquals("<Person><ID>0000011</ID><firstName>Sneha</firstName><lastName>Sim</lastName><title>Ms.</title><YOB>1940</YOB></Person>", person1.toMXL());
    }
}
