package ex110;
import java.util.Scanner;
public class ex97 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[2][2];
        int soma = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Digite um número para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                soma += matriz[i][j];
            }
        }

        System.out.println("A soma dos elementos da matriz é: " + soma);
	}

}
