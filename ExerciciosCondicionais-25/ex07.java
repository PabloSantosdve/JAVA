package ExerciciosCondicionais;

public class ex07 {

	public static void main(String[] args) {
		 // Cálculo da média dos números 8, 9 e 7
        int num1 = 8;
        int num2 = 9;
        int num3 = 7;
        double media1 = (num1 + num2 + num3) / 3.0;

        // Cálculo da média dos números 4, 5 e 6
        int num4 = 4;
        int num5 = 5;
        int num6 = 6;
        double media2 = (num4 + num5 + num6) / 3.0;

        // Cálculo da soma das duas médias
        double somaDasMedias = media1 + media2;

        // Cálculo da média das duas médias
        double mediaDasMedias = somaDasMedias / 2.0;

        // Impressão dos resultados
        System.out.println("A média dos números 8, 9 e 7 é: " + media1);
        System.out.println("A média dos números 4, 5 e 6 é: " + media2);
        System.out.println("A soma das duas médias é: " + somaDasMedias);
        System.out.println("A média das duas médias é: " + mediaDasMedias);

	}

}
