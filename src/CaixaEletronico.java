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
        int opcao, notas,qtdnotas, valor, diferenca;
        diferenca = 0;

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

                qtdnotas = valor / 100;
                System.out.println("Disponível: " + qtdnotas + " Notas de R$ 100,00");

                diferenca = valor - (qtdnotas * 100);
                qtdnotas = (valor / 100) / 50;

                System.out.println("Disponível: " + diferenca / 50 + " Notas de R$ 50,00");
                diferenca = valor - (qtdnotas * 50);
                diferenca = valor / 50;
                qtdnotas = (valor / 100) / 50;

                System.out.println("Disponível: " + diferenca / 20 + " Notas de R$ 20,00");
                //diferenca = diferenca - (qtdnotas * 20);
                diferenca = diferenca / 20;
                qtdnotas = (valor / 50) / 20;

                System.out.println("Disponível: " + diferenca / 10 + " Notas de R$ 10,00");
                diferenca = diferenca - (qtdnotas * 10);
                diferenca = diferenca / 10;
                qtdnotas = (valor / 20) / 10;

                System.out.println("Disponível: " + diferenca / 5 + " Notas de R$ 5,00");
                diferenca = diferenca - (qtdnotas * 5);
                diferenca = diferenca / 5;
                qtdnotas = (diferenca / 10) / 5;

                System.out.println("Disponível: " + diferenca / 2 + " Notas de R$ 2,00");
                diferenca = diferenca - (qtdnotas * 2);
                diferenca = diferenca / 2;
                //qtdnotas = (valor / 5) / 2;

                System.out.println("Disponível: " + diferenca / 1 + " Notas de R$ 1,00");
                diferenca = diferenca - (qtdnotas * 1);
                diferenca = diferenca / 1;
                //qtdnotas = (valor / 2) / 1;

                break;
            }
            case 2: {
                System.out.println("Saindo...");
                scanner.close();
            }
        }





    }
}
