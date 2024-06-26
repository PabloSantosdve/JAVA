package ex110;
import java.util.Scanner;
public class ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int menores = 0;
        int maiores = 0;

        System.out.println("Digite a quantidade de pessoas: ");
        int quantidade = scanner.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite a idade da pessoa " + (i + 1) + ": ");
            int idade = scanner.nextInt();
            if (idade < 18) {
                menores++;
            } else {
                maiores++;
            }
        }

        System.out.println("Menores de idade: " + menores);
        System.out.println("Maiores de idade: " + maiores);
	}

}
