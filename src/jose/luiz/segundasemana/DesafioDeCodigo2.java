package jose.luiz.segundasemana;

import java.util.Scanner;

public class DesafioDeCodigo2 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
 
        try {
            String numeroConta = sc.nextLine();

            verificarNumeroConta(numeroConta);

            System.out.println("Número de conta válido.");
            
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage()); 
        }
// TODO: Inicialize um bloco try-catch para capturar exceções:
        

// TODO: Leia a entrada do usuário como uma string representando o número da conta:
           

// TODO: Chame o método verificarNumeroConta, passando o número da conta como argumento:
           
// TODO: Capture a exceção do tipo IllegalArgumentException, que pode ser lançada pelo método verificarNumeroConta:
       
// Aqui é impresso uma mensagem de erro, mostrando a mensagem associada à exceção:
    }
// Declaração do método verificarNumeroConta, que verifica se o número de conta tem exatamente 8 dígitos:
    private static void verificarNumeroConta(String numeroConta) { 

// TODO: Verifique se o número da conta tem exatamente 8 dígitos:
    if (numeroConta.length() != 8) {
        throw new IllegalArgumentException("Número de conta inválido. Digite exatamente 8 dígitos.");
   
// TODO: Implemente uma exceção do tipo IllegalArgumentException, caso o número de conta não tenha 8 dígitos:

        
            
        }
    }
}



