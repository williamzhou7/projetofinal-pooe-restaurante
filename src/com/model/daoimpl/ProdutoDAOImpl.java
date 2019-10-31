package com.model.daoimpl;

import com.model.bean.Produto;
import java.io.Serializable;
import java.util.List;

import com.rest.daointerface.ProdutoDAO;


public class ProdutoDAOImpl extends GenericDAOImpl<Produto, Integer> implements ProdutoDAO, Serializable {


	private static final long serialVersionUID = 5012053774615583956L;

	@Override
        public List<Produto> listaProdutoPaginacao() {
	    System.out.println(" listando entidade com paginacao "); 
		return null;
	}

}
