import java.util.Scanner;

public class CalculadoraComMenu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1, num2, opcao, resultado;
        num1 = 0;
        num2 = 0;

        System.out.println("    Menu   ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("0 - Sair");

        System.out.println("Escolha uma opção do menu:");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1: {
                System.out.println("informa primeiro o valor");
                num1 = scanner.nextInt();

                System.out.println("informa segundo  valor");
                num2 = scanner.nextInt();

                resultado = num1 + num2;
                System.out.println(" resultado é " + resultado);

            } case 2: {
                System.out.println("informa primeiro o valor");
                num1 = scanner.nextInt();

                System.out.println("informa segundo  valor");
                num2 = scanner.nextInt();

                resultado = num1 - num2;
                System.out.println(" resultado é " + resultado);

            } case 3: {
                System.out.println("informa primeiro o valor");
                num1 = scanner.nextInt();

                System.out.println("informa segundo  valor");
                num2 = scanner.nextInt();

                resultado = num1 * num2;
                System.out.println(" resultado é " + resultado);

            } case 4: {

                System.out.println("informa o valor");
                num1 = scanner.nextInt();
                if (num1 == 0) {
                    System.out.println("opcao invalida");
                    return;
                }
                System.out.println("informa segundo  valor");
                num2 = scanner.nextInt();
                if (num2 == 0) {
                    System.out.println("opcao invalida");
                    return;
                }
                resultado = num1 / num2;
                System.out.println(" resultado é " + resultado);
            }
        }
    }
}