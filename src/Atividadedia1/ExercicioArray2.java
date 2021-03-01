package Atividadedia1;

import java.util.Scanner;

public class ExercicioArray2 {

	public static void main(String[] args) {
		int vetor [] = new int[6],soma = 0,vetorpar,vetorimpar,contimpar=0;
		Scanner ler = new Scanner(System.in);		
		
		for(int x=0;x<6;x++)
		{
			System.out.println("Entre com o seu numero : ");
			vetor[x] = ler.nextInt();
				if(vetor[x]%2 == 0 )
				{	
					vetorpar = vetor[x];
					soma = soma + vetorpar;
					System.out.println("\nNumero Par");

				}
				
				else
				{
					vetorimpar = vetor[x];
					System.out.println("\nNumero Impar");
					contimpar++;
				}
					
				
		}
		
			System.out.println("Quantidade de impar é: "+ contimpar);
			System.out.println("A soma da quantidade de par é: " + soma);
				

	}

}
