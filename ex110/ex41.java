package ex110;
import java.util.Scanner;
public class ex41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número positivo: ");
        int numero = scanner.nextInt();

        int i = 1;
        while (i <= numero) {
            if (numero % i == 0) {
                System.out.println(i);
            }
            i++;
        }
	}

}
