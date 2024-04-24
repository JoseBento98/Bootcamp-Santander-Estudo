public class MinhaClasse {
    public static void main(String[] args) {
        String nomeDaMarcaDeCarro = "Dodge";
        int anoFabricação = 2024;
        boolean carro = true;

        String primeiroNome = "Joseph";
        String segundoNome = "Stalyn";

        String nomeCompleto = nomeDoFabricante(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }

    public static String nomeDoFabricante (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }


}
