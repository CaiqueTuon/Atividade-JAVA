package Atividadedia1;

import java.util.Scanner;

public class ExercicioMatriz1 {

	public static void main(String[] args) {
		float matriz [][] = new float[3][3],contmatriz=0;
		Scanner ler = new Scanner(System.in);	
		
			for(int l=0;l<3;l++)
			{
				for(int c=0;c<3;c++)
				{
					System.out.printf("Entre com um numero: ");
					matriz[l][c] = ler.nextFloat();
					
					if(matriz[l][c]>10)
					{
						contmatriz++;
						
					}
				}
				
			}
			
			System.out.println("O numero de valores acima de 10 é :" + contmatriz);
	}

}
