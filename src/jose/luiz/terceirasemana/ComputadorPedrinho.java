package jose.luiz.terceirasemana;

public class ComputadorPedrinho {
          public static void main(String[] args) {
                    ServicoMenssagenEstantanea smi = null;
                    /*
                     * NÃO SE SABE QUAL APP
                     * MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
                     * POLIMORFISMO
                     */
                    String appEscolhido = "tlg";

                    if (appEscolhido.equals("msn"))
                              smi = new MSNmenssager();
                    else if (appEscolhido.equals("fbm"))
                              smi = new FacebookMessenger();
                    else if (appEscolhido.equals("tlg")) 
                              smi = new TelegranMessenger();
                    
                    smi.enviarMensagem();
                    smi.receberMensagem();
                    
          }
}
