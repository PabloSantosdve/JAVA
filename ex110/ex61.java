package ex110;
import java.util.Scanner;
public class ex61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite um número: ");
	        int numero = scanner.nextInt();

	        int i = 1;
	        int soma = 0;

	        do {
	            if (i % 2 == 0) {
	                soma += i;
	            }
	            i++;
	        } while (i <= numero);

	        System.out.println("A soma de todos os números pares entre 1 e " + numero + " é: " + soma);

	}

}
