package POO;

import java.util.Scanner;

public class Pessoa {
		
		private String nome;
		private String endereço;
		private String telefone;
		
		
		public Pessoa(String nome,String endereço,String telefone)
		{
			
			this.nome = nome;
			this.endereço = endereço;
			this.telefone = telefone;
			
		}
		

		public Pessoa(String nome,String endereço)
		{
			
			this.nome = nome;
			this.endereço = endereço;
			
			
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



		public String getEndereço() {
			System.out.println("Entre com o endereço: ");
			endereço = ler.nextLine();
			return endereço;
		}



		public void setEndereço(String endereço) {
			this.endereço = endereço;
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
