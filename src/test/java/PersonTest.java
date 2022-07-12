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

    @Test
    public void testTruePersonEqualsMethod(){
        Person anusha=new Person(1,"Anusha","Yenugu","anusha@gmail.com");
        Person anusha2=new Person(1,"Anusha","Yenugu","anusha@gmail.com");
        Person sree=new Person(2,"Sree","Divisha","sree@gmail.com");
      //  ( )->  Assertions.assertEquals(1,testProducts[0].getId()),

                 Assertions.assertTrue(anusha.getId()==anusha2.getId());
                 Assertions.assertTrue(anusha.getFirstName().equals(anusha2.getFirstName()));
                 Assertions.assertTrue(anusha.getLastName().equals(anusha2.getLastName()));
                 Assertions.assertTrue(anusha.getEmail().equals(anusha2.getEmail()));

    }

    @Test
    public void testFalsePersonEqualsMethod(){
        Person anusha=new Person(1,"Anusha","Yenugu","anusha@gmail.com");
        Person anusha2=new Person(2,"Sree","Divisha","sree@gmail.com");
        Assertions.assertFalse(anusha.getId()==anusha2.getId());
        Assertions.assertFalse(anusha.getFirstName().equals(anusha2.getFirstName()));
        Assertions.assertFalse(anusha.getLastName().equals(anusha2.getLastName()));
        Assertions.assertFalse(anusha.getEmail().equals(anusha2.getEmail()));

    }

    @Test

    public void testHashCodeWhenEqual(){
        Person anusha=new Person(1,"Anusha","Yenugu","anusha@gmail.com");
        Person anusha2=new Person(1,"Anusha","Yenugu","anusha@gmail.com");

       Assertions.assertTrue((anusha.getFirstName().hashCode())==(anusha2.getFirstName().hashCode()));
       Assertions.assertTrue(anusha.getLastName().hashCode()== anusha2.getLastName().hashCode());
       Assertions.assertTrue(anusha.getEmail().hashCode()== anusha2.getEmail().hashCode());

    }

    @Test

    public void testHashCodeWhenNotEqual(){
        Person anusha=new Person(1,"Anusha","Yenugu","anusha@gmail.com");
        Person sree=new Person(2,"Sree","Divisha","sree@gmail.com");

        Assertions.assertFalse((anusha.getFirstName().hashCode())==(sree.getFirstName().hashCode()));
        Assertions.assertFalse(anusha.getLastName().hashCode()== sree.getLastName().hashCode());
        Assertions.assertFalse(anusha.getEmail().hashCode()== sree.getEmail().hashCode());

    }




}
