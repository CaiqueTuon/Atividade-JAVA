package Atividadedia1;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		int a,b,c,d,e,f;
		float x,y;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com um coeficiente: ");
		a = ler.nextInt();
		System.out.println("Entre com um coeficiente: ");
		b = ler.nextInt();
		System.out.println("Entre com um coeficiente: ");
		c = ler.nextInt();
		System.out.println("Entre com um coeficiente: ");
		d = ler.nextInt();
		System.out.println("Entre com um coeficiente: ");
		e = ler.nextInt();
		System.out.println("Entre com um coeficiente: ");
		f = ler.nextInt();
		
		x = (c*e)-(b*f)/(a*e)-(b*d);
		y = (a*f)-(c*d)/(a*e)-(b*d);
		
		
		System.out.printf("O valor de x é "+x);
		System.out.printf("O valor de y é "+y);

	}

}
