package ExerciciosCondicionais;

import java.util.Scanner;

public class ex19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Digite a cotação do dólar (em reais): ");
        double cotacaoDolar = scanner.nextDouble();
        
        
        System.out.print("Digite a quantidade de dólares disponíveis: ");
        double quantidadeDolares = scanner.nextDouble();


        double valorEmReais = quantidadeDolares * cotacaoDolar;

      
        System.out.println("O valor equivalente em reais é: R$ " + valorEmReais);

	}

}
