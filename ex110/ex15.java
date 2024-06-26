package ex110;
import java.util.Scanner;
public class ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário atual: ");
        double salario = scanner.nextDouble();

        double novoSalario = salario * 1.15;
        
        System.out.println("O novo salário com aumento é: " + novoSalario);
        
	}

}
