package geral;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Diga Ola!");
            System.out.println("2 - Repetindo a frase");
            System.out.println("3 - Repetindo a frase v2");
            System.out.println("4 - Geometria");
            System.out.println("5 - Bidimensional");
            System.out.println("0 - Sair");
            System.out.print("Digite a opcao desejada: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    exercicio1();
                    break;
                case 2:
                    exercicio2();
                    break;
                case 3:
                    exercicio3();
                    break;
                case 4:
                    exercicio4();
                    break;
                case 5:
                    exercicio5();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opcao invalida, tente novamente.");
            }
        } while (opcao != 0);
    }

    public static void exercicio1() {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = input.next();

        System.out.println("Ola, " + nome + "!");
    }

    public static void exercicio2() {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = input.nextLine();

        System.out.print("Digite um numero inteiro: ");
        int numero = input.nextInt();

        for (int i = 0; i < numero; i++) {
            System.out.println(frase);
        }
    }

    public static void exercicio3() {
    	Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int vezes = input.nextInt();
        input.nextLine();

        System.out.print("Digite uma frase: ");
        String frase = input.nextLine();

        for (int i = 1; i <= vezes; i++) {
            System.out.println(frase);
        }
    }

    public static void exercicio4() {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a altura do retangulo: ");
        double altura = input.nextDouble();

        System.out.print("Digite a base do retangulo: ");
        double base = input.nextDouble();

        double area = altura * base;
        double perimetro = 2 * (altura + base);

        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
    }

    public static void exercicio5() {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = input.next();

        System.out.print("Digite o numero de linhas: ");
        int linhas = input.nextInt();

        System.out.print("Digite o numero de colunas: ");
        int colunas = input.nextInt();

        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= colunas; j++) {
                System.out.print(palavra + " ");
            }
            System.out.println();
        }
    }
}
