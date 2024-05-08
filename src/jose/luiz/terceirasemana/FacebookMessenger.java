package jose.luiz.terceirasemana;

//classe filha
public class FacebookMessenger extends ServicoMenssagenEstantanea{
          //inserindo abstração
         
          public void enviarMensagem() {
                    System.out.println("Enviamendo Mensagem pelo Facebook ...");
          }

         
          public void receberMensagem() {
                    System.out.println("Recebendo mensagem pelo Facebook ...");    
          }
          
}
