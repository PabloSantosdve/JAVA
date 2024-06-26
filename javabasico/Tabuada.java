package javabasico;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {

		Scanner valor = new Scanner(System.in);

		System.out.println("Você deseja ver a tabuada de qual numero: ");
		int numero = valor.nextInt();

		System.out.println("A tabuada do " + numero + " é " + "\n" + numero * 1 + "\n" + numero * 2 + "\n" + numero * 3
		+ "\n" + numero * 4 + "\n" + numero * 5 + "\n" + numero * 6 + "\n" + numero * 7 + "\n" + numero * 8
		+ "\n" + numero * 9 + "\n" + numero * 10);

	}

}
