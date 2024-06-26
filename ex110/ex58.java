package ex110;
import java.util.Scanner;

public class ex58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        int a = 0, b = 1;
        int soma;

        System.out.println("Sequência de Fibonacci até " + numero + ":");
        do {
            System.out.println(a);
            soma = a + b;
            a = b;
            b = soma;
        } while (a <= numero);

	}

}
