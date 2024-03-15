public class Main {
    public static void main(String[] args) {

    GestionEmpleados gestionEmpleados = new GestionEmpleados();

    Empleado empleado1 = new EmpleadoPermanente("Dania Ortega", 33, 1, 5000000, 4);
    Empleado empleado2 = new EmpleadoTemporal("Margarita Muñoz", 53, 2, 3000000, "15/03/2024");

    gestionEmpleados.agregarEmpleado(empleado1);
    gestionEmpleados.agregarEmpleado(empleado2);

    gestionEmpleados.mostrarEmpleados();

    gestionEmpleados.eliminarEmpleado(2);

    System.out.println("\nDespués de eliminar");
    gestionEmpleados.mostrarEmpleados();
    }
}