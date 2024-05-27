package Libres;

public class ejercicio {

    public static void main(String[] args) {
        contactoTDA nodo1 = new TelecheaSantino();
        nodo1.InicializarContactos();
        nodo1.AgregarContacto("Edgardo", 49021, 29);
        nodo1.AgregarContacto("Juan", 86904, 79);
        nodo1.AgregarContacto("Patricia", 70902, 12);
        nodo1.AgregarContacto("Leticia", 55410, 25);
        nodo1.AgregarContacto("Yagami", 15689, 17);
        nodo1.AgregarContacto("Light", 24102, 18);
        nodo1.AgregarContacto("Cowboy", 28102, 17);

        System.out.println(nodo1.EsMayorDeEdad(24102));
        System.out.println(nodo1.EsMayorDeEdad(15689));

        nodo1.EliminarContacto(15689);
        System.out.println(nodo1.BuscarDnis(70902));

        System.out.println(nodo1.BuscarEdad(17));

        contactos[] mayores = nodo1.MayoresDeEdad();
        

    }
}