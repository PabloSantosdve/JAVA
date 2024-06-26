package ex110;
import java.util.Scanner;
public class ex54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int i = 0;

        do {
            System.out.println("Digite um número: ");
            int num = scanner.nextInt();
            soma += num;
            i++;
        } while (i < 5);

        double media = soma / 5.0;
        System.out.println("A média é: " + media);
	}

}
