package Atividadedia1;

import java.util.Scanner;

public class exerciciorepeticao4 {

	public static void main(String[] args) {
		int idade,sexo,oppsco,pessoascalmas = 0,mulheresnervosas=0,homensagressivos=0,Qnervosas=0,Dcalma=0,ii=0;
				
		Scanner ler = new Scanner(System.in);
			

		while(ii < 150)
		{
			System.out.println("Entre com sua idade: ");
			idade = ler.nextInt();
			System.out.println("Entre com seu sexo: ");
			sexo = ler.nextInt();
			System.out.println("Entre com sua opção mental: ");
			oppsco = ler.nextInt();

			
			if(oppsco == 1 )
			{
				pessoascalmas++;
			}
			if(sexo == 1 && oppsco == 2)
			{
				mulheresnervosas++;
			}
			
			if(sexo == 2 && oppsco == 3)
			{
				homensagressivos++;
			}
			if(idade >40 && oppsco == 2)
			{
				Qnervosas++;
			}
			if(idade <18 && oppsco == 1)
			{
				Dcalma++;
			}

			
			
			
			ii++;
				
		
		}
			System.out.println("pessoas calma são: " + pessoascalmas);
			System.out.println("Mulheres nervosas são: " + mulheresnervosas);
			System.out.println("O numero de homens são: " + homensagressivos++);
			System.out.println("O numero de pessoas nervosas com mais de 40 são: " + Qnervosas);
			System.out.println("O numero de pessoas com menos de: " + Dcalma);
	}

}
