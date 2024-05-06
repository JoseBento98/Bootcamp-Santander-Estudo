package jose.luiz.terceirasemana;

public class Carro extends Veiculo{
          

          public void ligar() {
                    confereCambio();
                    confereCombustivel();
                    System.out.println("CARRO LIGADO");
          }

          //Encapsulamento: Esconder ações que serão executadas somente dentro da propria classe
          private void confereCombustivel () {
                    System.out.println("Conferindo combustivel");
          }
          private void confereCambio() {
                    System.out.println("Conferindo cambio em P");
          }
}
