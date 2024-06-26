package ex110;
import java.util.Scanner;
public class ex42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        int i = 2;
        boolean primo = true;

        while (i <= numero / 2) {
            if (numero % i == 0) {
                primo = false;
                break;
            }
            i++;
        }

        if (primo && numero > 1) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

	}

}
