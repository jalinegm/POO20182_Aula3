package src.ex_1;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Imprima todos os números de 100 a 300");
		for(int i=100; i<=300; i++) {
			System.out.print("\t"+i);
		}
		
		System.out.println("\n----------------------------------------");

		
		System.out.println("\n Imprima todos os números pares de 20 a 30");
		for(int i=20; i<=30; i++) {
			if(i%2==0) {
				System.out.print("\t"+i);
			}
		}

		System.out.println("\n ----------------------------------------");

		System.out.println("\n Dado uma variável X positiva ≠ 1, imprima todos os números de X a 1\n");
		Scanner sc = new Scanner(System.in);
		int i=0;
		
		//para pegar um número positivo diferente de zero direto do teclado
		do{
			System.out.println("Digite um número: ");
			i = sc.nextInt();
		}while(i<=0 || i==1);
		
			for(;i>0; i--) {
				System.out.print(" "+i);
			}
		
		}
}
