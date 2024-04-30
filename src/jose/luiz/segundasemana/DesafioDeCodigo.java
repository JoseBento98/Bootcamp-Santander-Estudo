package jose.luiz.segundasemana;
import java.util.Scanner;
    

public class DesafioDeCodigo { 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        double saldo = 0; 
        double deposito;
        double saque;
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar Saldo");
            System.out.println("0. Encerrar");

            int opcao = sc.nextInt(); 

        // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
        // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.
                switch (opcao) {
                  case 1:{
                    System.out.println("Insira o valor que deseja depositar:");
                    deposito = sc.nextDouble();
                    saldo += deposito;
                    System.out.println("Depósito realizado com sucesso.");
                    break;
                  }
                  case 2:
                    System.out.println("Insira o valor que deseja sacar:");
                    saque = sc.nextDouble();
                    if (saldo >= saque) {
                        saldo -= saque;
                        System.out.println("Saque realizado com sucesso.");
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                  case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break; 
                  case 0:
                    System.out.println("Programa encerrado.");
                    return;
           
        
        // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:    
                  default:
                    System.out.println("Opção inválida. Tente novamente."); 
                }
        }
    }

}

