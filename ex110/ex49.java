package ex110;
import java.util.Scanner;
public class ex49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int fatorial = 1;
        int i = numero;

        while (i > 1) {
            fatorial *= i;
            i--;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        scanner.close();
	}

}
