package POO;

public class Preguiça extends AnimalBase {
	
		private String Cor;
	
		public Preguiça(String Nome,String Cor)	
		{
			super("Preguiça");
			this.Cor = Cor;
		
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
	

	public void Movimento(String movimentoanimal)
	{
		System.out.println("Ele não corre"  );
	}


	public String getCor() {
		return Cor;
	}

	public void setCor(String Cor) {
		this.Cor = Cor;
	}

	
	
}