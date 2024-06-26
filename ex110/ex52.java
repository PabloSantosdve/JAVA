package ex110;
import java.util.Scanner;
public class ex52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
        int soma = 0;

        do {
            soma += i;
            i++;
        } while (i <= 100);

        System.out.println("A soma dos números de 1 a 100 é: " + soma);
	}

}
