package jose.luiz.segundasemana;

public class Pessoa {
          private String nome;
          private String cpf;
          private String endereco;

          // com esse construtor toda vez q eu for criar uma pessoa
          // devo informar o nome e CPF da pessoa
          // e semelhante ao metodo set mais não é a mesma coisa
          public Pessoa (String cpf, String nome) {
                    this.cpf = cpf;
                    this.nome = nome;
          }
          
          public String getNome() {
                    return nome;
          }
          public String getCpf() {
                    return cpf;
          }
          public String getEndereco() {
                    return endereco;
          }
          public void setEndereco(String endereco) {
                    this.endereco = endereco;
          }
          
}
