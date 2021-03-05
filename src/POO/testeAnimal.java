package POO;

import java.util.Scanner;

public class testeAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		Cachorro Ktchoro1 = new Cachorro();
		Cavalo Cavalin1 = new Cavalo(null,null);
		Preguiça Caique = new Preguiça(null,null);
		AnimalBase animal = null;
		int x=0;
		
		System.out.println("Entre com o numero do seu animal 1(Cachorro), 2(Cavalo) ou 3(Preguiça)");
		x = ler.nextInt();
		
		switch(x)
		{
			    case 1:
				animal = Ktchoro1;
				System.out.println("qual o nome do seu Dog? ");
				String nome = ler.next();
				System.out.println("qual a idade do Dog? ");
				int Idade = ler.nextInt();
				System.out.println("qual o Barulho do seu dog? ");
				String som = ler.next();
				
				System.out.println("O dog "+nome+" Tem "+Idade+" aninhos "+"e ele faz "+som);
				break;
				
			    case 2:
					animal = Cavalin1;
					System.out.println("qual o nome do seu Cavalo? ");
					String nome1 = ler.next();
					System.out.println("qual a idade do Cavalo? ");
					int Idade1 = ler.nextInt();
					System.out.println("qual o Barulho que ele faz? ");
					String som1 = ler.next();
					
					System.out.println("O Cavalo "+nome1+" Tem "+Idade1+" aninhos "+"e ele faz "+som1);
					break;
					
			    case 3:
					animal = Cavalin1;
					System.out.println("qual o nome da sua Preguiça? ");
					String nome11 = ler.next();
					System.out.println("qual a idade dela? ");
					int Idade11 = ler.nextInt();
					System.out.println("qual o Barulho que ela faz? ");
					String som11 = ler.next();
					
					System.out.println("O Cavalo "+nome11+" Tem "+Idade11+" aninhos "+"e ele faz "+som11);
					break;	
					
				default:
					System.out.println("Opção Invalida");
			
		}

	
	
	
		
		
		

	}

}
