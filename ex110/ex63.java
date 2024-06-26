package ex110;
import java.util.Scanner;
public class ex63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite um número inteiro: ");
	        int numero = scanner.nextInt();

	        if (numero == 0) {
	            System.out.println(0);
	        } else {
	            do {
	                int digito = numero % 10;
	                System.out.println(digito);
	                numero = numero / 10;
	            } while (numero > 0);
	        }

	}

}
