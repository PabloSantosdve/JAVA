package ex110;
import java.util.Scanner;
public class ex07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o salário base do funcionário: ");
        double salarioBase = scanner.nextDouble();
        
        double comissao = salarioBase * 0.05;
       
        double salarioLiquido = salarioBase + comissao;

        System.out.printf("Comissão: R$ %.2f\n", comissao);
       

	}

}
