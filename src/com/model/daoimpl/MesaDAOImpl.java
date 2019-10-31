package com.model.daoimpl;

import com.connection.ConnectionFactory;
import com.model.bean.Cliente;
import com.model.bean.Mesa;
import java.io.Serializable;
import java.util.List;

import com.rest.daointerface.MesaDAO;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;


public class MesaDAOImpl extends GenericDAOImpl<Mesa, Integer> implements MesaDAO, Serializable {


	private static final long serialVersionUID = 5012053774615583956L;

	@Override
        public List<Mesa> listaMesaPaginacao() {
	    System.out.println(" listando entidade com paginacao "); 
		return null;
	}
        
       

}
