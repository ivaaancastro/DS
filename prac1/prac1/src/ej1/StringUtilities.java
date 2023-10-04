package ej1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringUtilities {

    public static void main(String[] args) {
        String string = "3";
        String admisibles= "a";
        int tamnho = 0;

        if(isValidString(string, admisibles, tamnho)){
            System.out.println("La cadena es un numero");
        }else{
            System.out.println("No es un numero");
        }
    }

    //Métodos
    //Ctrl+alt+l ordena código
    public static boolean isValidString(String string, String admisibles, int tamanho) {
        if (string == null || string.isEmpty()) {
            return false;
        }
        if (string.length() < tamanho) { //Nos da el tamaño del string
            return false;
        }
        for (int i = 0; i < string.length(); i++) {
            if (admisibles.indexOf(string.charAt(i)) == -1 && !Character.isDigit(string.charAt(i))) { //IndexOf nos dice la posición dentro de admisibles en la que se encuentra el caracter pasado por parametro, si no está devuelve -1
                return false; //charAt devuelve el caracter que se encuentra en la posición. isDigit retorna si es un dígito/numero
            }
        }
        return true;
    }

    public static String lowercaseFirst(String string) {
        String minuscula = "";
        String mayuscula = "";
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLowerCase(string.charAt(i))) { //Comprueba si es minuscula
                minuscula = minuscula + string.charAt(i);
            } else {
                mayuscula = mayuscula + string.charAt(i);
            }
        }
        return minuscula + mayuscula;
    }

    public static boolean checkTextStats(String string, int minimo, int maximo) {
        double media; //
        int sumaAcumulada = 0; //
        int palabra_mayor = 0;

        if (string == null || string.isEmpty() || minimo <= 0 || maximo <= 0 || minimo > maximo) {
            throw new IllegalArgumentException();
        }

        String[] separado = string.split(" "); //
        System.out.println(Arrays.toString(separado));
        //
        for (String s : separado) { //
            System.out.println(s.length());
            sumaAcumulada += s.length();
            if (s.length() > palabra_mayor) {
                palabra_mayor = s.length();//
            }
        }
        System.out.println("Suma acumulada: "+sumaAcumulada);
        System.out.println("Separado length: " + separado.length);
        media = (double) sumaAcumulada / separado.length; //

        System.out.println("Media: "+media);
        System.out.println("Palabra mayor: "+palabra_mayor);
        return (media >= minimo && media <= maximo) && (palabra_mayor < 2 * media);
    }

} //string.split divide string por donde se indique