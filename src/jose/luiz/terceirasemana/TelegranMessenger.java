package jose.luiz.terceirasemana;

public class TelegranMessenger {
          public void enviarMensagem() {
                    validarConectadoInternet();
                    System.out.println("Enviando mensagem pelo Telegran...");
                    salvarHistoricoMensagem();
          }
          public void receberMensagem() {
                    System.out.println("Recebendo mensagem pelo Telegran...");
          }
          private void validarConectadoInternet() {
                    System.out.println("Validando se esta conectado a internet");
          }
          private void salvarHistoricoMensagem() {
                    System.out.println("Salvado o Historico....");
          }
}
