public class StringUtilities {
    static boolean result = false;

    public static void main(String[] args){
        String cadena = "3";

        if (isValidString(cadena)){
            System.out.println("La cadena es un número");
        }
        else{
            System.out.println("La cadena no es un número");
        }
    }

    public static boolean isValidString(String cadena){
        try{
            Integer.parseInt(cadena);
            result = true;
        }
        catch (NumberFormatException numberFormatException){
            result = false;
        }

        return result;
    }
}
