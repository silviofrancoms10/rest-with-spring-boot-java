package br.com.silviofrancoms.repository;

import br.com.silviofrancoms.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> id(Long id);
}
