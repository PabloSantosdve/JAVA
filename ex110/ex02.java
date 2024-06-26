package ex110;
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        
		 double PI = 3.14;

	      
	        System.out.print("Digite o raio do círculo: ");
	        double raio = scanner.nextDouble();

	      
	        double area = PI * (raio * raio);
	        double perimetro = 2 * PI * raio;

	     
	        System.out.printf("Área do círculo: %.2f\n", area);
	        System.out.printf("Perímetro do círculo: %.2f\n", perimetro);

	}

}
