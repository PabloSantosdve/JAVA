package ex110;
import java.util.Scanner;
public class ex105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int[] somaColunas = new int[4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Digite um número para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                somaColunas[j] += matriz[i][j];
            }
        }

        System.out.println("A soma dos elementos de cada coluna é:");
        for (int j = 0; j < 4; j++) {
            System.out.println("Coluna " + j + ": " + somaColunas[j]);
        }

	}

}
