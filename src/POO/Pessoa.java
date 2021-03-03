package POO;

import java.util.Scanner;

public class Pessoa {
		
		private String nome;
		private String enderešo;
		private String telefone;
		
		
		public Pessoa(String nome,String enderešo,String telefone)
		{
			
			this.nome = nome;
			this.enderešo = enderešo;
			this.telefone = telefone;
			
		}
		

		public Pessoa(String nome,String enderešo)
		{
			
			this.nome = nome;
			this.enderešo = enderešo;
			
			
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



		public String getEnderešo() {
			System.out.println("Entre com o enderešo: ");
			enderešo = ler.nextLine();
			return enderešo;
		}



		public void setEnderešo(String enderešo) {
			this.enderešo = enderešo;
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
