public class Main {
    public static void main(String [] args){
        InmutableMatrix matrix = new InmutableMatrix(3,4);

        //Probamos el método toString()
        String arr_cadena = matrix.toString();
        System.out.println("Array como cadena: \n"+arr_cadena);
        //Probamos el método at()
        System.out.println("El número solicitado es: "+matrix.at(1,3));

    }
}
