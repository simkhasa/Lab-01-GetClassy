import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class SafeInputObject {
    private Product product1;
    @BeforeEach
    void setUp() {
        product1 = new Product("111", "cake", "pink", 2.99);
    }
    @Test
    void setName() {
        product1.setName("muffin");
        assertEquals("muffin", product1.getName());
    }
    @Test
    void setDescription() {
        product1.setDescription("brownie");
        assertEquals("brownie", product1.getDescription());
    }

    @Test
    void setPrice() {
        product1.setCost(3.99);
        assertEquals(3.99, product1.getCost());
    }

    @Test
    void testToString() {
        assertEquals("Product{id='111', name='cake', description='pink', price=2.99}", product1.toString());
    }

    @Test
    void toCSV() {
        assertEquals("111,cake,pink,2.99", product1.toCSV());
    }

    @Test
    void toJSON() {
        assertEquals("{\"id\":\"111\", \"name\":\"cake\", \"description\":\"pink\", \"price\":2.99}", product1.toJSON());
    }

    @Test
    void toXML() {
        assertEquals("<Product><id>111</id><name>cake</name><description>pink</description><price>2.99</price></Product>", product1.toXML());
    }
}
