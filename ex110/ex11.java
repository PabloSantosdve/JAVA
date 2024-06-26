package ex110;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("Digite o terceiro número: ");
        double num3 = scanner.nextDouble();

        double media = (num1 + num2 + num3) / 3;
        
        System.out.println("A média aritmética é: " + media);
        
	}

}
