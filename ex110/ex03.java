package ex110;
import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	     
	        System.out.print("Digite a base do triângulo: ");
	        double base = scanner.nextDouble();

	      
	        System.out.print("Digite a altura do triângulo: ");
	        double altura = scanner.nextDouble();

	        
	        double area = (base * altura) / 2;

	        
	        System.out.printf("Área do triângulo: %.2f\n", area);


	}

}
