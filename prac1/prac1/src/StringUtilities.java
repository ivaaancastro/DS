import java.lang.reflect.Array;

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
        if (string == null) {
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
            if (Character.isLowerCase(string.charAt(i)) == true) { //Comprueba si es minuscula
                minuscula = minuscula + string.charAt(i);
            } else {
                mayuscula = mayuscula + string.charAt(i);
            }
        }
        return minuscula + mayuscula;
    }

    public static boolean checkTextStats(String string, int minimo, int maximo) {
        float media; //
        int sumaAcumulada = 0; //
        int mayor = 0;
        String[] separado = string.split(" "); //
        if (string == null || string.isEmpty() || minimo <= 0 || maximo <= 0 || minimo > maximo) {
            throw new IllegalArgumentException();
        } else { //
            for (int i = 0; i < separado.length; i++) { //
                sumaAcumulada += separado[i].length();
                if (mayor < separado[i].length()) {
                    mayor = separado[i].length();//
                }
            }
            media = (float) sumaAcumulada / separado.length; //
        }
        if ((minimo < media) && (media < maximo)) { //
            return true; //
        } else {
            if (media >= 2 * mayor) {
                return true;
            }
        }
        return false;
    }

} //string.split divide string por donde se indique