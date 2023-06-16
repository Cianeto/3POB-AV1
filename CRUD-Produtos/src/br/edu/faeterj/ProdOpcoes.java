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
		String fabricante;
		float preco;
		float peso;
		
		switch(k){
	    case 1:
	    	System.out.println("\n<<<Opcao selecionada: Incluir produto>>>\n");
	    	
	    	System.out.println("\nint identificador: ");
	    	id = sc.nextInt();
	    	System.out.println("\nString codBarras: ");
	    	codBarras = sc.nextLine();
	    	System.out.println("\nString sku: ");
	    	sku = sc.nextLine();
	    	System.out.println("\nString nome: ");
	    	nome = sc.nextLine();
	    	System.out.println("\nString descricao: ");
	    	descricao = sc.nextLine();
	    	System.out.println("\nString categoria: ");
	    	categoria = sc.nextLine();
	    	System.out.println("\nString fabricante: ");
	    	fabricante = sc.nextLine();
	    	System.out.println("\nint preco: ");
	    	preco = sc.nextFloat();
	    	System.out.println("\nint peso: ");
	    	peso = sc.nextFloat();
	    	
	    	produtoLista.add(new Produto(id, codBarras, sku, nome, descricao, categoria, fabricante, preco, peso));
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
	    	sc.close();
	    	return true;
		}
		sc.close();
		return false;
	}
}
