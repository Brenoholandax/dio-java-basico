public class smartTv {
   boolean ligada = false;
   int canal = 1;
   int volume = 25 ; 

public vois mudarCanal ( int novoCanal ){
    canal = novoCanal;
}
   public void aumentarCanal (){
    canal++;
   }
   public void dimunuirCanal (){
    canal--;
   }

    public void aumentarVolume () {

        volume++;
    }
    public void diminuirVolume () {

        volume--;
    }

     public void ligar (){
                ligada = true;
    }

    public void desligar (){
            ligada = false;
    }

    }

