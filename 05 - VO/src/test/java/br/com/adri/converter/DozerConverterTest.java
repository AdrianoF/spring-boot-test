package br.com.adri.converter;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.adri.converter.mocks.MockPerson;
import br.com.adri.data.model.Person;
import br.com.adri.data.vo.PersonVO;

public class DozerConverterTest {

	MockPerson inputObject;
	
	@Before
	public void setUp() {
		inputObject = new MockPerson();
	}
	
	@Test
	public void parseEntityToVOTest() {
		PersonVO output = DozerConverter.parseObject(inputObject.mockEntity(), PersonVO.class);
		Assert.assertEquals(Long.valueOf(0L), output.getId());
		Assert.assertEquals("First Name Test0", output.getFirstName());
		Assert.assertEquals("Last Name Test0", output.getLastName());
		Assert.assertEquals("Address Test0", output.getAddress());
		Assert.assertEquals("Male", output.getGender());
	}
	
	@Test
	public void parseEntityListToVOListTest() {
		List<PersonVO> outputList = DozerConverter.parseListObjects(inputObject.mockEntityList(), PersonVO.class);
		PersonVO outputZero = outputList.get(0);
		
		Assert.assertEquals(Long.valueOf(0L), outputZero.getId());
		Assert.assertEquals("First Name Test0", outputZero.getFirstName());
		Assert.assertEquals("Last Name Test0", outputZero.getLastName());
		Assert.assertEquals("Address Test0", outputZero.getAddress());
		Assert.assertEquals("Male", outputZero.getGender());
		
		PersonVO outpuSeven = outputList.get(7);
		
		Assert.assertEquals(Long.valueOf(7L), outpuSeven.getId());
		Assert.assertEquals("First Name Test7", outpuSeven.getFirstName());
		Assert.assertEquals("Last Name Test7", outpuSeven.getLastName());
		Assert.assertEquals("Address Test7", outpuSeven.getAddress());
		Assert.assertEquals("Female", outpuSeven.getGender());
		
		PersonVO outpuTwelve = outputList.get(12);
		
		Assert.assertEquals(Long.valueOf(12L), outpuTwelve.getId());
		Assert.assertEquals("First Name Test12", outpuTwelve.getFirstName());
		Assert.assertEquals("Last Name Test12", outpuTwelve.getLastName());
		Assert.assertEquals("Address Test12", outpuTwelve.getAddress());
		Assert.assertEquals("Male", outpuTwelve.getGender());
	}
	
	@Test
	public void parseVOtoEntityTest() {
		Person output = DozerConverter.parseObject(inputObject.mockVO(), Person.class);
		Assert.assertEquals(Long.valueOf(0L), output.getId());
		Assert.assertEquals("First Name Test0", output.getFirstName());
		Assert.assertEquals("Last Name Test0", output.getLastName());
		Assert.assertEquals("Address Test0", output.getAddress());
		Assert.assertEquals("Male", output.getGender());
	}
	
	
	@Test
	public void parseVOListToEntityListTest() {
		List<Person> outputList = DozerConverter.parseListObjects(inputObject.mockVOList(), Person.class);
		
		Person outputZero = outputList.get(0);
		
		Assert.assertEquals(Long.valueOf(0L), outputZero.getId());
		Assert.assertEquals("First Name Test0", outputZero.getFirstName());
		Assert.assertEquals("Last Name Test0", outputZero.getLastName());
		Assert.assertEquals("Address Test0", outputZero.getAddress());
		Assert.assertEquals("Male", outputZero.getGender());
		
		Person outpuSeven = outputList.get(7);
		
		Assert.assertEquals(Long.valueOf(7L), outpuSeven.getId());
		Assert.assertEquals("First Name Test7", outpuSeven.getFirstName());
		Assert.assertEquals("Last Name Test7", outpuSeven.getLastName());
		Assert.assertEquals("Address Test7", outpuSeven.getAddress());
		Assert.assertEquals("Female", outpuSeven.getGender());
		
		Person outpuTwelve = outputList.get(12);
		
		Assert.assertEquals(Long.valueOf(12L), outpuTwelve.getId());
		Assert.assertEquals("First Name Test12", outpuTwelve.getFirstName());
		Assert.assertEquals("Last Name Test12", outpuTwelve.getLastName());
		Assert.assertEquals("Address Test12", outpuTwelve.getAddress());
		Assert.assertEquals("Male", outpuTwelve.getGender());
		
		
	}
}
