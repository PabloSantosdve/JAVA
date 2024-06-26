package ExerciciosCondicionais;
import java.util.Scanner;
public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner idade = new Scanner(System.in);
		 
		 System.out.println("Digite a sua idade: ");
		 int id = idade.nextInt();
		 
		 if (id < 16) {
			 System.out.println("Não eleitor");
		 }else if (id >=18 && id <64) {
			 System.out.println("Voto Obrigatorio");
		 }else if (id >= 16 && id < 18) {
			 System.out.println("Voto opcional");
		 }else if (id >=65) {
			 System.out.println("Voto opcional");
		 }
		 

	}

}
