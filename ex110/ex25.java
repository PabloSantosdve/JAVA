package ex110;
import java.util.Scanner;
public class ex25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite o número de faltas: ");
	        int faltas = scanner.nextInt();

	        if (faltas > 15) {
	            System.out.println("Reprovado por falta.");
	        } else {
	            System.out.println("Aprovado.");
	        }
	}

}
