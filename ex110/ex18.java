package ex110;
import java.util.Scanner;
public class ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite o primeiro número: ");
	        int num1 = scanner.nextInt();
	        
	        System.out.println("Digite o segundo número: ");
	        int num2 = scanner.nextInt();

	        if (num1 > num2) {
	            System.out.println("O maior número é: " + num1);
	        } else if (num2 > num1) {
	            System.out.println("O maior número é: " + num2);
	        } else {
	            System.out.println("Os números são iguais.");
	        }
	        
	}

}
