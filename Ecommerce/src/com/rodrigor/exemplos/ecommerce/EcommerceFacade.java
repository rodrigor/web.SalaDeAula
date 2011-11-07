package com.rodrigor.exemplos.ecommerce;

import java.util.LinkedList;
import java.util.List;

public class EcommerceFacade {
	
	private List<Produto> produtos;
	
	public EcommerceFacade(){
		produtos = new LinkedList<Produto>();
		
		produtos.add(new Produto("1239i33u","Monitor Samsung",1000.0));
		produtos.add(new Produto("1w39i33u","Mouse Microsoft",80.0));
		produtos.add(new Produto("ad39i33u","Processador Intel XYZ",400.0));
		produtos.add(new Produto("asdai33u","Placa m‹e AMD",300.0));
		produtos.add(new Produto("1239iasd","Mem—ria RAM 8GB",100.0));

		
	}
	
	public List listarProdutos(){
		return produtos;
	}

}
