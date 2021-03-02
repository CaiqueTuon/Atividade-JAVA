package POO;

public class Cliente {
		// declaração de atributos de classe
	
	  private String nomeCliente;
	  private int idadeCliente;
	  private float alturaCliente;
	  private String profissaoCliente;
	  
	  
	  
	  public Cliente(String nomeCliente,int idadeCliente,float alturaCliente,String profissaoCliente) {
		  
		  this.nomeCliente = nomeCliente;
		  this.idadeCliente = idadeCliente;
		  this.alturaCliente = alturaCliente;
		  this.profissaoCliente = profissaoCliente;
		  
		  
	  }
	  
	  
	  public void imprimirInfo()
	  {
		  
		  System.out.println(nomeCliente + " tem a idade de "+idadeCliente + ",e mede "+ alturaCliente+" metros de altura e sua profissão é de "+ profissaoCliente);
		  
	  }


	public String getNomeCliente() {
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	public int getIdadeCliente() {
		return idadeCliente;
	}


	public void setIdadeCliente(int idadeCliente) {
		this.idadeCliente = idadeCliente;
	}


	public float getAlturaCliente() {
		return alturaCliente;
	}


	public void setAlturaCliente(float alturaCliente) {
		this.alturaCliente = alturaCliente;
	}


	public String getProfissaoCliente() {
		return profissaoCliente;
	}


	public void setProfissaoCliente(String profissaoCliente) {
		this.profissaoCliente = profissaoCliente;
	}
	  
	  
	  
	  
	  
	  
	  
}
