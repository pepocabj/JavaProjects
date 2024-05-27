package Libres;


public class TelecheaSantino implements contactoTDA {
    public class Nodo{
        contactos info;
        Nodo sig;
    }

    private Nodo origen;

    public void InicializarContactos(){
        origen = null;
    }

    public void AgregarContacto(String nom1,int dni1,int edad1){
        Nodo nuevo = new Nodo();
        contactos cont1 = new contactos();
        cont1.nombre = nom1;
        cont1.dni = dni1;
        cont1.edad = edad1;
        nuevo.info = cont1;
        nuevo.sig = origen;
        origen = nuevo;
    }
    
    public contactos[] BuscarEdad(int x){
        Nodo aux = origen;
        contactos[] lst = new contactos[50];
        int cont = 0;
        while (aux != null) {
            if(aux.info.edad == x){
                lst[cont] = aux.info;
                cont++;
            }
            aux = aux.sig;
        }
        return lst;
    }

    public void EliminarContacto(int x){
        Nodo aux = origen; // Inicializar con el primer nodo de la lista
        if(aux != null){
            if(aux.info.dni == x){
                origen = aux.sig;
            }
            else{
                while (aux.sig != null && aux.sig.info.dni != x ) {
                    aux = aux.sig;
                }
            }if(aux.sig != null){
                aux.sig = aux.sig.sig;
            }
            }
    }

    public contactos BuscarDni(int x){
        Nodo aux = origen;
        while (aux != null && aux.info.dni != x){
            aux = aux.sig;
        }
        return aux.info;
    }
    
    public contactos[] BuscarDnis(int x){
        Nodo aux = origen;
        contactos[] lst = new contactos[50];
        int cont = 0;
        while (aux != null) {
            if(aux.info.edad == x){
                lst[cont] = aux.info;
                cont++;
            }
            aux = aux.sig;
        }
        return lst;
    }

    public contactos[] MayoresDeEdad(){
        Nodo aux = origen;
        contactos[] lst = new contactos[50];
        int cont = 0;
        while (aux != null){
            if(EsMayorDeEdad(aux.info.edad)){
                lst[cont] = aux.info;
                cont++;
            }
            aux = aux.sig;
        }
        return lst;
    }

    
    public boolean EsMayorDeEdad(int x){
        contactos aux = BuscarDni(x);
        if (aux != null) {
            return aux.edad >= 18;
        }else{
            return false;
        }
    }

}
