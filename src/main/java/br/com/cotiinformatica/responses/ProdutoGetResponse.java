 package br.com.cotiinformatica.responses;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class ProdutoGetResponse {

	private Integer idProduto;
	private String nome;
	private String descricao;
	private Double preco;
	private Integer quantidade;
	private Double total;	
}


