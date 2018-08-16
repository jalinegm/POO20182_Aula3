package src.ex3_Charlotte;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro c1 = new Cachorro();
		c1.nome = "Charlotte";
		c1.idade = 7;
		c1.peso = 9.7;
		
		System.out.println("Cachorro 1: \n Nome: "+c1.nome+"\n Idade: "+c1.idade+"\n Peso: "+c1.peso);
		
		c1.engordar();
		c1.envelhecer();
		
		System.out.println("Cachorro 1: \n Nome: "+c1.nome+"\n Idade: "+c1.idade+"\n Peso: "+c1.peso);


	}

}
