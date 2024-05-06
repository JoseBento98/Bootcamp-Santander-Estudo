package jose.luiz.terceirasemana;

public class Autodromo {
          public static void main(String[] args) {
                    Carro jeep = new Carro();
                    jeep.setChassi("128371283");
                    jeep.ligar();

                    Moto z400 = new Moto();
                    z400.setChassi("123213123");
                    z400.ligar();

                    Veiculo coringa = z400;

                    coringa.ligar();
          }
          
}
