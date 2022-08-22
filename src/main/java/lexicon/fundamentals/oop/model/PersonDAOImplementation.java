package lexicon.fundamentals.oop.model;

import lexicon.fundamentals.oop.Person;

import java.util.ArrayList;
import java.util.Collection;

public class PersonDAOImplementation implements PersonDAO {

Collection<Person> persons=new ArrayList<>();
    @Override
    public Person persist(Person person) {
        persons.add(person);
        return person;
    }

    @Override
    public Person findById(int id) {
        for (Person personIdFind: persons) {
            if(personIdFind.getId()==id){
                return personIdFind;
            }

        }
        return null;
    }

    @Override
    public Person findByEmail(String email) {
        for (Person personByEmail:persons) {
            if(personByEmail.getEmail().equals(email)){
                return personByEmail;
            }

        }
        return null;
    }

    @Override
    public Collection<Person> findAll() {
        return persons;
    }

    @Override
    public void remove(int id) {
        for (Person personById:persons) {
            if(personById.getId()==id){
                persons.remove(personById);
                break;
            }

        }

    }
}
