package ex110;
import java.util.Scanner;
public class ex08 {

	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int n1 = enter.nextInt();	
		 
		System.out.println("Digite um numero: ");
		int n2 = enter.nextInt();
		
		n1 = n2;
		n2 = n1;
		 
		System.out.println("O primeiro numero foi: " + n1);
		System.out.println("O segundo numero foi: " + n2);
	}

}
