package modelo.dao;

import java.util.List;
import modelo.javabean.Cliente;

public interface ClienteDao {
    int altaCliente(Cliente cliente);
    Cliente buscarCliente(String cifCliente);  
    List<Cliente> buscarTodos();
    int eliminarCliente(String cifCliente);  
    String exportar(String nombreFichero);
    List<Cliente> importar(String nombreFichero);
}
