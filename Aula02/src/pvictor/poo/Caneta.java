package pvictor.poo;

public class Caneta {

	// Atributos
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;

	// Metodos
	void status() {
		System.out.println("Modelo da caneta: " + this.modelo);
		System.out.println("Cora da caneta: " + this.cor);
		System.out.println("Ponta: "+ this.ponta);
		System.out.println("Carga: "+ this.carga + " % ");
		System.out.println("Est� tampada? " + this.tampada);
		
	}
	void rabiscar() {
		if(this.tampada == true) {
			System.out.println("ERRO! N�o posso rabiscar");
		}else {
			System.out.println("Estou rabiscando!");
		}

	}

	void tampar() {
		this.tampada = true;

	}

	void destampar() {
		this.tampada = false;

	}
}
