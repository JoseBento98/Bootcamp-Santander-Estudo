package jose.luiz.segundasemana;

public enum EstadoBrasileiro {
          SAO_PAULO ("SP", "São Paulo",11),
          RIO_JANEIRO("RJ", "Rio de Jnaiero",12),
          PIAUI("PI", "Piauí",13),
          MARANHAO("MA","Maranhão",14),
          CEARA("CE","CEARÁ",15)
          ;

          private String nome;
          private String sigla;
          private int ibge;
          
          private EstadoBrasileiro(String nome, String sigla, int ibge) {
                    this.nome = nome;
                    this.sigla = sigla;
                    this.ibge = ibge;
          }

          public int getIbge(){
                    return ibge;
          }

          public String getNome() {
                    return nome;
          }

          public String getSigla() {
                    return sigla;
          }
          public String getNomeMaiusculo() {
                    return nome.toUpperCase();
          }

          
}
