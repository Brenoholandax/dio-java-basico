
import java.util.Scanner;


public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tabuada;

        System.out.println("Tabuada :");
        tabuada = scan.nextInt();

        System.out.println("Tabuada de : " + tabuada);

        for(int i = 1 ; i <= 10 ; i = i + 1 ){

            System.out.println(tabuada + "X" + i + "=" + (tabuada * i));
        }








    }
    
    
}
