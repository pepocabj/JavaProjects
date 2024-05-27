package Parcial;

public class conjuntos implements conjuntoTDA{
    private int[] a;
    private int cant;
    private int[] lst;

    public void InicializarConjunto(){
        a = new int[100];
        cant = 0;
    }
    public void Agregar(int x){
        if (!this.Pertenece(x)) {
            a[cant] = x;
            cant++;
        }
    }
    public boolean ConjuntoVacio(){
        return (cant == 0);
    }

    public void Mostrar(){
        int i = 0;
        while (i < cant ) {
            System.out.println(a[i]);
            i++;
        }
    }
    public boolean TodosPertenecen(conjuntos x){
        int i = 0;
        int contR = 0;
        lst = new int[cant];
        while (i < cant) {
            if (Pertenece(x.a[i])) {
                lst[i] = x.a[i];
                contR++;
                i++;
            }
            else{
                i++;
            }
        }
        return (contR == x.cant);
    }


    public void SacarTodos(conjuntos x,conjuntos y){
        int i = 0;
        while (i != x.cant) {
            if (x.a[i] == lst[i]) {
                x.Sacar(lst[i]);
                i++;
            }
            else{
                i++;
            }
        }
    }    
    
    public int Elegir(){
        return a[cant - 1];
    }

    public boolean Pertenece(int x){
        int i = 0;
        while (i < cant && a[i] != x) {
            i++;
        }
        return (i < cant);
    }
    public void Sacar(int x){
        int i = 0;
        while (i < cant && a[i] != x) {
            i++;
        }
        if (i < cant) {
            a[i] = a[cant - 1];
            cant--;
        }
    }
}
