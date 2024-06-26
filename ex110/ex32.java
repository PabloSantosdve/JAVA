package ex110;
import java.util.Scanner;
public class ex32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();

        String conceito;
        if (nota >= 9) {
            conceito = "A";
        } else if (nota >= 8) {
            conceito = "B";
        } else if (nota >= 7) {
            conceito = "C";
        } else if (nota >= 6) {
            conceito = "D";
        } else {
            conceito = "E";
        }

        System.out.println("O conceito do aluno é: " + conceito);
	}

}
