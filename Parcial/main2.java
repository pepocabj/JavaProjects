package Parcial;

public class main2 {
    public static void main(String[] args) {
        conjuntos conj1 = new conjuntos();
        conj1.InicializarConjunto();
        conj1.Agregar(10);
        conj1.Agregar(7);
        //conj1.Agregar(21);

        conjuntos conj2 = new conjuntos();
        conj2.InicializarConjunto();
        conj2.Agregar(10);
        conj2.Agregar(7);
        conj2.Agregar(8);
        conj2.Agregar(19);
        conj2.Agregar(88);

        System.out.println(conj2.TodosPertenecen(conj1));
        conj2.SacarTodos(conj2,conj1);
        conj2.Mostrar();
        

        

    }
}
