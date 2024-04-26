package jose.luiz.primeirasemana;

public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota =7;
        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <6 ?  "Recuperação" : "reprovado"; //condição Ternária
        
        System.out.println(resultado);
    }
}
