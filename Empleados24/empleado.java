package Empleados24;

public class empleado implements EmpleadoTDA{

    public class Nodo{
        Nodo sig;
        Empleados info;
    }

    

    private Nodo origen;

    public void InicializarEmpleado(){
        origen = null;
    }

    public void Agregar(int x, String y, double z){
        Nodo nuevo = new Nodo();
        Empleados emple = new Empleados();
        emple.legajo = x;
        emple.nombre = y;
        emple.Sueldo = z;
        nuevo.info = emple;
        nuevo.sig = origen;
        origen = nuevo;
    }

    public int getLegajo(){
        Nodo aux = origen;
        int res = aux.info.legajo;
        return res;
    }

    public String getNombre(){
        Nodo aux = origen;
        return aux.info.nombre;
    }

    public double getSueldoAcobrar(){
        Nodo aux = origen;
        return aux.info.Sueldo;
    }

    public String toString(){
        Nodo aux = origen;
        String texto = "";
        texto = aux.info.legajo + ";" + aux.info.nombre + ";" + aux.info.Sueldo;
        return texto; 
    }
}
