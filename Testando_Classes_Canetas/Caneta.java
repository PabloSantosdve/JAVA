package testandocanetas;

public class Caneta {
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	//Somente o void quando não tem retorno, ou seja, Não será executado ele sera executado em outra classe
	void rabiscar() {
		if (this.tampada==false && this.carga > 0) {
			System.out.println("Pode rabiscar à vontade!!!");
		}else {
			System.out.println("ERRO!! Verificar se a caneta esta tampada ou tem carga");
		}
		
	}
	void tampar() {
		this.tampada = true;
	}
	
	void destampar() {
		this.tampada = false; // this =  Significa que o atributo será instaciado em outra classe, porem esta sendo referenciado na mesma classe
	}
	//Em resumo, o "this" vai se referir ao objeto instanciado (atual). Instância é o objeto específico criado a partir da classe. Ex: Classe Caneta -> Caneta Bic = instância (objeto específico da classe Caneta) Então quando a gente usa o "this" estamos alterando as características da Caneta instanciada, e não da classe em si!
	void estado_atual() {
		System.out.println("Esta caneta é do modelo: " + this.modelo);
		System.out.println("Esta caneta tem a cor: " + this.cor);
		System.out.println("Esta caneta tem a ponta: " + this.ponta);
		System.out.println("Esta caneta esta com a carga em: " + this.carga + "%");
		//System.out.println("Esta caneta está  " + this.tampada);
		
	}
	
	void pintar() {
		if (this.carga == 0) {
			System.out.println("Erro a caneta esta sem tinta");
		}else {
			System.out.println("Pode escrever");
		}
	}
}

