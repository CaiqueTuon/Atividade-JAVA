package Atividadedia1;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		float custofab;
		double imposto,distribuidor,custofinal;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o custo de Fabrica");
		custofab = ler.nextFloat();
		
		imposto = custofab * 0.28;
		distribuidor = custofab * 0.45;
		
		custofinal = imposto + distribuidor + custofab;
		
		System.out.println("O custo final vai ser de :" + custofinal);
	}

}
