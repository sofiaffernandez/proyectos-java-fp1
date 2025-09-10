package testing;

import java.util.List;
import java.util.Scanner;
import modelo.dao.ClienteDao;
import modelo.dao.ClienteDaoImplMy8Jdbc;
import modelo.javabean.Cliente;

public class GestionClientes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClienteDao clienteDao = new ClienteDaoImplMy8Jdbc();
        int opcion;

        do {
            System.out.println("\n GESTIÓN DE CLIENTES ");
            System.out.println("1. Alta del Cliente");
            System.out.println("2. Buscar un Cliente");
            System.out.println("3. Mostrar Todos");
            System.out.println("4. Eliminar un Cliente");
            System.out.println("5. Exportar a fichero");
            System.out.println("6. Importar desde fichero");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    System.out.print("CIF Cliente: ");
                    String cif = sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Apellidos: ");
                    String apellidos = sc.nextLine();
                    System.out.print("Domicilio: ");
                    String domicilio = sc.nextLine();
                    System.out.print("Facturación Anual: ");
                    double facturacionAnual = Double.parseDouble(sc.nextLine());
                    System.out.print("Número de Empleados: ");
                    int numeroEmpleados = Integer.parseInt(sc.nextLine());

                    Cliente nuevoCliente = new Cliente(cif, nombre, apellidos, domicilio, facturacionAnual, numeroEmpleados);
                    int resAlta = clienteDao.altaCliente(nuevoCliente);

                    if (resAlta == 1) {
                        System.out.println("Cliente dado de alta correctamente.");
                    } else {
                        System.out.println("Ya existe un cliente con ese CIF o no se pudo dar de alta.");
                    }
                    break;

                case 2:
                    System.out.print("CIF del cliente a buscar: ");
                    String cifBuscar = sc.nextLine();
                    Cliente buscado = clienteDao.buscarCliente(cifBuscar);
                    if (buscado != null) {
                        System.out.println(buscado);
                    } else {
                        System.out.println("Cliente no encontrado.");
                    }
                    break;

                case 3:
                    List<Cliente> todos = clienteDao.buscarTodos();
                    if (!todos.isEmpty()) {
                        for (Cliente c : todos) {
                            System.out.println(c);
                        }
                    } else {
                        System.out.println("No hay clientes registrados.");
                    }
                    break;

                case 4:
                    System.out.print("CIF del Cliente a eliminar: ");
                    String cifEliminar = sc.nextLine();
                    int resEliminar = clienteDao.eliminarCliente(cifEliminar);
                    if (resEliminar == 1) {
                        System.out.println("Cliente eliminado correctamente.");
                    } else {
                        System.out.println("No se encontró cliente con ese CIF.");
                    }
                    break;

                case 5:
                    System.out.print("Nombre del fichero para exportar: ");
                    String ficheroExp = sc.nextLine();
                    String mensajeExp = clienteDao.exportar(ficheroExp);
                    if (mensajeExp.equalsIgnoreCase("Clientes bien exportados")) {
                        System.out.println("Fichero exportado correctamente.");
                    } else {
                        System.out.println("Error al exportar: " + mensajeExp);
                    }
                    break;

                case 6:
                    System.out.print("Nombre del fichero para importar: ");
                    String ficheroImp = sc.nextLine();
                    List<Cliente> importados = clienteDao.importar(ficheroImp);
                    if (!importados.isEmpty()) {
                        for (Cliente c : importados) {
                            System.out.println(c);
                        }
                    } else {
                        System.out.println("No se encontraron clientes en el fichero o no se pudo importar.");
                    }
                    break;

                case 7:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 7);

        sc.close();
    }
}
