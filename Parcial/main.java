package Parcial;
import Parcial.NodoLista.NodoListaDe;;

public class main {
    public static void main(String[] args) {
        NodoTDA nodo1 = new NodoLista();
        nodo1.InicializarLista();
        nodo1.Agregar(10);
        nodo1.Agregar(7);
        nodo1.Agregar(2);
        nodo1.Agregar(8);

        nodo1.Eliminar(8);
        
        nodo1.MostrarLista();



    }
}
