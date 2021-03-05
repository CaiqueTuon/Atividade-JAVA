package POO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Colecoes {

	public static void main(String[] args) {
		
		List <Integer> lista = new ArrayList<Integer>();
		
		lista.add(2);
		lista.add(1);
		lista.add(3);
		lista.add(2);
		lista.add(1);
		
		System.out.println("-------------------------------------------------");
		System.out.println("Entrando com a lista original");
		
		for(Integer ListaElementos:lista) {
			
			System.out.println(ListaElementos);
		}
		System.out.println("-------------------------------------------------");
		System.out.println("Removendo um elemento da lista");
		
		lista.remove(0);
		System.out.println("-------------------------------------------------");
		for(Integer listaElementos:lista) {
			System.out.println(listaElementos);
		}
		
		int primeiroElemento = lista.get(0);
		System.out.println("-------------------------------------------------");
		System.out.println("O primeiro elemento da lista é "+ primeiroElemento);
	
	
		for(int i=0;i<lista.size();i++) 
		{
		
		System.out.println("Elemento: "+lista.get(i));
		
		}
		
		Collections.sort(lista);
		System.out.println("+++Depois de ordenado+++");
		System.out.println(lista);
		
		Set <Integer> meuSet = new HashSet<Integer>();
		
		meuSet.add(2);
		meuSet.add(3);
		meuSet.add(1);
		meuSet.add(2);
		
		Iterator<Integer> iMeuSet = meuSet.iterator();
		
		while(iMeuSet.hasNext())
		{
			System.out.println(iMeuSet.next());
		}
		
}		

}