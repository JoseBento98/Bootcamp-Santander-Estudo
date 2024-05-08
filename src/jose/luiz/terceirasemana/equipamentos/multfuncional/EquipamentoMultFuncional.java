package jose.luiz.terceirasemana.equipamentos.multfuncional;

import jose.luiz.terceirasemana.equipamentos.copiadora.Copiadora;
import jose.luiz.terceirasemana.equipamentos.digitalizadora.Digitalizadora;
import jose.luiz.terceirasemana.equipamentos.impressora.Impressora;

//Java não permite Herança Multipla
// por isso implementamos uma inteface
//Interface um nivel mais abstrado no mundo real

public class EquipamentoMultFuncional implements Copiadora,Impressora,Digitalizadora{

          public void digitalizar() {
                    System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
          }

          public void imprimir() {
                    System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL");
          }

          public void copiar() {
                    System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
          }

}
