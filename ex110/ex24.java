package ex110;
import java.util.Arrays;
import java.util.Scanner;
public class ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        int[] numeros = {num1, num2, num3};
        Arrays.sort(numeros);

        System.out.println("Os números em ordem crescente são: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
	}

}
