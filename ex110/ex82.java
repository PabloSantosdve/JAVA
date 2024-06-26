package ex110;
import java.util.Scanner;
public class ex82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número: ");
            int numero = scanner.nextInt();
            soma += numero;
        }

        System.out.println("A soma dos números é: " + soma);
	}

}
