package jose.luiz.terceirasemana;

//classe filha
public class TelegranMessenger extends ServicoMenssagenEstantanea {
          //inserindo abstração
         
          public void enviarMensagem() {
                    System.out.println("Enviamendo Mensagem pelo Telegram ...");
          }

          @Override
          public void receberMensagem() {
                    System.out.println("Recebendo mensagem pelo Telegram ...");
          }
          
}
