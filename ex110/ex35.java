package ex110;
import java.util.Scanner;
public class ex35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        double media = (num1 + num2 + num3) / 3.0;

        System.out.println("A média é: " + media);
        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        scanner.close();
	}

}
