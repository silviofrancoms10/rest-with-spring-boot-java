package br.com.silviofrancoms.request.converters;

import br.com.silviofrancoms.exception.UnsupportedMathOperationException;

public class NumberConverter {

    public static Double convertToDouble(String strNumber) throws UnsupportedMathOperationException {
        if (strNumber == null || strNumber.isEmpty())
            throw new UnsupportedMathOperationException("Please insert a numeric value!");
        String number = strNumber.replace(",", ".");
        return Double.parseDouble(number);
    }

    public static boolean isNumeric(String strNumber) {
        if (strNumber == null || strNumber.isEmpty())
            return false;
        String number = strNumber.replace(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}
