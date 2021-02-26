package Atividadedia1;

import java.util.Scanner;

public class exerciciorepeticao3 {
		public static void main(String[] args) {
		int idade,contador21= 0,contador50 = 0;
			
		Scanner ler = new Scanner(System.in);
			
		System.out.println("Entre com sua idade: ");
		idade = ler.nextInt();
		
		while(idade != -99)
		{
			
			if(idade<21)
			{
			contador21++;
		
			}
			
			if(idade>21 && idade<50)
			{
			contador50++;
		
			}
			
			
			System.out.println("Entre com sua idade: ");
			idade = ler.nextInt();	
		
		}
		System.out.println("Pessoas com até 21 anos é de: "+ contador21);
		System.out.println("Pessoas com até 50 anos é de: "+ contador50);
		
		}

}
