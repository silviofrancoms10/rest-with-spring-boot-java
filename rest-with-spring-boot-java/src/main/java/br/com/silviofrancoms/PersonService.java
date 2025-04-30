package br.com.silviofrancoms;

import br.com.silviofrancoms.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonService {

    private final AtomicLong counter = new AtomicLong();

    private Logger logger = Logger.getLogger(PersonService.class.getName());

    public List<Person> findAll() {
        logger.info("Finding all People!");
        List<Person> persons = new ArrayList<Person>();
        for (int i = 0; i < 8; i++) {
            Person person = mockPerson(i);
            persons.add(person);
        }
        return persons;
    }

    public Person findById(String id) {
        logger.info("Finding one Person! ");

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Silvio");
        person.setLastName("Franco");
        person.setAddress("Brazil");
        person.setGender("Male");

        return person;
    }
    public Person create(Person person) {
        logger.info("Creating one Person!");
        return person;
    }

    public Person update(String id, Person person) {
        logger.info("Replacing one Person!");
        return person;
    }

    public void delete(String id) {
        logger.info("Deleting one Person!");
    }

    private Person mockPerson(int i) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("FirstName " + i);
        person.setLastName("LastName " + i);
        person.setAddress("Some Address in Brazil");
        person.setGender("Male");
        return person;
    }
}
