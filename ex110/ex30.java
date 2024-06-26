package ex110;
import java.util.Scanner;
public class ex30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de maçãs compradas: ");
        int quantidade = scanner.nextInt();

        double preco;
        if (quantidade < 12) {
            preco = 0.50;
        } else {
            preco = 0.40;
        }

        double total = preco * quantidade;
        System.out.println("O valor total a ser pago é: " + total);
	}

}
