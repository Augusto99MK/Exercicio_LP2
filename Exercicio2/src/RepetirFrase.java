import java.util.Scanner;

public class RepetirFrase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = input.nextLine();

        System.out.print("Digite um numero inteiro: ");
        int vezes = input.nextInt();

        for (int i = 1; i <= vezes; i++) {
            System.out.println(frase);
        }
    }
}
