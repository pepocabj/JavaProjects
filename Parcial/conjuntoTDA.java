package Parcial;

public interface conjuntoTDA {
    void InicializarConjunto();
    void Agregar(int x);
    int Elegir();
    boolean ConjuntoVacio();
    void Sacar(int x);
    boolean Pertenece(int x);
    boolean TodosPertenecen(conjuntos x);
    void SacarTodos(conjuntos x,conjuntos y);
    void Mostrar();
}
