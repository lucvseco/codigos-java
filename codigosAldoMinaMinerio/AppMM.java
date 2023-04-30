package codigosAldoMinaMinerio;

public class AppMM {

	public static void main(String[] args) {

		Minerio minerio1 = new Minerio(1, "ouro");
		Minerio minerio2 = new Minerio(2, "Ferro");
		Minerio minerio3 = new Minerio(3, "Prata");
		Minerio minerio4 = new Minerio(4, "Cobre");
		

		Mina mina1 = new Mina(100, minerio2);

		Mina mina2 = new Mina(101, minerio1);
		
		System.out.println("Id da Mina 1: " + mina1);
		System.out.println("Descricao do minerio da mina 1: " + mina1.getMinerio()   );
	}

}