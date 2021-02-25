package Atividadedia1;

import java.util.Scanner;

public class exerciciolaço4 {

	public static void main(String[] args) {
		int numero;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Entre com um numero :");
		numero = ler.nextInt();
		
		if(numero%2 == 0)
		{
			numero = (int) Math.sqrt(numero);
			
			System.out.println("O numero é par e sua raiz é : "+ numero);
			
		}
		
		else
		{
			numero = (int) Math.pow(numero,2);
			
			System.out.println("O numero é impar e sua potencia quadrada é :"+ numero);
		}

}
	
}
