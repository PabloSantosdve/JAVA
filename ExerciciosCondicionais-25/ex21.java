package ExerciciosCondicionais;
import java.util.Scanner;
public class ex21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        double valorPrestacao = valorCompra / 5;

        System.out.println("O valor de cada prestação é: " + valorPrestacao);


	}

}
