package ex110;
import java.util.Scanner;
public class ex110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int produto = 1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite um número para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                if (i + j == 2) {
                    produto *= matriz[i][j];
                }
            }
        }

        System.out.println("O produto dos elementos da diagonal secundária é: " + produto);

	}

}
