package ex110;
import java.util.Scanner;
public class ex75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 1;

        System.out.println("Os primeiros 20 números da sequência de Fibonacci:");
        for (int i = 1; i <= 20; i++) {
            System.out.println(a);
            int soma = a + b;
            a = b;
            b = soma;
        }
	}

}
