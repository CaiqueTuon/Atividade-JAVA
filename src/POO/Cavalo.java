package POO;

public class Cavalo extends AnimalBase {
	
		private String Ra�a;
	
		public Cavalo(String Nome,String Ra�a)	
		{
			super("Cavalo");
			this.Ra�a = Ra�a;
		
		}
		
	@Override
	public void nome(String nomeanimal)
	{
		System.out.println("O nome dele �  " + nomeanimal);
	}
	
	@Override
	public void idade(int idadeanimal)
	{
		System.out.println("A idade dele �  " + idadeanimal);
	}

	@Override
	public void Som(String somanimal)
	{
		System.out.println("O som que ele faz �   " + somanimal);
	}
	
	@Override
	public void Movimento(String movimentoanimal)
	{
		System.out.println("Ele corre   " +  movimentoanimal);
	}


	public String getRa�a() {
		return Ra�a;
	}

	public void setRa�a(String ra�a) {
		Ra�a = ra�a;
	}

	
	
}