package Atividadedia1;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		int segundostotais,hora,minutos,segundos;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o total de Segundos: ");
		segundostotais = ler.nextInt();
		
		hora = segundostotais/3600;
		minutos = (segundostotais - (hora*3600))/60;
		segundos =  segundostotais - (hora*3600) - (minutos*60);
		
		System.out.printf(" Hora:"+ hora +" Minutos:" + minutos  + " Segundos:" + segundos);
		

	}

}
