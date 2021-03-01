package Atividadedia1;

import java.util.Scanner;

public class ExercicioMatriz2 {

	public static void main(String[] args) {
		float matriz1 [][] = new float[2][2],matriz2 [][] = new float[2][2],opçao=0, matriz3 [][] = new float[2][2];
		int constante;
		Scanner ler = new Scanner(System.in);
		
		for(int l=0;l<2;l++)
		{
			for(int c=0;c<2;c++)
			{
				System.out.printf("Entre com um numero: ");
				matriz1[l][c] = ler.nextFloat();
				
				
			}
			
		}
		for(int l=0;l<2;l++)
		{
			for(int c=0;c<2;c++)
			{
				System.out.printf("Entre com um numero: ");
				matriz2[l][c] = ler.nextFloat();
				
			}
			
		}
				
			do	{
		
				System.out.printf("Escolha uma opção entre um 1,2,3 ou 4 ");
				opçao = ler.nextInt();
				}
			
			
			while(opçao<1 || opçao>4);
			{
			
			if(opçao == 1) {
			
			
			for(int l=0;l<2;l++)
			{
				for(int c=0;c<2;c++)
				{
					matriz3[l][c] = matriz1[l][c] + matriz2[l][c];
					System.out.print( matriz3[l][c] + " ");
				}
				    System.out.println();
					
			}
							}
			
			if(opçao == 2) {
				
			
			for(int l=0;l<2;l++)
			{
				for(int c=0;c<2;c++)
				{
					matriz3[l][c] = matriz1[l][c] - matriz2[l][c];
					System.out.print( matriz3[l][c] + " ");
				}
					System.out.println();
			}
			
			}
			
			if(opçao == 3) {
				
			System.out.println("entre com uma constante: ");
			constante = ler.nextInt();
			
			for(int l=0;l<2;l++)
			{
				for(int c=0;c<2;c++)
				{
						matriz2[l][c] = matriz2[l][c] + constante;
						System.out.print( matriz2[l][c] + " ");
					}
					    System.out.println();
			}
					    
				 for(int l=0;l<2;l++)
						{
							for(int c=0;c<2;c++)
							{
									matriz1[l][c] = matriz2[l][c] + constante;
									System.out.print( matriz2[l][c] + " ");
								}
								    System.out.println();		    
						}
			if(opçao == 4) {

				for(int l=0;l<2;l++)
				{
					for(int c=0;c<2;c++)
					{
							System.out.print( matriz2[l][c] + " ");
						}
						    System.out.println();
				}
						    
					 for(int l=0;l<2;l++)
							{
								for(int c=0;c<2;c++)
								{
										System.out.print( matriz2[l][c] + " ");
									}
									    System.out.println();		    
							}
			}
	
}
}
}
}	

