package ex110;
import java.util.Scanner;
public class ex13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        
        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 % num2 == 0) {
            System.out.println(num1 + " é múltiplo de " + num2);
        } else {
            System.out.println(num1 + " não é múltiplo de " + num2);
        }
	}

}
