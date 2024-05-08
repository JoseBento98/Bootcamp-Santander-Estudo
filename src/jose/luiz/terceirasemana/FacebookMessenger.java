package jose.luiz.terceirasemana;

public class FacebookMessenger {
          public void enviarMensagem() {
                    validarConectadoInternet();
                    System.out.println("Enviando mensagem pelo Facebook...");
                    salvarHistoricoMensagem();
          }
          public void receberMensagem() {
                    System.out.println("Recebendo mensagem pelo Facebook...");
          }
          private void validarConectadoInternet() {
                    System.out.println("Validando se esta conectado a internet");
          }
          private void salvarHistoricoMensagem() {
                    System.out.println("Salvado o Historico....");
          }
}
