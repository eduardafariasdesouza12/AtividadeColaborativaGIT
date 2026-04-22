import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        /* Exercício 2 – Caixa Eletrônico Simples
        Crie um programa que simule um caixa eletrônico:
        Solicite um valor inteiro para saque
        Calcule a quantidade mínima de notas:
        Notas disponíveis:
        100
        50
        20
        10
        5
        2
        1
        Mostre quantas notas de cada serão usadas */

        Scanner scanner = new Scanner(System.in);
        int opcao;
        float valor;

        System.out.println("Olá! Escolha a opção Abaixo!\n");

        System.out.println("1 - Para Saque");
        System.out.println("2 - Sair");

        opcao = scanner.nextInt();

        switch (opcao) {
            case 1: {
                System.out.println("Qual valor deseja sacar?");
                valor = scanner.nextInt();

                System.out.println("Valor informado para Saque: R$"+ valor);

                System.out.println("Temos as seguintes notas: 100, 50, 20, 10, 5, 2, 1");

                break;
            }
            case 2: {
                System.out.println("Saindo...");
                scanner.close();
            }
        }





    }
}
