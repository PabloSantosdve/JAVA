package ex110;
import java.util.Scanner;
public class ex101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int soma = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Digite um número para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                soma += matriz[i][j];
            }
        }

        double media = (double) soma / (4 * 4);
        System.out.println("A média aritmética dos elementos da matriz é: " + media);
	}

}
