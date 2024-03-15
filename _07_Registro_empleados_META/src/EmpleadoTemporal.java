public class EmpleadoTemporal extends Empleado{

    //Atributos
    private String fechaFinContrato;

    //Método constructor
    public EmpleadoTemporal(String nombre, int edad, int idEmpleado, double salario, String fechaFinContrato) {
        super(nombre, edad, idEmpleado, salario);
        this.fechaFinContrato = fechaFinContrato;
    }

    //Métodos Getters y Setters
    public String getFechaFinContrato() {
        return fechaFinContrato;
    }

    public void setFechaFinContrato(String fechaFinContrato) {
        this.fechaFinContrato = fechaFinContrato;
    }
}
