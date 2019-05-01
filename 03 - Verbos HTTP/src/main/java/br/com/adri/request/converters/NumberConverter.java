package br.com.adri.request.converters;

public class NumberConverter {

	public static Double convertToDouble(String strNumber) {
		if(strNumber == null) return 0D;
		String number = strNumber.replaceAll(",", "."); //Para mudar o formato de 1,00 para 1.00
		if (isNumeric(number)) return Double.parseDouble(number);
		return 0d;
	}

	public static boolean isNumeric(String strNumber) {
		if(strNumber == null) return false;
		String number = strNumber.replaceAll(",", "."); //Para mudar o formato de 1,00 para 1.00
		return number.matches("[-+]?[0-9]*\\.?[0-9]+"); //Verifica se e um numero
	}

}
