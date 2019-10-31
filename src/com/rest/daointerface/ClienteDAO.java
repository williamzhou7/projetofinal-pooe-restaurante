package com.rest.daointerface;

import com.model.bean.Cliente;
import java.util.List;

public interface ClienteDAO extends GenericDAO<Cliente, Integer> {

	
	public List<Cliente> listaClientePaginacao();

    public List<Cliente> Findmesa(int i);
	
	
}
