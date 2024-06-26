package ex110;
import java.util.Scanner;
public class ex44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        int i = 0;
        int soma = 0;

        while (i < 5) {
            System.out.println("Digite a idade da pessoa " + (i + 1) + ": ");
            int idade = scanner.nextInt();
            soma += idade;
            i++;
        }

        double media = soma / 5.0;
        System.out.println("A média das idades é: " + media);
	}

}
