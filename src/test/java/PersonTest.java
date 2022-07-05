import lexicon.fundamentals.oop.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class PersonTest {


    @Test
    public void testThatGetIsWorking() {
        int id=01;
        String firstName="Anusha";
        String lastName="Yenugu";
        String email="anusha@gmail.com";
        Person anusha=new Person(id,firstName,lastName,email);

        Assertions.assertEquals(id, anusha.getId());
        Assertions.assertEquals(firstName,anusha.getFirstName());
        Assertions.assertEquals(lastName,anusha.getLastName());
        Assertions.assertEquals(email,anusha.getEmail());

        }
    @Test

    public void testNullValues(){
        int id=01;
        String firstName="";
        String lastName=null;
        String email=null;
        Person anusha=new Person(id,firstName,lastName,email);

        Assertions.assertEquals(id,anusha.getId());
        Assertions.assertEquals(firstName,anusha.getFirstName());
        Assertions.assertEquals(lastName,anusha.getLastName());
        Assertions.assertEquals(email,anusha.getEmail());


    }




}
