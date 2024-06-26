package javabasico;
 
import java.util.Scanner; // classe da biblioteca do Java para entrar com dados no sistema
 
public class SegundoPrograma {
 
	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in); // representa a entrada de dados pelo teclado
		
		//int numero = 2; // definição de variável do tipo inteiro
		//string frase = "bla bla bla"; // definição de variável do tipo string (texto)
		
		System.out.println("Exibindo os valores dos atributos");
		
		
		System.out.println("Entre com um número: ");
		int numero = valor.nextInt();// usamos nextInt() para atributos do tipo int
		System.out.println("O número inserido foi: " + numero);
		
		valor.nextLine();
		System.out.println("Entre com uma frase: ");		
		String mensagem = valor.nextLine(); // usamos nextLine() para atributos do tipo String
		System.out.println("O frase inserida foi: " + mensagem);
		

	}
 
}

