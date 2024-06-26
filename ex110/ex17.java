package ex110;
import java.util.Scanner;
public class ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade <= 12) {
            System.out.println("Criança");
        } else if (idade <= 18) {
            System.out.println("Adolescente");
        } else if (idade <= 60) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }
	}

}
