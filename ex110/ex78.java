package ex110;
import java.util.Scanner;
public class ex78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero == 0) {
            System.out.println(0);
        } else {
            String numeroString = Integer.toString(numero);
            for (int i = 0; i < numeroString.length(); i++) {
                System.out.println(numeroString.charAt(i));
            }
        }

	}

}
