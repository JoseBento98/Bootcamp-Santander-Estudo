package jose.luiz.terceirasemana;

public class ServicoMenssagenEstantanea {
          //classe pai que consegue prover mecanismos de execução para classes filhas
          public void enviarMensagem() {
                    //primeiro confirma se esta conectado
                    validarConectadoInternet ();
                    System.out.println("Enviando Mensagem");
                    //depois de enviada, salva o histórico
                    salvarHistoricoMensagem();
          }
          public void receberMensagem () {
                    System.out.println("Recebendo Mensagem");
          }
          private void validarConectadoInternet () {
                    System.out.println("Validando se está conectado a Internet");
          }
          private void salvarHistoricoMensagem() {
                    System.out.println("Salvando o historico da mensagem");
          }
}
