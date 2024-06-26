package testandocanetas;

public class TesteCanetas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caneta caneta1 = new Caneta();

		caneta1.modelo = "esferográfica";
		caneta1.cor = "Preta";
		caneta1.ponta = 0.5f;
		caneta1.carga = 0;
		// caneta1.tampada = true;

		caneta1.tampar(); // Esse metodo diz que a caneta esta tampada!!
		caneta1.estado_atual();
		caneta1.rabiscar();
		caneta1.pintar();

		System.out.println("------------------------------------------------------------------------");

		Caneta caneta2 = new Caneta();

		caneta2.modelo = "hidrográfica";
		caneta2.cor = "Azul";
		caneta2.ponta = 0.3f;
		caneta2.carga = 0;
		// caneta1.tampada = true;

		caneta2.tampar(); // Esse metodo diz que a caneta esta tampada!!
		caneta2.estado_atual();
		caneta2.rabiscar();
		caneta2.pintar();
		
		System.out.println("------------------------------------------------------------------------");
		
	}
}
