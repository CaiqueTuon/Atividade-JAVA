package POO;

public class Fornecedor extends Pessoa {
	private float ValorCredito;
	private float ValorDivida;
	
	
	public Fornecedor(String nome,String endereço,String telefone,float ValorCredito,float ValorDivida ) 
	{
		
		super(nome,endereço,telefone);
		this.ValorCredito = ValorCredito;
		this.ValorDivida = ValorDivida;
		
	}


	public float getValorCredito() {
		System.out.println("Entre com o seu credito: ");
		ValorCredito = ler.nextFloat();
		return ValorCredito;
	}


	public void setValorCredito(float valorCredito) {
		ValorCredito = valorCredito;
	}


	public float getValorDivida() {
		System.out.println("Entre com o Valor de sua divida: ");
		ValorDivida = ler.nextFloat();
		return ValorDivida;
	}


	public void setValorDivida(float valorDivida) {
		ValorDivida = valorDivida;
	}
	
	public float getobterSaldo(float obterSaldo) {
		
	
	return this.getValorCredito() - this.getValorDivida();
	
	}
}
