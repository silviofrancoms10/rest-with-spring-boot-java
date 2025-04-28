package br.com.silviofrancoms;

import br.com.silviofrancoms.model.Person;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonService {

    private final AtomicLong counter = new AtomicLong();

    private Logger logger = Logger.getLogger(PersonService.class.getName());

    public Person findById(String id) {
        logger.info("Finding one Person! " + id);

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Silvio");
        person.setLastName("Franco");
        person.setAddress("Brazil");
        person.setGender("Male");

        return person;
    }
}
