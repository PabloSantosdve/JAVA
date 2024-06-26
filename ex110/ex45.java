package ex110;
import java.util.Scanner;
public class ex45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a = 0, b = 1;
	        int i = 1;

	        System.out.println("Os primeiros 20 números da sequência de Fibonacci:");

	        while (i <= 20) {
	            System.out.println(a);
	            int soma = a + b;
	            a = b;
	            b = soma;
	            i++;
	        }
	}

}
