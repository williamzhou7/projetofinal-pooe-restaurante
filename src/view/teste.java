/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.model.bean.Cliente;
import com.model.daoimpl.ClienteDAOImpl;
import com.rest.daointerface.ClienteDAO;

/**
 *
 * @author willi
 */
public class teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Cliente c = new Cliente();
    
    
    c.setNome_cliente("teste");
    
    ClienteDAO cdao = new ClienteDAOImpl();
    
    cdao.inserir(c);
    
    }
    
}
