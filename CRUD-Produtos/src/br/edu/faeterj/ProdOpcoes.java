package br.edu.faeterj;
import java.util.ArrayList;
import java.util.Scanner;

public class ProdOpcoes{
	public static boolean executarOpcao(int k, ArrayList<Produto> produtoLista){
		Scanner sc = new Scanner(System.in);
		int id;
		String codBarras;
		String sku;
		String nome;
		String descricao;
		String categoria;
		int preco;
		float peso;
		String fabricante;
		
		switch(k){
	    case 1:
	    	System.out.println("\n<<<Opcao selecionada: Incluir produto>>>\n");
	    	System.out.println("int identificador: ");
	    	x = sc.nextInt();
	    	
	    	produtoLista.add(new Produto(id, codBarras, sku, nome, descricao, categoria, preco, peso, fabricante));
	    	break;
	    case 2:
	    	System.out.println("\n<<<Opcao selecionada: Alterar produto>>>\n");
	    	
	    	break;
	    case 3:
	    	System.out.println("\n<<<Opcao selecionada: Excluir produto>>>\n");
	    	
	    	break;
	    case 4:
	    	System.out.println("\n<<<Opcao selecionada: Listar todos produtos>>>\n");
	    	
	    	break;
	    case 5:
	    	System.out.println("\n<<<Opcao selecionada: Listar um produto>>>\n");
	    	
	    	break;
	    default:
	    	System.out.println("\n<<<Opcao selecionada: Encerrar>>>\n");
	    	return true;
		}
		return false;
	}
}
