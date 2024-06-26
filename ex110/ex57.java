package ex110;
import java.util.Scanner;
public class ex57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        int i = 2;
        boolean primo = true;

        do {
            if (numero % i == 0) {
                primo = false;
                break;
            }
            i++;
        } while (i <= numero / 2);

        if (primo && numero > 1) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
	}

}
