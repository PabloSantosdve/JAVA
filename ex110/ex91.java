package ex110;
import java.util.Scanner;
public class ex91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        int[] numeros = new int[10];
	        int somaPositivos = 0, somaNegativos = 0;

	        for (int i = 0; i < 10; i++) {
	            System.out.println("Digite um número: ");
	            numeros[i] = scanner.nextInt();
	            if (numeros[i] > 0) {
	                somaPositivos += numeros[i];
	            } else if (numeros[i] < 0) {
	                somaNegativos += numeros[i];
	            }
	        }

	        System.out.println("Soma dos valores positivos: " + somaPositivos);
	        System.out.println("Soma dos valores negativos: " + somaNegativos);
	}

}
