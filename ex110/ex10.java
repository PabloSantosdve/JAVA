package ex110;
import java.util.Scanner;
public class ex10 {

	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		
			System.out.println("Digite um numero: ");
			int numero = enter.nextInt();
		
		for (int i =1; i<= 10; i++) {
			System.out.println( numero + " X " + i + " = " + (numero * i));
		}

	}

}
