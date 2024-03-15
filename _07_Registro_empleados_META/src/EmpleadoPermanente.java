public class EmpleadoPermanente extends Empleado{

    //Atributos
    private int añosAntiguedad;

    //Método constructor
    public EmpleadoPermanente(String nombre, int edad, int idEmpleado, double salario, int añosAntiguedad) {
        super(nombre, edad, idEmpleado, salario);
        this.añosAntiguedad = añosAntiguedad;
    }

    //Métodos Getters y Setters
    public int getAñosAntiguedad() {
        return añosAntiguedad;
    }

    public void setAñosAntiguedad(int añosAntiguedad) {
        this.añosAntiguedad = añosAntiguedad;
    }
}
