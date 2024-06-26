package ex110;
import java.util.Scanner;
public class ex93 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int contIntervalo = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número: ");
            numeros[i] = scanner.nextInt();
            if (numeros[i] >= 10 && numeros[i] <= 50) {
                contIntervalo++;
            }
        }

        System.out.println("Quantidade de números no intervalo de 10 a 50: " + contIntervalo);
	}

}
