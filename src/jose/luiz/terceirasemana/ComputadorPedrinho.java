package jose.luiz.terceirasemana;

public class ComputadorPedrinho {
          public static void main(String[] args) {
                    //abrindo MSN messenger
                    MSNmenssager msn = new MSNmenssager();
                    msn.enviarMensagem();
                    msn.receberMensagem();

                    FacebookMessenger fb = new FacebookMessenger();
                    fb.enviarMensagem();
                    fb.receberMensagem();

                    TelegranMessenger tl = new TelegranMessenger ();
                    tl.enviarMensagem();
                    tl.receberMensagem(); 
          }
}
