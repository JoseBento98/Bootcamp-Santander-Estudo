package jose.luiz.segundasemana.lanchonete.area.cliente;

import java.security.PublicKey;

public class Cliente {
          public void escolherLanche () {
                    System.out.println("ESCOLHENDO O LANCHE");
          }
          public void fazerPedido () {
                    System.out.println("FAZENDO O PEDIDO");
          }
          public void pagarConta() {
                    colsultarSaldoAplicativo();
                    System.out.println("PAGANDO A CONTA");
          }
          private void colsultarSaldoAplicativo () {
                    System.out.println("CONSULTANDO SALDO NO APLICATIVO");
          }
         // public void pegarPedidoBalcao () {
          //          System.out.println("PEGANDO O PEDIDO NO BALCAO");
         // }
}
