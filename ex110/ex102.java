package ex110;
import java.util.Scanner;
public class ex102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        int[][] matriz1 = new int[2][2];
	        int[][] matriz2 = new int[2][2];
	        int[][] produto = new int[2][2];

	        System.out.println("Digite os elementos da primeira matriz:");
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                System.out.println("Posição [" + i + "][" + j + "]: ");
	                matriz1[i][j] = scanner.nextInt();
	            }
	        }

	        System.out.println("Digite os elementos da segunda matriz:");
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                System.out.println("Posição [" + i + "][" + j + "]: ");
	                matriz2[i][j] = scanner.nextInt();
	            }
	        }

	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                produto[i][j] = matriz1[i][j] * matriz2[i][j];
	            }
	        }

	        System.out.println("O produto das duas matrizes é:");
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                System.out.print(produto[i][j] + " ");
	            }
	            System.out.println();
	        }
	}

}
