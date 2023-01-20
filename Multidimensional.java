

import java.util.Random;
import java.util.random.*;


public class Multidimensional {
     public static void main(String[] args) {
    Random random = new Random();

        int [][] matriz = new int [4][4];

for (int i = 0; i < matriz.length; i++) {

     for (int j = 0; j < matriz[1].length; j++){
        matriz [i][j] = random.nextInt(9);

    }
}

for ( int[] linha : matriz){

    for ( int coluna : linha){
        System.out.println(coluna + " ");
    }
}



}
    
}
