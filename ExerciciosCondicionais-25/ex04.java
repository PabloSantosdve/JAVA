package ExerciciosCondicionais;
import java.util.Scanner;
public class ex04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("Digite o numero 1:");
		 int n1 = scanner.nextInt();
		 
		 System.out.println("Digite o numero 2:");
		 int n2 = scanner.nextInt();
		 
		 System.out.println("Digite o numero 3:");
		 int n3 = scanner.nextInt();
		 
		 if(n1 > n2 && n1 > n3) {
			 System.out.print(n1 + " é maior que " + n2 + " e " + n3);
		 }else if (n2 > n1 && n2 > n3) {
			 System.out.print(n2 + " é maior que " + n3 + " e " + n1); 
		 }else if (n3 > n1 && n3 > n2) {
			 System.out.print(n3 + " é maior que " + n2 + " e " + n1);
		 }
		 
		 
		 scanner.close();
	}
}
