package Atividadedia1;

import java.util.Scanner;

public class ExercicioMatriz2 {

	public static void main(String[] args) {
		float matriz1 [][] = new float[2][2],matriz2 [][] = new float[2][2],op�ao=0, matriz3 [][] = new float[2][2];
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
		
				System.out.printf("Escolha uma op��o entre um 1,2,3 ou 4 ");
				op�ao = ler.nextInt();
				}
			
			
			while(op�ao<1 || op�ao>4);
			{
			
			if(op�ao == 1) {
			
			
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
			
			if(op�ao == 2) {
				
			
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
			
			if(op�ao == 3) {
				
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
			if(op�ao == 4) {

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

