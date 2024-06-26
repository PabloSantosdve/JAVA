package ex110;
import java.util.Scanner;
public class ex27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite o sexo (M/F): ");
        char sexo = scanner.next().charAt(0);

        boolean podeAposentar;
        if (sexo == 'M' || sexo == 'm') {
            podeAposentar = idade >= 65;
        } else if (sexo == 'F' || sexo == 'f') {
            podeAposentar = idade >= 60;
        } else {
            podeAposentar = false;
            System.out.println("Sexo inválido.");
        }

        if (podeAposentar) {
            System.out.println("Pode se aposentar.");
        } else {
            System.out.println("Não pode se aposentar.");
        }
	}

}
