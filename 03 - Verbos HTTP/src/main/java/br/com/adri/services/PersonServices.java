package br.com.adri.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.com.adri.model.Person;

@Service
public class PersonServices {

	//Simular ID do banco de dados
	private final AtomicLong counter = new AtomicLong();
	
	public Person create(Person person) {
		return person;
	}
	
	public Person update(Person person) {
		return person;
	}
	
	public void delete(String id) {
	}
	
	public Person findById(String id) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Adriano");
		person.setLastName("xxxx");
		person.setAddress("Rua Limbo - BR");
		person.setGender("Male");
		return person;
	}
	
	public List<Person> findAll(){
		List<Person> people = new ArrayList<Person>();
		for (int i = 0; i < 8; i++) {
			Person person = mockPerson(i);
			people.add(person);
		}
		return people;
	}

	private Person mockPerson(int i) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Person name: " + i);
		person.setLastName("Last name: " + i);
		person.setAddress("Some address in Brazil: "  + i);
		person.setGender("Male");
		return person;
	}
	
}
