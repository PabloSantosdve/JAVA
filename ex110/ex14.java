package ex110;
import java.util.Scanner;
public class ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade em anos: ");
        int anos = scanner.nextInt();
        
        System.out.println("Digite os meses: ");
        int meses = scanner.nextInt();
        
        System.out.println("Digite os dias: ");
        int dias = scanner.nextInt();

        int totalDias = anos * 365 + meses * 30 + dias;
        
        System.out.println("Você tem " + totalDias + " dias de vida.");
	}

}
