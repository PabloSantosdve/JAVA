package ex110;
import java.util.Scanner;
public class ex90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        boolean existeZero = false;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número: ");
            numeros[i] = scanner.nextInt();
            if (numeros[i] == 0) {
                existeZero = true;
            }
        }

        if (existeZero) {
            System.out.println("Há pelo menos um número igual a zero.");
        } else {
            System.out.println("Não há nenhum número igual a zero.");
        }

	}

}
