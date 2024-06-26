package ex110;
import java.util.Scanner;
public class ex48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        while (numero > 0) {
            int digito = numero % 10;
            System.out.println(digito);
            numero = numero / 10;
        }

	}

}
