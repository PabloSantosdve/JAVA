package ex110;
import java.util.Scanner;
public class ex100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        int[][] matriz = new int[3][3];
	        int maior = Integer.MIN_VALUE;

	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.println("Digite um número para a posição [" + i + "][" + j + "]: ");
	                matriz[i][j] = scanner.nextInt();
	                if (matriz[i][j] > maior) {
	                    maior = matriz[i][j];
	                }
	            }
	        }

	        System.out.println("O maior valor presente na matriz é: " + maior);

	}

}
