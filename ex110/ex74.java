package ex110;
import java.util.Scanner;
public class ex74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        int somaIdades = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a idade da pessoa " + (i + 1) + ": ");
            int idade = scanner.nextInt();
            somaIdades += idade;
        }

        double media = (double) somaIdades / 5;
        System.out.println("A média das idades é: " + media);
	}

}
