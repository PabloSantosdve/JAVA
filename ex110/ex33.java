package ex110;
import java.util.Scanner;
public class ex33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o turno (M/V): ");
        char turno = scanner.next().charAt(0);

        String saudacao;
        if (turno == 'M' || turno == 'm') {
            saudacao = "Bom dia, " + nome;
        } else if (turno == 'V' || turno == 'v') {
            saudacao = "Boa tarde, " + nome;
        } else {
            saudacao = "Turno inválido.";
        }

        System.out.println(saudacao);

	}

}
