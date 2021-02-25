package Atividadedia1;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int idade,meses,dias,diastotal;
		
		System.out.println("Entre com seu numero de dias vividos : ");
		diastotal = ler.nextInt();
		
				idade = diastotal/365;
				meses = (diastotal%365)/30;
				dias = (diastotal%365)%30;
				
				
				
				System.out.print(idade+ ":idade " + meses+ " :meses " + dias+ " :dias ");
				
				
				


	}

}
