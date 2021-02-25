package Atividadedia1;

import java.util.Scanner;

public class exercicio6 {
	
	public static void main(String[] args) {
		double x1,x2,y1,y2,d;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com um ponto 'x' no plano cartesiano: ");
		x1 = ler.nextFloat();
		System.out.println("Entre com um segundo 'x' no plano cartesiano: ");
		x2 = ler.nextFloat();
		System.out.println("Entre com um ponto 'y' no plano cartesiano: ");
		y1 = ler.nextFloat();
		System.out.println("Entre com um segundo 'y' no plano cartesiano: ");
		y2 = ler.nextFloat();
		
		d = Math.sqrt(Math.pow(x1 + x2, 2) + Math.pow(y1 + y2, 2));
	
			
		System.out.println("A distancia dos pontos é:" + d);
	}




}