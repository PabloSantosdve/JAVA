package ex110;
import java.util.Scanner;
public class ex26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código do produto: ");
        int codigo = scanner.nextInt();

        System.out.println("Digite a quantidade comprada: ");
        int quantidade = scanner.nextInt();

        double preco;
        switch (codigo) {
            case 1:
                preco = 10.0;
                break;
            case 2:
                preco = 20.0;
                break;
            case 3:
                preco = 30.0;
                break;
            default:
                preco = 0.0;
                System.out.println("Código do produto inválido.");
                break;
        }

        double total = preco * quantidade;
        System.out.println("O valor total a ser pago é: " + total);
	}

}
