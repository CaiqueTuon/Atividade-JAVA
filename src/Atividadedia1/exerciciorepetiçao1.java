package Atividadedia1;

import java.util.Scanner;

public class exerciciorepeti�ao1 {

	public static void main(String[] args) {
		int x,numero;
		
		Scanner ler = new Scanner(System.in);
		
		
		
		
		for(x=0;x<10;x++)
		{	
			

		System.out.println("entre com um numero");
		numero = ler.nextInt();	
		
		if(numero % 2 == 0)
		{
			System.out.println("numero � par: ");			
		}
		if(numero % 2 != 0)
		{
			System.out.println("numero � impar: ");
		}
			
		}
	}

}
