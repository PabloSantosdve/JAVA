package ex110;
import java.util.Scanner;
public class ex71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite um número positivo: ");
	        int numero = scanner.nextInt();

	        for (int i = 1; i <= numero; i++) {
	            if (numero % i == 0) {
	                System.out.println(i);
	            }
	        }
	}

}
