package ex110;
import java.util.Scanner;
public class ex94 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        int[] numeros = new int[7];

	        for (int i = 0; i < 7; i++) {
	            System.out.println("Digite um número: ");
	            numeros[i] = scanner.nextInt();
	        }

	        System.out.println("Números pares:");
	        for (int i = 0; i < 7; i++) {
	            if (numeros[i] % 2 == 0) {
	                System.out.println(numeros[i]);
	            }
	        }
	}

}
