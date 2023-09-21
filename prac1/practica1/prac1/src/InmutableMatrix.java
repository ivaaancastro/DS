import java.util.Arrays;

import static java.lang.Integer.parseInt;
import static java.lang.Integer.valueOf;

public final class InmutableMatrix {
    private final int [][] arr;


    //Primer constructor
    InmutableMatrix(int[][] arr){
        this.arr = arr;
        int numCols = arr[0].length;
        for(int i = 0; i < arr.length; i++){
            if (arr[i].length != numCols){
                throw new IllegalArgumentException("La matriz es irregular");
            }
        }
    }

    //Segundo constructor
    InmutableMatrix(int numrows, int numcolumns) {
        if ( || numrows == 0 || numcolumns % 2 != 0 || numcolumns == 0 ){
            throw new IllegalArgumentException("Los valores no son enteros o mayores que 0");
        }
        else{
            this.arr = new int[numrows][numcolumns];//Creamos la matriz
            int cont = 1;
            for (int i = 0; i < numrows; i++){
                for (int j = 0; j < numcolumns; j++){
                    this.arr[i][j] = cont;
                    cont++;
                }
            }
        }
    }

    //Métodos
    public String toString(){
        StringBuilder cadena = new StringBuilder();
        for (int[] row : arr){
            for (int value : row){
                cadena.append(value).append(" ");
            }
            cadena.append("\n");
        }
        return cadena.toString();
    }

    public int at(int row, int col){
        Integer num = valueOf(arr[row][col]);
        if (num == null){
            throw new IllegalArgumentException("Posición no valida");
        }
        return num;
    }





}
