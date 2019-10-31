/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceInterface;

import com.model.bean.Produto;
import java.util.List;

/**
 *
 * @author willi
 */
public interface ProdutoService {
    
    public void save(Produto produto);
    public void update(Produto produto);
    public void remove(Class<Produto> clazz, Integer id);
    public List<Produto> FindAllproduto();
    public List<Produto> Findmesa(Integer mesa);
    
}
