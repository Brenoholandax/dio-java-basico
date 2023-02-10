
//Exercicio aula 2  de orientação a obejto


public class rodarAplicação {

public static void main(String[] args) {
    
carro carro1 = new carro ();

carro1.setCor("azul");
carro1.setModelo("BMW A4");
carro1.setCapacidadeDoTanque(59);

System.out.println(carro1.getModelo());
System.out.println(carro1.getCar());
System.out.println(carro1.getCapacidadeTanque());
System.out.println(carro1.totalValorTanque(60));

}
    
}
