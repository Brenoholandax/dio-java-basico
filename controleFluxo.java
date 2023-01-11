public class controleFluxo{
   
    public static  void main( String[] args) {

   ifFlecha();
   ifSemFlecha();
   ifFerias();
   ifMenor();

        switchSemana();
        switchFerias();
        switchNumero();


}


public static void ifFlecha()
{

 int mes = 25;

 if (mes == 1) {
    System.out.println("Janeiro");
 } else {
     if (mes == 2 ){   
         System.out.println("Fevereiro");
         } else {
              if (mes == 3 ) {
                  System.out.println("Março");           
               } else {
                     if (mes == 4 ) {    
                         System.out.println("Abril");
                     }else {
                        if (mes == 5) {
                            System.out.println("Maio");
                        }else {
                            if (mes == 6 ){   
                                System.out.println("Junho");
                                } else {
                                     if (mes == 7 ) {
                                         System.out.println("Julho");           
                                      } else {
                                            if (mes == 8 ) {    
                                                System.out.println("Agosto");
                                            }else {
                                               if (mes == 9) {
                                                   System.out.println("Setembro");
                                                             }else {
                                                                if (mes == 10 ) {    
                                                                    System.out.println("Outubro");
                                                                }else {
                                                                   if (mes == 11) {
                                                                       System.out.println("Novembro");
                                                                                 }else {
                                                                                    if (mes == 12) {
                                                                                        System.out.println("Dezembro");
                                                                                                  }else {
                                                                                                    
                                                                                                        System.out.println("O Numero invalido");
                                                                                                                  }
    }   }   }   }   }   }   }   }   }   }   }   }      

public static void ifSemFlecha(){
    int mes  = 9;
    if ( mes== 1 ){
        System.out.println("Janeiro");

    } else if ( mes == 2 ){
        System.out.println("fevereiro");
    }else if ( mes == 3 ){
        System.out.println("Março");
    }else if ( mes == 4 ){
        System.out.println("Abril");
    }else if ( mes == 5 ){
        System.out.println("Maio");
    }else if ( mes == 6 ){
        System.out.println("Junho");
    }else if ( mes == 7 ){
        System.out.println("Julho");
    }else if ( mes == 8 ){
        System.out.println("Agosto");
    }else if ( mes == 9 ){
        System.out.println("Setembro");
    }else if ( mes == 10 ){
        System.out.println("Outubrp");
    }else if ( mes == 11 ){
        System.out.println("Novembro");
    }else if ( mes == 12 ){
        System.out.println("Dezembro");
    }else if ( mes == 12 ){
    System.out.println("Dezembro");
}
}



public static void ifFerias(){
    String mes  = "0";
    if ( (mes == "julho") ||( mes == "dezembro") || (mes == "janeiro")) {  
          System.out.println( "Férias");
      }
    }



public static void ifMenor()
{
    double salarioMensal = 1995.58;
    double mediaSalario = 10500.00;
    
    int quantidadeDependente = 4;
    
    int mediaDependente = 2;
    
    if ((salarioMensal < mediaSalario) && ( quantidadeDependente >= mediaDependente)){
        System.out.println( "Seu auxilio foi aprovado");    }

}

public static void switchSemana()  
{
    String dia  = "DOMINGO";

            switch (dia) 
    {
            case "SEGUNDA" :
            System.out.println(1);
            break;
            case "TERÇA" :
            System.out.println(2);
            break;   
            case "QUARTA" :
            System.out.println(3);
            break;
             case "QUINTA" :
            System.out.println(4);
            break; 
            case "SEXTA" :
            System.out.println(5);
            break;
             case "SABADO" :
            System.out.println(6);
            break; 
            case "DOMINGO" :
            System.out.println(7);
            break;   
    }

}

public static void switchFerias(){

    String ferias = "abril";
    
    switch (ferias) 
    {
            case "janeiro":
            case "fevereiro":
            case "março": 
            System.out.println("Suas ferias está prevista para Abril");
     break;
            case "abril" : System.out.println ("Faltam 30 dias para suus ferias");
     break;
            case "maio" : System.out.println("Você está de ferias");
        default: System.out.println("Este ano você já tirou ferias");
     break;
    }

}

public static void switchNumero(){

    int numero = 7;

    switch (numero) {
        case 1 :
        case 2 :
        case 3 : 

        case 4 : System.out.println("Certo");
             break;
    
             case 5 :
             case 6 :
             System.out.println("Certissimo");
             break;
        default:
        System.out.println ("Errado");
            break;
    }

}


}













