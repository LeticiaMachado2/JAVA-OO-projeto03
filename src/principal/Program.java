
package principal;

import java.util.ArrayList;
import java.util.List;

import entities.Produto;

public class Program {
 
	//add - método para adicionar na lista
	//for - percorrendo a lista
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	List<Produto> lista = new ArrayList<Produto>();
		
		//adicionando objetos na lista
		lista.add(new Produto(1, "Notebook", 4000.0, 10));
		lista.add(new Produto(2, "Monitor", 400.0, 20));
		lista.add(new Produto(3, "Mochila", 200.0, 15));
		
		System.out.println("Quantidade de produtos: " + lista.size());
		
		for (Produto produto : lista) {			
			System.out.println(produto.toString());			
		}
	}

		
	}


