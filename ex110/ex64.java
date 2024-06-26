package ex110;
import java.util.Scanner;
public class ex64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int fatorial = 1;
        int i = numero;

        do {
            fatorial *= i;
            i--;
        } while (i > 1);

        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        scanner.close();
	}

}
