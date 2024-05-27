package Empleados24;

public class Elresto implements ElrestoTDA{
    public class NodoClave{
        int clave;
        Empleados valor;
        NodoClave sigClave;
    }

    private NodoClave origen;

    public void InicializarDic(){
        origen = null;
    }

    private NodoClave Clave2NodoClave(int clave){
        NodoClave aux = origen;
        while (aux != null && aux.clave != clave) {
            aux = aux.sigClave;
        }
        return aux;
    }

    public void Agregar2(Empleados empl1){
        int clave = empl1.legajo;
        NodoClave nc = Clave2NodoClave(clave);
        if (nc == null) {
            nc = new NodoClave();
            nc.clave = clave;
            nc.sigClave = origen;
            origen = nc;
        }
        nc.valor = empl1;
    }

    public void Quitarempleado(int legajo){
        if (origen != null) {
            if (origen.clave == legajo) {
                origen = origen.sigClave;
            }else{
                NodoClave aux = origen;
                while (aux.sigClave != null && aux.sigClave.clave != legajo) {
                    aux = aux.sigClave;
                }
                if (aux.sigClave != null) {
                    aux.sigClave = aux.sigClave.sigClave;
                }
            }
        }
    }

    public String MostrarSueldo(int legajo){
        String texto = "";
        NodoClave aux = origen;
        while (aux != null) {
            if (aux.clave == legajo) {
                texto = "El sueldo a cobrar es  " + aux.valor.Sueldo + " El nombre es: " + aux.valor.nombre;
            }
            aux = aux.sigClave;
        }
        return texto;
    }

    public void listarEmpleados(){
        NodoClave aux = origen;
        while (aux.sigClave != null) {
            System.out.println("El legajo es: ");
            System.out.println(aux.clave);
            System.out.println("El nombre es:");
            System.out.println(aux.valor.nombre);
            System.out.println("El sueldo a cobrar es:");
            System.out.println(aux.valor.Sueldo);
            aux = aux.sigClave;
        }
    }
    
}
