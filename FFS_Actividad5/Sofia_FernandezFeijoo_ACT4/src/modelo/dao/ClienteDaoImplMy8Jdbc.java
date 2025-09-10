package modelo.dao;

import modelo.javabean.Cliente;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDaoImplMy8Jdbc extends AbsGenericoDaoImpl implements ClienteDao {

    public ClienteDaoImplMy8Jdbc() {
        super();
    }

    @Override
    public List<Cliente> buscarTodos() {
        sql = "SELECT * FROM clientes";
        List<Cliente> lista = new ArrayList<>();
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setCif(rs.getString("cif"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellidos(rs.getString("apellidos"));
                cliente.setDomicilio(rs.getString("domicilio"));
                cliente.setFacturacionAnual(rs.getDouble("facturacion_anual"));
                cliente.setNumeroEmpleados(rs.getInt("numero_empleados"));
                lista.add(cliente);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    @Override
    public Cliente buscarCliente(String cifCliente) {
        sql = "SELECT * FROM clientes WHERE cif = ?";
        Cliente cliente = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, cifCliente);
            rs = ps.executeQuery();

            if (rs.next()) {
                cliente = new Cliente();
                cliente.setCif(rs.getString("cif"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellidos(rs.getString("apellidos"));
                cliente.setDomicilio(rs.getString("domicilio"));
                cliente.setFacturacionAnual(rs.getDouble("facturacion_anual"));
                cliente.setNumeroEmpleados(rs.getInt("numero_empleados"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cliente;
    }

    @Override
    public int altaCliente(Cliente cliente) {
        sql = "INSERT INTO clientes (cif, nombre, apellidos, domicilio, facturacion_anual, numero_empleados) VALUES (?, ?, ?, ?, ?, ?)";
        filas = 0;
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, cliente.getCif());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getApellidos());
            ps.setString(4, cliente.getDomicilio());
            ps.setDouble(5, cliente.getFacturacionAnual());
            ps.setInt(6, cliente.getNumeroEmpleados());
            filas = ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            filas = 0;
        }
        return filas;
    }

    @Override
    public int eliminarCliente(String cifCliente) {
        sql = "DELETE FROM clientes WHERE cif = ?";
        filas = 0;
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, cifCliente);
            filas = ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            filas = -1;
        }
        return filas;
    }

    @Override
    public String exportar(String nombreFichero) {
        List<Cliente> clientes = buscarTodos();
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
            fw = new FileWriter(nombreFichero);
            bw = new BufferedWriter(fw);
            
            for (Cliente cliente : clientes) {
            	bw.write(cliente.getCif() + ";" +
            	         cliente.getNombre() + ";" +
            	         cliente.getApellidos() + ";" +
            	         cliente.getDomicilio() + ";" +
            	         cliente.getFacturacionAnual() + ";" +
            	         cliente.getNumeroEmpleados());

                bw.newLine();
            }
            return "Clientes bien exportados";
        } catch (IOException e) {
            e.printStackTrace();
            return "Error al exportar el fichero";
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    @Override
    public List<Cliente> importar(String nombreFichero) {
        List<Cliente> clientes = new ArrayList<>();
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(nombreFichero);
            br = new BufferedReader(fr);
            
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");
                if (datos.length == 6) {
                    try {
                        Cliente cliente = new Cliente();
                        cliente.setCif(datos[0]);
                        cliente.setNombre(datos[1]);
                        cliente.setApellidos(datos[2]);
                        cliente.setDomicilio(datos[3]);
                        cliente.setFacturacionAnual(Double.parseDouble(datos[4]));
                        cliente.setNumeroEmpleados(Integer.parseInt(datos[5]));
                        clientes.add(cliente);
                    } catch (NumberFormatException e) {
                        System.err.println("Error de formato numérico en línea: " + linea);
                    }
                } else {
                    System.err.println("Línea mal formada (esperados 6 campos): " + linea);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
                if (fr != null) fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return clientes;
    }

}
