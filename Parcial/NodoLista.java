package Parcial;
public class NodoLista implements NodoTDA{
    public class NodoListaDe{
        int Valor;
        NodoListaDe sig;
        NodoListaDe prev;
    }

    private NodoListaDe cabeza;
    private NodoListaDe cola;

    public void InicializarLista(){
        cabeza = null;
        cola = null;

    }
    

    public void Agregar(int x){
        if (cola == null && cabeza == null) {
            cabeza = new NodoListaDe();
            cabeza.Valor = x;
            cabeza.sig = null;
            cabeza.prev = null;

        }else if (cola == null && cabeza != null) {
            cola = new NodoListaDe();
            cola.Valor = x;
            cola.sig = null;
            cola.prev = cabeza;
        }else if (cola != null && cabeza != null) {
            NodoListaDe aux = new NodoListaDe();
            aux.Valor = x;
            aux.sig= cabeza.sig;
            cabeza.sig = aux;
            aux.prev = cabeza;
        }
    }

    public void Eliminar(int num){
        if (cabeza != null) {
            NodoListaDe aux = cabeza;
            while (aux != null && aux.Valor != num)
                aux = aux.sig;
            if (aux != null) {
                if (aux == cabeza ) {
                    cabeza = aux.sig;
                    if (cabeza != null)
                        cabeza.prev = null;
                }
                if (aux == cola) {
                    cola = aux.prev;
                    if (cola != null)
                        cola.sig = null;
                }
                if (aux.prev != null)
                    aux.prev.sig = aux.sig;
                if (aux.sig != null)
                    aux.sig.prev = aux.prev;
            }
        }
    }

    public void MostrarLista(){
        NodoListaDe aux = cabeza;
        while (aux.sig != null) {
            System.out.println("El aux es");
            System.out.println(aux.Valor);
            System.out.println("El aux.sig es:");
            System.out.println(aux.sig);
            System.out.println("El aux.prev es:");
            System.out.println(aux.prev);
            aux = aux.sig;
        }
        System.out.println("La cola es: ");
        System.out.println(cola.Valor);
        System.out.println("La cabeza es: ");
        System.out.println(cabeza.Valor);
    }
}
