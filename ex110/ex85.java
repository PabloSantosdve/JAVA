package ex110;
import java.util.Scanner;
public class ex85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        int[] numeros = new int[5];

	        for (int i = 0; i < 5; i++) {
	            System.out.println("Digite um número: ");
	            numeros[i] = scanner.nextInt();
	        }

	        int maior = numeros[0];
	        int menor = numeros[0];

	        for (int i = 1; i < 5; i++) {
	            if (numeros[i] > maior) {
	                maior = numeros[i];
	            }
	            if (numeros[i] < menor) {
	                menor = numeros[i];
	            }
	        }

	        System.out.println("Maior valor: " + maior);
	        System.out.println("Menor valor: " + menor);
	}

}
