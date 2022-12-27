package mapa.Estudos;
public class App {
    public static void main(String[] args) throws Exception {
     String meuNome = "Breno";
     String segundoNome = "Holanda";
     String nomeCompleto = nomeCompleto(meuNome,segundoNome);
     System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "resultado do método " + primeiroNome.concat(" ").concat("Holanda ");
    }
}

