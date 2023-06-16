package br.edu.faeterj;

public class Produto{
	int id;
	String codBarras;
	String sku;
	String nome;
	String descricao;
	String categoria;
	float preco;
	float peso;
	String fabricante;
	
	public Produto(int id, String codBarras, String sku, String nome, String descricao, String categoria, String fabricante, float preco, float peso){
		this.id = id;
		this.codBarras = codBarras;
		this.sku = sku;
		this.nome = nome;
		this.descricao = descricao;
		this.categoria = categoria;
		this.preco = preco;
		this.peso = peso;
		this.fabricante = fabricante;
	}
}
