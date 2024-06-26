package ex110;
import java.util.Scanner;
public class ex88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        int[] numeros = new int[5];
	        int somaPares = 0, somaImpares = 0, contPares = 0, contImpares = 0;

	        for (int i = 0; i < 5; i++) {
	            System.out.println("Digite um número: ");
	            numeros[i] = scanner.nextInt();
	            if (numeros[i] % 2 == 0) {
	                somaPares += numeros[i];
	                contPares++;
	            } else {
	                somaImpares += numeros[i];
	                contImpares++;
	            }
	        }

	        double mediaPares = contPares == 0 ? 0 : (double) somaPares / contPares;
	        double mediaImpares = contImpares == 0 ? 0 : (double) somaImpares / contImpares;

	        System.out.println("Média dos valores pares: " + mediaPares);
	        System.out.println("Média dos valores ímpares: " + mediaImpares);

	}

}
