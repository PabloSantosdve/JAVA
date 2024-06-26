package ex110;
import java.util.Scanner;
public class ex84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int contPares = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número: ");
            numeros[i] = scanner.nextInt();
            if (numeros[i] % 2 == 0) {
                contPares++;
            }
        }

        System.out.println("Quantidade de números pares: " + contPares);
	}

}
