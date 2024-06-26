package ExerciciosCondicionais;
import java.util.Scanner;
public class ex14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int soma = 0;

        // Loop para ler e somar 10 números
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = scanner.nextInt();
            soma += numero;
        }

        // Imprime a soma dos números
        System.out.println("A soma dos 10 números é: " + soma);

	}

}
