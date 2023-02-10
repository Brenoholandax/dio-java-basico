class carro {
    String cor;
    String modelo;
    int capacidadeTanque;


// construtor aqui
 carro () {

 }

 carro ( String cor, String modelo, int capacidadeTanque){
this.cor = cor;
this.modelo = modelo;
this.capacidadeTanque = capacidadeTanque;

 }


void setCor ( String cor) {
    this.cor = cor;
}

String getCar() {
    return cor;
}

void setModelo ( String modelo) {
    this.modelo = modelo;
}

String getModelo (){
    return modelo;
}

// get e set tanque
void setCapacidadeDoTanque( int capacidadeTanque){
    this.capacidadeTanque = capacidadeTanque;

}

int getCapacidadeTanque() {
    return capacidadeTanque;
}

 // metodo de total para encher o tanque

 double totalValorTanque (double valorCombustivel){
return capacidadeTanque * valorCombustivel;
 }

}

