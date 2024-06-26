package ex110;
import java.util.Scanner;
public class ex103 {
	public static void main(string [] args) {
		Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int menor = Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite um número para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        System.out.println("O menor valor presente na matriz é: " + menor);
		
	}
	
}
