package ex110;
import java.util.Scanner;
public class ex59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        int somaIdades = 0;
	        int i = 0;

	        do {
	            System.out.println("Digite a idade da pessoa " + (i + 1) + ": ");
	            int idade = scanner.nextInt();
	            somaIdades += idade;
	            i++;
	        } while (i < 5);

	        double media = (double) somaIdades / 5;
	        System.out.println("A média das idades é: " + media);

	}

}
