package jose.luiz.terceirasemana;

public class MSNmenssager {
          public void enviarMensagem() {
                    validarConectadoInternet();
                    System.out.println("Enviando mensagem pelo MSN...");
                    salvarHistoricoMensagem();
          }
          public void receberMensagem() {
                    System.out.println("Recebendo mensagem pelo MSN...");
          }
          private void validarConectadoInternet() {
                    System.out.println("Validando se esta conectado a internet");
          }
          private void salvarHistoricoMensagem() {
                    System.out.println("Salvado o Historico....");
          }
}