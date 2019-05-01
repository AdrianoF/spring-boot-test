package br.com.adri.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.adri.exception.MathOperationException;
import br.com.adri.request.converters.NumberConverter;
import br.com.adri.utils.MathUtils;

@RestController
public class MathController {
	
	private MathUtils mathUtils = new MathUtils();

	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new MathOperationException("Please set a numeric value !");
		}
		
		return mathUtils.sum(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));

	}
	
	@RequestMapping(value = "/subtraction/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double subtraction(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new MathOperationException("Please set a numeric value !");
		}
		
		return mathUtils.subtraction(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));

	}
	
	@RequestMapping(value = "/multiplication/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double multiplication(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new MathOperationException("Please set a numeric value !");
		}
		
		return mathUtils.multiplication(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));

	}
	
	@RequestMapping(value = "/division/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double division(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new MathOperationException("Please set a numeric value !");
		}
		
		return mathUtils.division(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));

	}
	
	@RequestMapping(value = "/average/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double average(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new MathOperationException("Please set a numeric value !");
		}
		
		return mathUtils.average(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));

	}
	
	@RequestMapping(value = "/squareroot/{number}", method = RequestMethod.GET)
	public Double squareRoot(@PathVariable("number") String number) throws Exception {
		
		if(!NumberConverter.isNumeric(number)) {
			throw new MathOperationException("Please set a numeric value !");
		}
		
		return mathUtils.squareRoot(NumberConverter.convertToDouble(number));

	}

}
