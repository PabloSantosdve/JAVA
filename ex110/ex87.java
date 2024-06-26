package ex110;
import java.util.Scanner;
public class ex87 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int contPositivos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número: ");
            numeros[i] = scanner.nextInt();
            if (numeros[i] > 0) {
                contPositivos++;
            }
        }

        System.out.println("Quantidade de números positivos: " + contPositivos);

	}

}
