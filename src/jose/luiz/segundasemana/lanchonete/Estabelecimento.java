package jose.luiz.segundasemana.lanchonete;

import jose.luiz.segundasemana.lanchonete.area.cliente.Cliente;
import jose.luiz.segundasemana.lanchonete.atendimento.Atendente;
import jose.luiz.segundasemana.lanchonete.atendimento.cozinha.Almoxarife;
import jose.luiz.segundasemana.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
          public static void main(String[] args) {
                    Cozinheiro cozinheiro = new Cozinheiro();
                    //ações que não precisam estarem disponivel para toda a aplicação
                    //cozinheiro.lavarIngredientes();
                    //cozinheiro.baterVitaminaLiquidificador();
                    //cozinheiro.selecionandoIngredientesVitamina();
                    //cozinheiro.prepararLanche();
                    //cozinheiro.prepararVitamina();
                    //cozinheiro.prepararVitamina();

                    //ações que estabelecimento precisa ter ciencia
                    cozinheiro.adicionarSucoNoBalcao();
                    cozinheiro.adicionarLancheNoBalcao();
                    cozinheiro.adicionarComboNoBalcao();

                    //Almoxarife almoxarife = new Almoxarife();
                    //ações que não precisam estarem dispoivel para toda aplicação
                    //almoxarife.ControlarEntrada();
                    //almoxarife.controlarSaida();
                    //ação que somente o seu pacote cozinha precisa conhecer (dafault)
                    // almoxarife.entregarIngredientes();
                    // almoxarife.trocarGas();

                    Atendente atendente = new Atendente();
                    //atendente.pegarLancheCozinha();
                    atendente.rebecerPagamento();
                    atendente.servindoMesa();
                    //ação que somente o seu pacote cozinha precisa conhecer (Default)
                    //atendente.trocarGas();

                    Cliente cliente = new Cliente();
                    cliente.escolherLanche();
                    cliente.fazerPedido();
                    cliente.pagarConta();

                    //não deveria, mas o estabelecimento
                    //ainda não definiou normas de atendimento
                    //cliente.pegarPedidoBalcao();

                    //esta ação é muito sigilosa, que tal ser privada ?
                    //cliente.colsultarSaldoAplicativo();

                    //já pensou os clientes ouvindo que o gás acabou ?
                    //cozinheiro.pedirParaTrocarGas(atendente);
                    //cozinheiro.pedirParaTrocarGas(almoxarife);
          }
}
