package ExerciciosCondicionais;
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite um numero: ");
        int number = scanner.nextInt();

        
        if (number % 10 == 0) {
            System.out.println("O numero e divisível por 10.");
        } else if (number % 5 == 0) {
            System.out.println("O número e divisível por 5.");
        } else if (number % 2 == 0) {
            System.out.println("O número e divisível por 2.");
        } else {
            System.out.println("O numero nao a divisivel por 10, 5 ou 2.");
        }

        // Fecha o scanner
        scanner.close();

	}

}
