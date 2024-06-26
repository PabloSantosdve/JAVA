package ex110;
import java.util.Scanner;
public class ex05 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Digite o preço do produto: ");
	        double preco = scanner.nextDouble();

	        
	        System.out.print("Digite a quantidade comprada: ");
	        int quantidade = scanner.nextInt();

	   
	        double valorTotal = preco * quantidade;

	        
	        if (quantidade > 10) {
	            valorTotal *= 0.9;  // Aplica 10% de desconto
	        }


	        System.out.printf("Valor total a ser pago: R$ %.2f\n", valorTotal);

	}

}
