package POO;

import java.util.Scanner;

public class Funcionario {
	
	Scanner ler = new Scanner(System.in);
	
	private String nomeFuncionario;
	private String idFuncionario;
	private String cpf;
	private String setorFuncionario;
	private String Cargo;
	
	
	public Funcionario(String nomeFuncionario, String idFuncionario, String cpf,String setorFuncionario,String Cargo) {
		
		this.nomeFuncionario = nomeFuncionario;
		this.idFuncionario = idFuncionario;
		this.cpf = cpf;
		this.setorFuncionario = setorFuncionario;
		this.Cargo = Cargo;
		
	}


	public String getNomeFuncionario() {
		System.out.println("Entre com o nome do Funcionario: ");
		nomeFuncionario = ler.nextLine();
		return nomeFuncionario;
	}


	public void setNomeFuncionario(String nomeFuncionario) {
		System.out.println("Entre com o nome do Funcionario: ");
		nomeFuncionario = ler.nextLine();
		this.nomeFuncionario = nomeFuncionario;
	}


	public String getIdFuncionario() {
		System.out.println("Entre com o id do Funcionario: ");
		idFuncionario = ler.nextLine();
		return idFuncionario;
	}


	public void setIdFuncionario(String idFuncionario) {
		System.out.println("Entre com o id do Funcionario: ");
		idFuncionario = ler.nextLine();
		this.idFuncionario = idFuncionario;
	}


	public String getCpf() {
		System.out.println("Entre com o cpf Funcionario: ");
		cpf = ler.nextLine();
		return cpf;
	}


	public void setCpf(String cpf) {
		System.out.println("Entre com o cpf Funcionario: ");
		cpf = ler.nextLine();
		this.cpf = cpf;
	}


	public String getSetorFuncionario() {
		System.out.println("Entre com o setor que o funcionario esta: ");
		setorFuncionario = ler.nextLine();
		return setorFuncionario;
	}


	public void setSetorFuncionario(String setorFuncionario) {
		System.out.println("Entre com o setor que o funcionario esta: ");
		setorFuncionario = ler.nextLine();
		this.setorFuncionario = setorFuncionario;
	}


	public String getCargo() {
		System.out.println("Entre com o cargo dele: ");
		Cargo = ler.nextLine();
		return Cargo;
	}


	public void setCargo( String Cargo) {
		System.out.println("Entre com o cargo dele: ");
		Cargo = ler.nextLine();
		this.Cargo = Cargo;
	}
	
	 public void imprimirInfo() {
		System.out.println("O nome do funcionario é "+ nomeFuncionario+ " o seu ID " + idFuncionario + " seu cpf é " + cpf + " o setor é de " + setorFuncionario + " no cargo dele é "+ Cargo );
		 
	 }

}
