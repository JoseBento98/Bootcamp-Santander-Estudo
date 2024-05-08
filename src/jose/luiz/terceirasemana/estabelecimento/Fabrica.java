package jose.luiz.terceirasemana.estabelecimento;

import jose.luiz.terceirasemana.equipamentos.copiadora.Copiadora;
import jose.luiz.terceirasemana.equipamentos.digitalizadora.Digitalizadora;
import jose.luiz.terceirasemana.equipamentos.digitalizadora.Scanner;
import jose.luiz.terceirasemana.equipamentos.impressora.Impressora;
import jose.luiz.terceirasemana.equipamentos.multfuncional.EquipamentoMultFuncional;

public class Fabrica {
          public static void main(String[] args) {
                    EquipamentoMultFuncional em = new EquipamentoMultFuncional();

                    Scanner scanner = new Scanner();



                    Impressora impressora = em;
                    Digitalizadora digitalizadora = em;
                    Copiadora copiadora = em;



                    digitalizadora.digitalizar();
                    copiadora.copiar();
                    impressora.imprimir();




          }
}

/*
 * JAVA NÃO ACEITA MULTIPLAS HERANÇAS POR ISSO DEVEMOS
 * APLICAR O CONCEITO DE INTERFACE PARA QUE POSSAMOS HERDAR
 * DE INTERFACES DIFERENTES
 * MELHORANDO A FLEXIBILIDADE DE RESPONSABILIDADE DE UMA CLASSE 
 * QUANDO EU PRECISO QUE UMA CLASSE TENHA MAIS DE UM PAPEL 
 * INEVITALMENTE EU DEVO IMPLEMENTAR INTERFACES QUE SÃO 
 * UM NIVEL MAIS PROFUNDO DE ABSTRAÇÃO
 */