package jose.luiz.primeirasemana;

public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for(int x=0; x<alunos.length; x++) {
            System.out.println("O aluno no indice X= " + x + " é " + alunos[x]);
        }

        //forma abreviada
        for(String aluno : alunos) {
            System.out.println(alunos);
        }

    }
}
