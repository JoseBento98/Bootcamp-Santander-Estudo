package jose.luiz.segundasemana;

import java.util.Scanner;

public class DesafioDeCodigo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que informe o limite diário de saque
        double limiteDiario = scanner.nextDouble();

        // Variável para rastrear o limite restante
        double limiteRestante = limiteDiario;

        // Variável para rastrear o total de saques
        int totalSaques = 0;

        // Utilizando um laço while para iterar sobre os saques
        while (true) {
            // Solicitar ao usuário que informe o valor do saque
            double saque = scanner.nextDouble();

            // Verificar se o usuário deseja encerrar as transações
            if (saque == 0) {
                // Verificar se houve pelo menos um saque antes de encerrar
                if (totalSaques > 0) {
                    System.out.println("Saque realizado. Limite restante: " + limiteRestante);
                }
                System.out.println("Transacoes encerradas.");
                break;
            }

            // Verificar se o valor do saque ultrapassa o limite diário
            if (saque > limiteRestante) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            } else {
                // Realizar o saque e atualizar o limite restante e o total de saques
                limiteRestante -= saque;
                totalSaques++;
            }
        }

        scanner.close();
    }
}