package jose.luiz.segundasemana.lanchonete.atendimento.cozinha;

import java.security.PublicKey;

public class Almoxarife {
          private void ControlarEntrada () {
                    System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
          }
          private void controlarSaida () {
                    System.out.println("CONTROLANDO A SAIDA DOS ITENS");
          }
          void entregarIngredientes () {
                    System.out.println("ENTREGANDO INGREDIENTES");
                    controlarSaida();
          }
          //retirando o public torno ele default
          void trocarGas () {
                    System.out.println("ALMOXARIFE TROCANDO O GAS");    
          }
}
