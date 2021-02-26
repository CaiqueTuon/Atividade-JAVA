package Atividadedia1;

import java.util.Scanner;

public class exerciciorepeticao6 {


	public static void main(String[] args) {
		int i,soma = 0,contador=0;
			
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com um numero do seu teclado");
		i = ler.nextInt();
		
		do
		{
		 
		  if(i % 3 == 0)
		  { 
		  soma = soma + i;
		  contador++;
		  }
		 
		System.out.println("Entre com um numero do seu teclado");
		i = ler.nextInt(); 
		
		}
		
		while( i != 0);
		{
		
		System.out.println("a media de numeros multiplicados por 3 : "+soma/contador);
		}
			
		
		
	}

}