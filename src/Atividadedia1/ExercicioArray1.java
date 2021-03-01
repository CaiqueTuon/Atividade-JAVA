package Atividadedia1;

import java.util.Scanner;

public class ExercicioArray1 {

		public static void main(String[] args) {
			int vetor [] = new int[6],soma = 0;
			Scanner ler = new Scanner(System.in);
			for(int x=0;x<6;x++)
			{
				System.out.println("Entre com o seu numero : ");
				vetor[x] = ler.nextInt();
				soma = vetor[0] + vetor[1] + vetor[5];
				vetor[4] = 100;
				
			}
			for(int x=0;x<20;x++)
			{
				System.out.println("\n");
			}
			
			for(int x=0;x<6;x++)
			{
				System.out.println(vetor[x]);
			}
			
			
			
			System.out.println("A soma da posição 0,1 e 5 é de : "+ soma);
			
			
			
			
		}

	}
