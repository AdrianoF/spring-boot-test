package br.com.adri.request.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.adri.model.Person;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Long>{

}
