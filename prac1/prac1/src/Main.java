public class Main {
    public static void main(String [] args){
        ImmutableMatrix matrix = new ImmutableMatrix(3,4);

        //Probamos el método toString()
        String arr_cadena = matrix.toString();
        System.out.println("Array como cadena: \n"+arr_cadena);
        //Probamos el método at()
        System.out.println("El número solicitado es: "+matrix.at(3,5));
        //Probamos el método rowCount()
        System.out.println("El número de rows del array es: "+matrix.rowCount());
        //Probamos el método columnCount()
        System.out.println("El número de columns del array es: "+matrix.columnCount());
        //Probamos el método toArray2D

        //Probamos el método reverse
        ImmutableMatrix reverseArray = matrix.reverse();
        System.out.println("Esta es la matriz con las filas a la inversa: \n"+reverseArray);
        //Probamos el método transpose
        ImmutableMatrix transposedArray = matrix.transpose();
        System.out.println("Esta es la traspuesta de la matriz: \n"+transposedArray);
        //Probamos el método reverse
        ImmutableMatrix reversedArray = matrix.reshape(6);
        System.out.println("Esta es su matriz modificada:\n"+reversedArray);

    }
}
