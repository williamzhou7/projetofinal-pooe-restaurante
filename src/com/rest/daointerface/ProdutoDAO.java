package com.rest.daointerface;

import com.model.bean.Produto;
import java.util.List;

public interface ProdutoDAO extends GenericDAO<Produto, Integer> {

	
	public List<Produto> listaProdutoPaginacao();
	
	
}
