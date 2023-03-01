package geral;

import java.util.Scanner;

public class Bidimensional {
    public static void main(String[] args) {
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
