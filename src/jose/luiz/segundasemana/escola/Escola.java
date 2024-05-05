package jose.luiz.segundasemana.escola;

public class Escola {
          public static void main(String[] args) {
                    Aluno felipe = new Aluno();
                    felipe.setNome("Felipe");
                    felipe.setIdade(8);
                    felipe.setSexo("Mascolino");

                    System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " Anos de Idade e seu sexo:" + felipe.getSexo() );
                    
          }
}
