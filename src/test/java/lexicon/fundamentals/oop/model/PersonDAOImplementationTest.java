package lexicon.fundamentals.oop.model;

import lexicon.fundamentals.oop.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class PersonDAOImplementationTest {
    private PersonDAOImplementation personDAOImplementation;

    @BeforeEach
    public void setup(){
        personDAOImplementation=new PersonDAOImplementation();
    }

    private void setUpPerson(){
        Person anusha=new Person(1,"Anusha","Yenugu","anusha@gmail.com");
        personDAOImplementation.persist(anusha);
    }

    @Test
    void persist() {
        setUpPerson();
        Collection<Person> allPersons=personDAOImplementation.persons;
        assertEquals(allPersons.size(),1);

    }

    @Test
    void findById() {
        setUpPerson();
        Person result=personDAOImplementation.findById(1);
        assertEquals(result.getId(),1);
    }

    @Test
    void findByEmail() {
        setUpPerson();
        Person result=personDAOImplementation.findByEmail("anusha@gmail.com");
        assertEquals(result.getEmail(),"anusha@gmail.com");
    }

    @Test
    void findAll() {
        setUpPerson();
        Collection<Person> findAllResult=personDAOImplementation.findAll();
        assertEquals(findAllResult.size(),1);

    }

    @Test
    void remove() {
        setUpPerson();
        assertEquals(personDAOImplementation.persons.size(),1);
        personDAOImplementation.remove(1);
        assertEquals(personDAOImplementation.persons.size(),0);
    }
}