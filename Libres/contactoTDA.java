package Libres;
public interface contactoTDA {
    void AgregarContacto(String nom1, int dni1, int edad1);
    void EliminarContacto(int x);
    boolean EsMayorDeEdad(int x);
    contactos BuscarDni(int x);
    contactos[] BuscarEdad(int x);
    contactos[] BuscarDnis(int x);
    contactos[] MayoresDeEdad();
    void InicializarContactos(); 
}
