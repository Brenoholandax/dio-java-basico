


    import java.util.Scanner;

public class rodar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite");
        
        int num = scan.nextInt();
        int soma = 0;


        while (num >= 0 ) {

            int modulo = num % 10;

            soma += modulo;

            num /= 10;
           
        
            
        }
        
        
        System.out.println(soma);
        
       }                                                               
    }
