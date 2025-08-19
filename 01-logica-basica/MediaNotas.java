import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota 1: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite a nota 2: ");
        double n2 = sc.nextDouble();

        double media = (n1 + n2) / 2;

        System.out.println("Média final: " + media);

        if (media >= 7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado.");
        }

        sc.close();
    }
}
