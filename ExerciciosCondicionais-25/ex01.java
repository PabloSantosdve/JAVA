package ExerciciosCondicionais;
import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		 // Exibindo as opções de pratos
       System.out.println("Escolha um prato:");
       System.out.println("1 - Vegetariano (180 cal)");
       System.out.println("2 - Peixe (230 cal)");
       System.out.println("3 - Frango (250 cal)");
       System.out.println("4 - Carne (350 cal)");
       int prato = scanner.nextInt();
       
    // Exibindo as opções de sobremesas
       System.out.println("Escolha uma sobremesa:");
       System.out.println("1 - Abacaxi (75 cal)");
       System.out.println("2 - Sorvete diet (110 cal)");
       System.out.println("3 - Mousse diet (170 cal)");
       System.out.println("4 - Mousse chocolate (200 cal)");
       int sobremesa = scanner.nextInt();

       // Exibindo as opções de bebidas
       System.out.println("Escolha uma bebida:");
       System.out.println("1 - Chá (20 cal)");
       System.out.println("2 - Suco de laranja (70 cal)");
       System.out.println("3 - Suco de melão (100 cal)");
       System.out.println("4 - Refrigerante diet (65 cal)");
       int bebida = scanner.nextInt();

       // Calculando o total de calorias
       int totalCalorias = calcularCalorias(prato, sobremesa, bebida);

       // Exibindo o resultado
       System.out.println("A quantidade total de calorias da refeição é: " + totalCalorias + " cal");

       scanner.close();
   }

   // Método para calcular as calorias com base nas escolhas do usuário
   public static int calcularCalorias(int prato, int sobremesa, int bebida) {
       int caloriasPrato = 0;
       int caloriasSobremesa = 0;
       int caloriasBebida = 0;

       switch (prato) {
           case 1:
               caloriasPrato = 180;
               break;
           case 2:
               caloriasPrato = 230;
               break;
           case 3:
               caloriasPrato = 250;
               break;
           case 4:
               caloriasPrato = 350;
               break;
           default:
               System.out.println("Opção de prato inválida");
               break;
       }

       switch (sobremesa) {
           case 1:
               caloriasSobremesa = 75;
               break;
           case 2:
               caloriasSobremesa = 110;
               break;
           case 3:
               caloriasSobremesa = 170;
               break;
           case 4:
               caloriasSobremesa = 200;
               break;
           default:
               System.out.println("Opção de sobremesa inválida");
               break;
       }

       switch (bebida) {
           case 1:
               caloriasBebida = 20;
               break;
           case 2:
               caloriasBebida = 70;
               break;
           case 3:
               caloriasBebida = 100;
               break;
           case 4:
               caloriasBebida = 65;
               break;
           default:
               System.out.println("Opção de bebida inválida");
               break;
       }

       return caloriasPrato + caloriasSobremesa + caloriasBebida;
	}

}
