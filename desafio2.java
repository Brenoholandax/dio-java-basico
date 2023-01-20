




// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next"; 
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.   

import java.util.Scanner; 
    
public class desafio2 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        String download = leitor.next();
        
        

            switch (download) 
    {
            case "1" :
            System.out.println("/");
            break;
            case "2" :
            System.out.println("//");
            break; 
            case "3" :
            System.out.println("///");
            break;
             case "4" :
            System.out.println("////");
            break; 
            case "5" :
            System.out.println("/////");
            break;
             case "6" :
            System.out.println("//////");
            break; 
            case "7" :
            System.out.println("///////");
            break; 
            case "8" :
            System.out.println("////////");
            break;  
            case "9" :
            System.out.println("/////////");
            break; 
             case "10" :
            System.out.println("//////////");
            break;   
              
      
    }

}
}

   
  