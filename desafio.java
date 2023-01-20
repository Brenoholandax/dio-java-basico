// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next"; 
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.   

import java.util.Scanner; 

public class desafio {
    public static void main(String[] args) {


        Scanner leitor = new Scanner(System.in);
        int entrada = leitor.nextInt();
        int mesada = 50;
      int contador = entrada;
        
        while (mesada > contador) {

       int  resultado = mesada * entrada;
            
            System.out.println( "Voce tera " + resultado + " reais");
            break;
        }








    }
    
}
