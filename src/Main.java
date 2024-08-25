import java.util.Scanner;


/**
 * 
 * Programação de soluções computacionais - Una Sete Lagoas *
 * Professor: Fabrício Valadares *
 * Introcução à programação usando java.
 */


// Classe principal - onde serão realizadas as demais chamadas do programa de vocês.
public class Main {
    // Método main - este é o primeiro método (ação) chamado  durante a execução do programa.
    public static void main(String[] args) {
        // Declaração de variáveis
        String nomeCompleto; // String - texto
        int idade; // int - Número inteiro I = {0, 1, 2, ..., 8, 9...}
        String teste;
        DadosPessoais dp;

        // Criação do objeto resposável pela leitura de dados vindos do teclado. (input é apenas uma sugestão)
        Scanner input = new Scanner(System.in);


        System.out.print("Por favor, informe seu nome: "); // Comando de saída, sem quebra de linha no final
        nomeCompleto = input.nextLine();
        System.out.print("Por favor, informe sua idade: ");
        idade = input.nextInt();
        input.skip("[\r\n]");
        System.out.print("Por favor, informe seu teste: ");
        teste = input.nextLine();

        dp = new DadosPessoais(nomeCompleto, idade);

        System.out.println("\n");
        System.out.println(dp);
    }
}
