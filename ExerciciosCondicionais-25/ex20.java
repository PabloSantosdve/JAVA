package ExerciciosCondicionais;

import java.util.Scanner;

public class ex20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int contador = 0;

        System.out.println("Digite 20 números:");

        for (int i = 0; i < 20; i++) {
            int numero = scanner.nextInt();
            if (numero > 8) {
                contador++;
            }
        }

        System.out.println("Quantidade de números maiores do que 8: " + contador);
        scanner.close();

	}

}
