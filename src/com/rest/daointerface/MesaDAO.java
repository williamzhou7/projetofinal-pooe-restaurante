package com.rest.daointerface;

import com.model.bean.Cliente;
import com.model.bean.Mesa;
import java.util.List;

public interface MesaDAO extends GenericDAO<Mesa, Integer> {

	
	public List<Mesa> listaMesaPaginacao();
	
	
}

