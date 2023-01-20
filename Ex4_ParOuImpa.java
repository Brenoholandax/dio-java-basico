import java.text.BreakIterator;
import java.util.Scanner;

    public class Ex4_ParOuImpa 
 {
    public static void main(String[] args) 
{
      Scanner scan = new Scanner(System.in);

     int quantiNumero;
     int numero;
     int quantiImpar = 0, quantipar=0;

    System.out.println("Quantidade de numer os : ");

    quantiNumero = scan.nextInt();
    

    int count = 0;

    do {

        System.out.println("Numero :");
        numero = scan.nextInt();

            if (numero % 2 == 0) quantipar++;
            else quantiImpar++;
                
            

        count++;
    } while (count < quantiNumero);

    System.out.println("Quantidade pares : " + quantipar);
    System.out.println("Quantidade Impares : " + quantiImpar);
    

        
} 
    
 }
