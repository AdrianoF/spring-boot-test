package br.com.adri.converter.mocks;

import java.util.ArrayList;
import java.util.List;

import br.com.adri.data.model.Person;
import br.com.adri.data.vo.PersonVO;

public class MockPerson {

	public Person mockEntity() {
		return mockEntity(0);
	}
	
	public PersonVO mockVO() {
		return mockVO(0);
	}
	
	public List<Person> mockEntityList(){
		List<Person> people = new ArrayList<Person>();
		for (int i = 0; i < 14; i++) {
			people.add(mockEntity(i));
		}
		return people;
	}
	
	public List<PersonVO> mockVOList(){
		List<PersonVO> people = new ArrayList<>();
		for (int i = 0; i < 14; i++) {
			people.add(mockVO(i));
		}
		return people;
	}
	
	public Person mockEntity(Integer number) {
		Person person = new Person();
		person.setAddress("Address Test" + number);
		person.setFirstName("First Name Test" + number);
		person.setGender(((number % 2) == 0) ? "Male" : "Female");
		person.setId(number.longValue());
		person.setLastName("Last Name Test" + number);
		return person;
		
		
	}
	
	public PersonVO mockVO(Integer number) {
		PersonVO person = new PersonVO();
		person.setAddress("Address Test" + number);
		person.setFirstName("First Name Test" + number);
		person.setGender(((number % 2) == 0) ? "Male" : "Female");
		person.setId(number.longValue());
		person.setLastName("Last Name Test" + number);
		return person;
		
		
	}
	
	
}
