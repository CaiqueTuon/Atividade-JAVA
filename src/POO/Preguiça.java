package POO;

public class Pregui�a extends AnimalBase {
	
		private String Cor;
	
		public Pregui�a(String Nome,String Cor)	
		{
			super("Pregui�a");
			this.Cor = Cor;
		
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
	

	public void Movimento(String movimentoanimal)
	{
		System.out.println("Ele n�o corre"  );
	}


	public String getCor() {
		return Cor;
	}

	public void setCor(String Cor) {
		this.Cor = Cor;
	}

	
	
}