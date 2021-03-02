package POO;


public class testeFuncionario {

	public static void main(String[] args) {
		Funcionario func1 = new Funcionario(null, null, null, null, null);
		
		func1.setNomeFuncionario(null);
		func1.setIdFuncionario(null);
		func1.setCpf(null);
		func1.setSetorFuncionario(null);
		func1.setCargo(null);
		
		func1.imprimirInfo();

	}

}
