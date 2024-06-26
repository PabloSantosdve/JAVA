package ex110;
import java.util.Scanner;
public class ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o peso em kg: ");
        double peso = scanner.nextDouble();
        
        System.out.println("Digite a altura em metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);
        
        System.out.println("O seu IMC é: " + imc);
	}

}
