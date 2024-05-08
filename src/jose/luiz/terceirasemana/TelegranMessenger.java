package jose.luiz.terceirasemana;

//classe filha
public class TelegranMessenger extends ServicoMenssagenEstantanea {

          //inserindo abstração
         
          public void enviarMensagem() {
                    validarConectadoInternet();
                    System.out.println("Enviamendo Mensagem pelo Telegram ...");
          }

         
          public void receberMensagem() {
                    System.out.println("Recebendo mensagem pelo Telegram ...");
          }
          
}
