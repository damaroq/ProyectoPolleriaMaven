package Utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    public static boolean isDNI(String cadena) {
        Pattern patron = Pattern.compile("[0-9]{8}");
        Matcher mat = patron.matcher(cadena);
        return mat.matches();
    }

    public static boolean isCorreoElectronico(String cadena) {
        Pattern patron = Pattern.compile("([a-z0-9]+(\\.?[a-z0-9])*)+@(([a-z]+)\\.([a-z]+))+");
        Matcher mat = patron.matcher(cadena);
        return mat.matches();
    }

    public static boolean isDouble(String cadena) {
        try {
            Double.valueOf(cadena);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public static boolean isInteger(String cadena) {
        try {
            Integer.valueOf(cadena);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

}
