package ex110;
import java.util.Scanner;
public class ex39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        int i = 0;
        int soma = 0;

        while (i < 5) {
            System.out.println("Digite um número: ");
            int num = scanner.nextInt();
            soma += num;
            i++;
        }

        double media = soma / 5.0;
        System.out.println("A média é: " + media);
	}

}
