import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
   public void getNameTest(){
        Person person = new Person();
        person.setName("Test");
        assertEquals("Test", person.getName());
   }
   @Test
    public void getAgeTest(){
        Person person = new Person();
        person.setAge(21);
        assertEquals(21,person.getAge());
    }
    @Test
    public void getWeightTest(){
        Person person = new Person();
        person.setWeight(170);
        assertEquals(170,person.getWeight());
    }
    @Test
    public void getSexTest(){
        Person person = new Person();
        person.setSex('M');
        assertEquals('M',person.getSex());
    }
    @Test
    public void getIDTest(){
        Person person = new Person();
        person.setId(1.0);
        assertEquals(1.0,person.getId());
    }

}