package jose.luiz.segundasemana;

public class SistemaDeCadastro {
          public static void main(String[] args) {
                    //criando uma pessoa no sistema
                    Pessoa marcos = new Pessoa();

                    //definimos o endereço de marcos
                    marcos.setEndereco("RUA DAS MARIAS");

                    // e como definir o nome e cpf do marcos ?

                    //impriminrdo o marcos sem o nome e cpf

                    System.out.println(marcos.getNome() + "-" + marcos.getCpf());
          }
}
