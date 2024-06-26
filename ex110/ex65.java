package ex110;
import java.util.Scanner;
public class ex65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        int somaIdades = 0;
        int contador = 0;

        do {
            System.out.println("Digite o nome (ou 'fim' para terminar): ");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.println("Digite a idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine();  // consumir a nova linha

            somaIdades += idade;
            contador++;
        } while (true);

        if (contador > 0) {
            double media = (double) somaIdades / contador;
            System.out.println("A média das idades é: " + media);
        } else {
            System.out.println("Nenhuma idade foi informada.");
        }
	}

}
