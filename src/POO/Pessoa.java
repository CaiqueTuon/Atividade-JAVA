package POO;

import java.util.Scanner;

public class Pessoa {
		
		private String nome;
		private String endere�o;
		private String telefone;
		
		
		public Pessoa(String nome,String endere�o,String telefone)
		{
			
			this.nome = nome;
			this.endere�o = endere�o;
			this.telefone = telefone;
			
		}
		

		public Pessoa(String nome,String endere�o)
		{
			
			this.nome = nome;
			this.endere�o = endere�o;
			
			
		}
		
		public Pessoa(String nome)
		{
			this.nome = nome;
			
			
		}

		Scanner ler = new Scanner(System.in);
				

		public String getNome()
		{
			System.out.println("Entre com o seu nome: ");
			nome = ler.nextLine();
			return nome;
		}



		public void setNome(String nome) {
			this.nome = nome;
		}



		public String getEndere�o() {
			System.out.println("Entre com o endere�o: ");
			endere�o = ler.nextLine();
			return endere�o;
		}



		public void setEndere�o(String endere�o) {
			this.endere�o = endere�o;
		}



		public String getTelefone() {
			System.out.println("Entre com o seu telefone: ");
			telefone = ler.nextLine();
			return telefone;
		}



		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
	
}
