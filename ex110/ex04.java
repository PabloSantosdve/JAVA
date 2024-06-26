package ex110;
import java.util.Scanner;
public class ex04 {

	public static void main(String[] args) {
		Scanner nota = new Scanner(System.in);

		System.out.print("Nota 1°Bimestre: ");
		float nota1 = nota.nextFloat();
		nota.nextLine();

		System.out.print("Nota 2°Bimestre: ");
		float nota2 = nota.nextFloat();
		nota.nextLine();

		System.out.print("Nota 3°Bimestre: ");
		float nota3 = nota.nextFloat();
		nota.nextLine();

		System.out.print("Nota 4°Bimestre: ");
		float nota4 = nota.nextFloat();
		nota.nextLine();

		float media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 6) {
			System.out.print("O aluno foi Aprovado! A media do aluno foi: " + media);
		} else if (media >= 5) {
			System.out.print("O aluno esta de recuperação! A media do aluno foi: " + media);
		} else {
			;
			System.out.print("O aluno foi reprovado! A media do aluno foi: " + media);
		}

	}

}
