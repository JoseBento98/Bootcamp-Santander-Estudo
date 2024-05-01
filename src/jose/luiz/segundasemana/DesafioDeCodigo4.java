package jose.luiz.segundasemana;

import java.util.Scanner;

public class DesafioDeCodigo4 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in); 

        
        double saldo = sc.nextDouble();  
        double saque = sc.nextDouble(); 
        double limiteChequeEspecial = 500;
        

        
        if (saque <= saldo) {
            System.out.println("Transação realizada com sucesso.");
        }
        else if (saque <= saldo + limiteChequeEspecial) {
            System.out.println("Transação realizada com sucesso utilizando o cheque especial.");
        } else {
            System.out.println( "Transação não realizada. Limite do cheque especial excedido.");
        }
        
        

// Fechamos o objeto Scanner para liberar os recursos:
        sc.close(); 
    }
    
}
