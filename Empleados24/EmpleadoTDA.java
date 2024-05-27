package Empleados24;

public interface EmpleadoTDA {
    void InicializarEmpleado();
    void Agregar(int legajo, String nombre, double sueldo);
    int getLegajo();
    String getNombre();
    double getSueldoAcobrar();
    String toString();
}
