package Atividadedia1;

import java.util.Scanner;

public class exerciciolaço1 {

	public static void main(String[] args) {
		int a,b,c;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com um numero inteiro");
		a = ler.nextInt();
		System.out.println("Entre com um numero inteiro");
		b = ler.nextInt();
		System.out.println("Entre com um numero inteiro");
		c = ler.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("O numero maior é :"+ a);
		}
		if(b>c && b>a)
		{
			System.out.println("O numero maior é :"+ b);
		}
		if(c>b && c>a)
		{
			System.out.println("O numero maior é :"+ c);
		}
		
		

	}

}
