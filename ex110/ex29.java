package ex110;
import java.util.Scanner;
public class ex29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();

        if (nota >= 7) {
            System.out.println(nome + " está aprovado.");
        } else {
            System.out.println(nome + " está em recuperação.");
        }
	}

}
