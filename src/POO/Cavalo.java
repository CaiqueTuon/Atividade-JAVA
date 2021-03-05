package POO;

public class Cavalo extends AnimalBase {
	
		private String Raça;
	
		public Cavalo(String Nome,String Raça)	
		{
			super("Cavalo");
			this.Raça = Raça;
		
		}
		
	@Override
	public void nome(String nomeanimal)
	{
		System.out.println("O nome dele é  " + nomeanimal);
	}
	
	@Override
	public void idade(int idadeanimal)
	{
		System.out.println("A idade dele é  " + idadeanimal);
	}

	@Override
	public void Som(String somanimal)
	{
		System.out.println("O som que ele faz é   " + somanimal);
	}
	
	@Override
	public void Movimento(String movimentoanimal)
	{
		System.out.println("Ele corre   " +  movimentoanimal);
	}


	public String getRaça() {
		return Raça;
	}

	public void setRaça(String raça) {
		Raça = raça;
	}

	
	
}