package geral;

import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a altura do retangulo: ");
        double altura = input.nextDouble();

        System.out.print("Digite a base do retangulo: ");
        double base = input.nextDouble();

        double area = altura * base;
        double perimetro = 2 * (altura + base);

        System.out.println("A area do retangulo e: " + area);
        System.out.println("O perímetro do retangulo é: " + perimetro);
    }
}
