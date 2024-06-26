package ex110;
import java.util.Scanner;
public class ex69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        int soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número: ");
            int num = scanner.nextInt();
            soma += num;
        }

        double media = soma / 5.0;
        System.out.println("A média é: " + media);

	}

}
