package br.edu.faeterj;
import java.util.Scanner;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Produto> produtoLista = new ArrayList<>();
        
		boolean encerrar = false;
		
		while(!encerrar){
			System.out.println("Escolha uma opcao:\n1 = Incluir produto;\n2 = Alterar produto;\n3 = Excluir produto;\n4 = Listar todos produtos;\n5 = Listar um produto;\nQualquer outro valor = Encerrar;");
			int opcao = sc.nextInt();
			encerrar = ProdOpcoes.executarOpcao(opcao, produtoLista);
		}
		sc.close();
	}
}
