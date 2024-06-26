package ex110;
import java.util.Scanner;
public class ex81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Números na ordem inversa:");
        for (int i = 4; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
	}

}
