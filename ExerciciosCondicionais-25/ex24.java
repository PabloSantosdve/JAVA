package ExerciciosCondicionais;
import java.util.Scanner;
public class ex24 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int soma = 0;
	        
	        System.out.println("Digite uma sequência de números (Digite um número negativo para encerrar):");

	        while (true) {
	            int numero = scanner.nextInt();
	            if (numero < 0) {
	                break;
	            }
	            soma += numero;
	        }

	        System.out.println("A soma dos números digitados é: " + soma);

	}

}
