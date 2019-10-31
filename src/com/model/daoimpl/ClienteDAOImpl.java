package com.model.daoimpl;

import com.connection.ConnectionFactory;
import com.model.bean.Cliente;
import java.io.Serializable;
import java.util.List;

import com.rest.daointerface.ClienteDAO;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;


public class ClienteDAOImpl extends GenericDAOImpl<Cliente, Integer> implements ClienteDAO, Serializable {


	private static final long serialVersionUID = 5012053774615583956L;

	
	@Override
	public List<Cliente> listaClientePaginacao() {
	    System.out.println(" listando entidade com paginacao "); 
		return null;
	}
        
         public List<Cliente> Findmesa(int mesa) {
        EntityManager em = new ConnectionFactory().getConnection();
        List<Cliente> time = null;
       
        try {
            time = em.createQuery("from Cliente c where mesa_id_mesa =  "+ mesa).getResultList();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar" + e);
        } finally {
            em.close();
        }

        return time;
    }

}
