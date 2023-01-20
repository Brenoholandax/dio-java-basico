import java.util.Scanner;


public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] consoantes = new String[6];

        int quantiletras= 0;

        int count = 0;

        do {
            System.out.println("Letra :");

            String letra =  scan.next();
            if (!(
            letra.equalsIgnoreCase ("a") |
            letra.equalsIgnoreCase ("e") |
            letra.equalsIgnoreCase ("i") |
            letra.equalsIgnoreCase ("o") | 
            letra.equalsIgnoreCase ("u")) )
           {

                consoantes[count] = letra;
                quantiletras++;
            }

count++;
            
        } while (count < consoantes.length);

     for ( String consoante : consoantes) {

        if ( consoantes != null)
        System.out.println( consoantes + " ");
            
        }














    }
    
}
