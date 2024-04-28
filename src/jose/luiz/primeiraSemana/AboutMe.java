package jose.luiz.primeirasemana;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try{
        Scanner sc = new Scanner (System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = sc.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = sc.next();

        System.out.println("Digite sua Idade: ");
        int idade = sc.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();


        //imprimindo dados obtidos pelo usuario
        System.out.println("olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("tenho " + idade + "anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        sc.close();
        }
        catch (InputMismatchException e) {
            System.err.println("Os campos idade e altura precisam ser numericos");
        }
    }
}
