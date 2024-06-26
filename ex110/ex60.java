package ex110;
import java.util.Scanner;
public class ex60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 1;
        int i = 1;

        System.out.println("Os primeiros 20 números da sequência de Fibonacci:");

        do {
            System.out.println(a);
            int soma = a + b;
            a = b;
            b = soma;
            i++;
        } while (i <= 20);
	}

}
