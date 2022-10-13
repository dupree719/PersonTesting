import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person person;

    @BeforeEach
    void setUp() {
        person = new Person("Isaiah", 21, 160, 'M', 719.0);
    }

    @Test
    public void testConstructor() {
        // When
        String personName = person.getName();
        int personAge = person.getAge();
        int personWeight = person.getWeight();
        char personSex = person.getSex();
        double personId = person.getId();

        // Then
        assertEquals(person.getName(), personName);
        assertEquals(person.getAge(), personAge);
        assertEquals(person.getWeight(), personWeight);
        assertEquals(person.getSex(), personSex);
        assertEquals(person.getId(), personId);
    }

    @Test
    public void setNameTest() {

        person.setName("Test");
        assertEquals("Test", person.getName());
    }

    @Test
    public void setAgeTest() {
        person.setAge(25);
        assertEquals(25, person.getAge());
    }

    @Test
    public void setWeightTest() {
        person.setWeight(170);
        assertEquals(170, person.getWeight());
    }

    @Test
    public void setSexTest() {
        person.setSex('F');
        assertEquals('F', person.getSex());
    }

    @Test
    public void setIDTest() {
        person.setId(1.0);
        assertEquals(1.0, person.getId());
    }
}
