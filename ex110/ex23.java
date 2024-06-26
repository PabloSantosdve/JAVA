package ex110;
import java.util.Scanner;
public class ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do mês: ");
        String mes = scanner.nextLine().toLowerCase();

        int dias;
        switch (mes) {
            case "janeiro":
            case "março":
            case "maio":
            case "julho":
            case "agosto":
            case "outubro":
            case "dezembro":
                dias = 31;
                break;
            case "abril":
            case "junho":
            case "setembro":
            case "novembro":
                dias = 30;
                break;
            case "fevereiro":
                dias = 28; // ou 29 em anos bissextos
                break;
            default:
                dias = -1; // Mês inválido
                break;
        }

        if (dias == -1) {
            System.out.println("Mês inválido.");
        } else {
            System.out.println("O mês de " + mes + " tem " + dias + " dias.");
        }

	}

}
