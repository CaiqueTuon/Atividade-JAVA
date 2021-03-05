package POO;

import java.util.ArrayList;
import java.util.Scanner;

public class Colecoes2 {
	public static void main(String[] args)
	{
		int op;
		Scanner ler = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		
		do 
		{
			System.out.println("Digite uma Opção: ");
			System.out.println("--------------------------------");
			System.out.println(" (1) Deseja adicionar produtos ao estoque\n (2) Deseja remover\n (3) Atualizar produto\n (4) Mostrar todos os produtos\n (0) Encerre o programa   ");
			op = ler.nextInt();
			
			switch(op)
			{
			case 1:
				ler.nextLine();
				System.out.println("Digite o produto para adicionar ao estoque: ");
				String produto = ler.nextLine();
				estoque.add(produto);
				break;
				
			case 2:
				ler.nextLine();
				System.out.println("Qual produto quer remover?");
				String produtoR = ler.nextLine();
				if(estoque.contains(produtoR)) {
				estoque.remove(produtoR);
				}
				else 
					System.out.println("produto não encontrador");
				break;
			case 3:
				ler.nextLine();
				System.out.println("Qual produto quer atualizar?");
				String verifica = ler.nextLine();
				System.out.println("Digite o nome que entrara no lugar de " + verifica);
				String novo = ler.nextLine();
				if(estoque.contains(verifica)) {
					estoque.remove(verifica);
					estoque.add(novo);		
				}
				else {
					System.out.println("produto não encontrado");
				}
				break;
				
				case 4:
					System.out.println("\nOs produtos do estoque: ");
					System.out.println(estoque);
					break;
					default:
						System.out.println("Finalizou o programa");

			}
			
		}while(op!=0);
		
	}
}
