package jose.luiz.terceirasemana;

public abstract class ServicoMenssagenEstantanea {
          //classe pai que consegue prover mecanismos de execução para classes filhas

          //inserindo abstração
          //preciso emplementar como cada um vai interagir de acordo com suas particularidades
          public abstract void enviarMensagem();
          public abstract void receberMensagem();
}
