package ex110;
import java.util.Scanner;
public class ex83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int soma = 0;

        for (int i = 0; i < 7; i++) {
            System.out.println("Digite um número: ");
            int numero = scanner.nextInt();
            soma += numero;
        }

        double media = (double) soma / 7;
        System.out.println("A média é: " + media);

	}

}
