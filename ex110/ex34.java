package ex110;
import java.util.Scanner;
public class ex34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18 && idade <= 70) {
            System.out.println("Voto obrigatório.");
        } else if (idade >= 16 && idade < 18 || idade > 70) {
            System.out.println("Voto facultativo.");
        } else {
            System.out.println("Não pode votar.");
        }

	}

}
