public class Usuario 
{
    public static void main(String[] args)  throws Exception
 {
    SmartTv smartTv = new SmartTv();

System.out.printtLn("Tv Ligada ?  " + smartTv.ligada );
System.out.printtLn("Canala Atual :  " + smartTv.canal );
System.out.printtLn("Volume atual? : " + smartTv.volume );

smartTv.ligar  ();
System.out.printtLn(" Novo Status - > Tv Ligada ?  " + smartTv.ligada );

smartTv.desligar();
System.out.printtLn(" Novo Status - > Tv Ligada ?  " + smartTv.ligada );





        
 }
    
}
