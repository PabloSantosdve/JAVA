package ExerciciosCondicionais;
import java.util.Scanner;
public class ex22 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int contador = 0;

        System.out.println("Digite 20 números:");

        for (int i = 0; i < 20; i++) {
            int numero = scanner.nextInt();
            if (numero >= 0 && numero <= 100) {
                contador++;
            }
        }

        System.out.println("Quantidade de números entre 0 e 100: " + contador);

	}

}
