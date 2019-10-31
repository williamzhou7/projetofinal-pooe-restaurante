package ServiceInterfaceImpl;

import ServiceInterface.ClienteService;
import com.model.bean.Cliente;
import com.model.daoimpl.ClienteDAOImpl;
import com.rest.daointerface.ClienteDAO;
import java.util.List;

public class ClienteServiceImpl implements ClienteService {
	
	ClienteDAO dao = new ClienteDAOImpl();
	

	@Override
	public void inserir(Cliente cliente) {
		dao.inserir(cliente);

	}

	@Override
	public void update(Cliente cliente) {
       dao.update(cliente);
	}

	@Override
	public void remove(Integer id) {
       dao.remove(id);
	}

	@Override
	public List<Cliente> findALL(Cliente cliente) {
		return dao.findALL(cliente);
	}
        
        @Override
	public List<Cliente> Findmesa(Integer mesa) {
		return dao.Findmesa(mesa);
	}

}
