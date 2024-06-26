package ex110;
import java.util.Scanner;
public class ex28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o peso em kg: ");
        double peso = scanner.nextDouble();

        System.out.println("Digite a altura em metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);
        String classificacao;

        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc < 24.9) {
            classificacao = "Peso normal";
        } else if (imc < 29.9) {
            classificacao = "Sobrepeso";
        } else if (imc < 34.9) {
            classificacao = "Obesidade grau 1";
        } else if (imc < 39.9) {
            classificacao = "Obesidade grau 2";
        } else {
            classificacao = "Obesidade grau 3";
        }

        System.out.println("O seu IMC é: " + imc);
        System.out.println("Classificação: " + classificacao);
	}

}
