import java.util.ArrayList;

public class GestionEmpleados {

    //Atributos
    private ArrayList<Empleado> empleados;

    public GestionEmpleados() {
        empleados = new ArrayList<>();
    }

    //Agregar
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    //Eliminar
    public boolean eliminarEmpleado(int idEmpleado) {
        return empleados.removeIf(emp -> emp.getIdEmpleado() == idEmpleado);
    }

    //Mostrar
    public void mostrarEmpleados() {
        for (Empleado emp : empleados) {
            System.out.println("ID Empleado: " + emp.getIdEmpleado() +
                    ", Nombre: " + emp.getNombre() + ", Salario: "
                    + emp.getSalario());
        }
    }
}


