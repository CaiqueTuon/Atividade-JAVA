package POO;

public class Empregado extends Pessoa{
	private float salarioBase;
	private int codigoSetor;
	private float imposto;
	
	public Empregado (String nome,String endereço,String telefone,float salarioBase,int codigoSetor,float imposto)
	{
		super (nome,endereço,telefone);
		this.codigoSetor = codigoSetor;
		this.imposto = imposto;
		this.salarioBase = salarioBase;
		
	}

	public float getSalarioBase() {
		System.out.println("Entre com o seu salario base: ");
		salarioBase = ler.nextFloat();
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public int getCodigoSetor() {
		System.out.println("Entre com o codigo do seu setor: ");
		codigoSetor = ler.nextInt();
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public float getImposto() {
		System.out.println("Entre com o Imposto: ");
		imposto = ler.nextFloat();
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}

	public float getcalcularSalario(float calcularSalario) {
		float salario;
		salario = getSalarioBase()*(1-(getImposto()/100));
		return salario;
	}
}
