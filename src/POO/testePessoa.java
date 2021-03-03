package POO;

public class testePessoa {

	public static void main(String[] args) {
		Fornecedor fornec1 = new Fornecedor(null, null, null, 0, 0);
		Empregado empregado1 = new Empregado(null, null, null, 0, 0, 0);
		String nome, endereço,telefone;
		float saldoatual,salario;
		int codigo;
		
		nome = fornec1.getNome();
		
		endereço = fornec1.getEndereço();
		telefone = fornec1.getTelefone();
		saldoatual = fornec1.getobterSaldo(0);
		
		System.out.println("O Fornecedor " + nome + " do "+ endereço + " tem o telefone de " + telefone + " possui um saldo de "+ saldoatual);
		System.out.println("--------------------------------------TESTE FORNECEDOR---------------------------------------");

		nome = empregado1.getNome();
		endereço = empregado1.getEndereço();
		telefone = empregado1.getTelefone();
		codigo = empregado1.getCodigoSetor();
		salario = empregado1.getcalcularSalario(0);
		
		System.out.println("O empregado " + nome + " do "+ endereço + " tem o telefone de " + telefone + " do codigo "+ codigo + " possui o salario de "+salario);
		
		
		
		
	}

}
