package ExerciciosCondicionais;
import java.util.Scanner;
public class ex13 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Leitura da temperatura em graus Celsius
	        System.out.print("Digite a temperatura em graus Celsius: ");
	        double celsius = scanner.nextDouble();

	        // Conversão de Celsius para Fahrenheit
	        double fahrenheit = (9 * celsius + 160) / 5;

	      
	        System.out.printf("A temperatura em graus Fahrenheit é: %.2f%n", fahrenheit);

	}

}
