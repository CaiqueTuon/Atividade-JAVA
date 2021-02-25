package Atividadedia1;

import java.util.Scanner;

public class exercicolaço2 {

	public static void main(String[] args) {
			int a,b,c;
			
			Scanner ler = new Scanner(System.in);
			
			System.out.println("Entre com um numero inteiro");
			a = ler.nextInt();
			System.out.println("Entre com um numero inteiro");
			b = ler.nextInt();
			System.out.println("Entre com um numero inteiro");
			c = ler.nextInt();
			
			if(a<=b && b>=c)
			{
				System.out.println("A ordem : " + a + b + c);
			}
			else if(b<=a && a>=c)
			{
				System.out.println("A ordem : " + b + a + c);
			}
			else if(c<=a && a>=b)
			{
				System.out.println("A ordem : " + c + b + a);
			}
			else if(b<=c && c>=b)
			{
				System.out.println("A ordem : " + b + c + a);
			}
			else if(a<=c && c>=b)
			{
				System.out.println("A ordem : " + a + c + b);
			}
			else if(c<=a && a>=b)
			{
				System.out.println("A ordem : " + c + a + b);
			}
	}

}
