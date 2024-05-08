package jose.luiz.terceirasemana;

//classe filha
public class MSNmenssager extends ServicoMenssagenEstantanea {
          //inserindo abstração
          
          public void enviarMensagem() {
                    validarConectadoInternet();
                    System.out.println("Enviamendo Mensagem pelo MSN ..."); 
          }

          
          public void receberMensagem() {
                    System.out.println("Recebendo mensagem pelo MSN ...");   
          }
          
}
