package br.com.silviofrancoms.repository;

import br.com.silviofrancoms.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
