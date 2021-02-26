package Atividadedia1;

import java.util.Scanner;

public class exerciciorepeticao5 {

	public static void main(String[] args) {
		int i,soma = 0,contador=0;
			
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com um numero do seu teclado");
		i = ler.nextInt();
		
		do
		{
		 soma = soma + i; 
		 
		 System.out.println("Entre com um numero do seu teclado");
		i = ler.nextInt(); 
		
		}
		
		while( i != 0);
		{
		
		System.out.println("a soma é de : "+soma);
		}
			
		
		
	}

}