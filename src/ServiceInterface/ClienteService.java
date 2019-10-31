/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceInterface;

import com.model.bean.Cliente;
import java.util.List;

/**
 *
 * @author willi
 */
public interface ClienteService {
    
    public void inserir(Cliente cliente);
    public void update(Cliente cliente);
    public void remove(Integer id);
    public List<Cliente> Findmesa(Integer mesa);
    public List<Cliente> findALL (Cliente cliente);
    
    
}
