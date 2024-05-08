package jose.luiz.terceirasemana;

public abstract class ServicoMenssagenEstantanea {
          //classe pai que consegue prover mecanismos de execução para classes filhas

          //inserindo abstração
          //preciso emplementar como cada um vai interagir de acordo com suas particularidades
          public abstract void enviarMensagem();
          public abstract void receberMensagem();

          //somente os "filhos" conehcem este método
          protected void validarConectadoInternet() {
                    System.out.println("Validado se está conectado a Internet");
                    /*
                     * Necessario que se coloque em seus respectivos Packges 
                     * para que a visibilidade não passe para o metodo main
                     */
          }
}
