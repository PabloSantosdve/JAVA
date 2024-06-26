package ex110;
import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
			
		System.out.println("Digite o primeiro numero: ");
		int n1 = numero.nextInt();
		
		System.out.println("Digite o Segundo numero: ");
		int n2 = numero.nextInt();
		
		
		int soma = n1 + n2;
		int sub = n1 - n2;
		int mult = n1 * n2;
		int div = n1/ n2;
		
		
		System.out.println("soma " + soma);
		System.out.println("Subtração " + sub);
		System.out.println("Multiplicação " + mult);
		System.out.println("Divisão " + div);
	}

}
