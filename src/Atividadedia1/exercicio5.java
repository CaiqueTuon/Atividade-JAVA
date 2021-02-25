package Atividadedia1;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		double mediatotal,Nota1,Nota2,Nota3;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com sua primera nota: ");
		Nota1 = ler.nextFloat();
		System.out.println("Entre com sua segunda nota: ");
		Nota2 = ler.nextFloat();
		System.out.println("Entre com sua terceira nota: ");
		Nota3 = ler.nextFloat();
		
		mediatotal = ((Nota1 * 2) + (Nota2 * 3) + (Nota3 * 5))/10;
		
		System.out.printf("Media Ponderada é de: "+ mediatotal);

	}

}
