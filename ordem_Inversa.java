public class ordem_Inversa {
    public static void main(String[] args) {
    

int[]  vetor = {-1, -2, 1, 2 , 3, 4};

int count= 0;
//vê tamanho do vetor em ordem crescente
while (count < (vetor.length)) {
    
   System.out.println(vetor [count] );
    count ++;
    
}
/*  vê tamanho de vetor em ordem decrescente. -1 é necessario pois o contador conta até 5
lembrando 0,1,2,3,4,5
*/

for(int i = (vetor.length -1); i >= 0 ; i--){

    System.out.println( vetor[i] + " ");
}






}
    
}
