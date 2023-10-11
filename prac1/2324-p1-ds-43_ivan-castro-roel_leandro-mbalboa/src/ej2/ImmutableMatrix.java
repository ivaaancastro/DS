package ej2;

import static java.lang.Integer.parseInt;
import static java.lang.Integer.valueOf;

public final class ImmutableMatrix {
    private final int [][] arr;


    //Primer constructor
    public ImmutableMatrix(int[][] arr){
        this.arr = arr;
        int numCols = arr[0].length;
        for(int i = 0; i < arr.length; i++){
            if (arr[i].length != numCols){
                throw new IllegalArgumentException("La matriz es irregular");
            }
        }
    }

    //Segundo constructor
    public ImmutableMatrix(int numrows, int numcolumns) {
        if (numrows == 0 || numcolumns == 0 ){
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
        int numRows = arr.length;
        int numCols = arr[0].length;
        for (int i = 0; i < numRows; i++){
            cadena.append("[");
            for (int j = 0; j < numCols; j++){
                if (j == numCols-1){
                    cadena.append(arr[i][j]).append("]");
                }
                else {
                    cadena.append(arr[i][j]).append(", ");
                }
            }
            cadena.append("\n");
        }

        return cadena.toString();
    }

    public int at(int row, int col) {
        if (row < 0 || row >= arr.length || col < 0 || col >= arr[0].length) {
            throw new IllegalArgumentException("Valores fuera de rango");
        }
        return arr[row][col];
    }


    public int rowCount(){
        return arr.length;
    }

    public int columnCount(){
        return arr[0].length;
    }

    public int[][] toArray2D() {
        int numRows = arr.length;
        int numCols = arr[0].length;
        int[][] arrcopy = new int[numRows][numCols];
        for (int i = 0; i < numRows; i++){
            for (int j = 0; j < numCols; j++){
                arrcopy[i][j] = arr[i][j];
            }
        }
        return arrcopy;
    }

    public ImmutableMatrix reverse(){
        int numRows2 = arr.length;
        int numCols2 = arr[0].length;
        int[][] arrReverse = new int[numRows2][numCols2];
        for (int i = 0; i < numRows2; i++){
            for (int j = 0; j < numCols2; j++){
                arrReverse[i][j] = arr[i][numCols2 - 1 - j];
            }
        }
        return new ImmutableMatrix(arrReverse);
    }

    public ImmutableMatrix transpose(){
        int numRows3 = arr.length;
        int numCols3 = arr[0].length;
        int[][] arrReverse = new int[numCols3][numRows3];
        for (int i = 0; i < numRows3; i++){
            for (int j = 0; j < numCols3; j++){
                arrReverse[j][i] = arr[i][j];
            }
        }
        return new ImmutableMatrix(arrReverse);
    }

    public ImmutableMatrix reshape(int newCols){
        int numRows4 = arr.length;
        int numCols4 = arr[0].length;

        if (newCols > numRows4 * numCols4 || newCols <= 0 || (numRows4 * numCols4) % newCols != 0){
            throw new IllegalArgumentException("El número de columnas dado no es válido");
        }

        int[][] reshapedArr = new int[numRows4 * numCols4 / newCols][newCols];
        int rowPosition = 0;
        int colPosition = 0;

        for (int i = 0; i < numRows4; i++){
            for (int j = 0; j < numCols4; j++){
                reshapedArr[rowPosition][colPosition] = arr[i][j];
                colPosition++;

                if (colPosition == newCols){
                    colPosition = 0;
                    rowPosition++;
                }
            }
        }
        return new ImmutableMatrix(reshapedArr);
    }
}
