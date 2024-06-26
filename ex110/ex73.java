package ex110;
import java.util.Scanner;
public class ex73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite um número: ");
	        int numero = scanner.nextInt();

	        int a = 0, b = 1;

	        System.out.println("Sequência de Fibonacci até " + numero + ":");
	        for (int i = 1; a <= numero; i++) {
	            System.out.println(a);
	            int soma = a + b;
	            a = b;
	            b = soma;
	        }
	}

}
