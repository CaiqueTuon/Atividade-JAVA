package POO;

public abstract class AnimalBase {
	
	private String TipoAnimal;

	public AnimalBase(String TipoAnimal)
	{
		this.TipoAnimal = TipoAnimal;
	}
		
		
	abstract public void nome(String nomeanimal);
	abstract public void idade(int idadeanimal);
	abstract public void Som(String somaanimal);
	abstract public void Movimento(String movimentoanimal);


	public String getTipoAnimal() {
		return TipoAnimal;
	}


	public void setTipoAnimal(String tipoAnimal) {
		TipoAnimal = tipoAnimal;
	}


	
		// TODO Auto-generated method stub
		
	}
		
		
	

