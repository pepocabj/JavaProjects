package Empleados24;

public class Mainempleado {
    public static void main(String[] args) {
        EmpleadoTDA empl1 = new empleado();
        empl1.InicializarEmpleado();
        empl1.Agregar(98921, "LucasRoma", 24190);
        empl1.getLegajo();
        empl1.getNombre();
        //System.out.println(empl1.getSueldoAcobrar());
        //System.out.println(empl1.getLegajo());
        //System.out.println(empl1.getNombre());
        //System.out.println(empl1.toString());

        ElrestoTDA empl2 = new Elresto();
        Empleados empl88 = new Empleados();
        Empleados x1 = new Empleados();
        Empleados x2 = new Empleados();
        Empleados x3 = new Empleados();

        x3.Sueldo = 24213;
        x3.legajo = 83712;
        x3.nombre = "PolerSancho";
        x1.Sueldo = 9981;
        x1.legajo = 94329;
        x1.nombre = "ErnespIujy";
        x2.Sueldo = 5430923;
        x2.legajo = 43266;
        x2.nombre = "JuanKino";

        empl2.Agregar2(empl88);
        empl2.Agregar2(x1);
        empl2.Agregar2(x2);
        empl2.Agregar2(x3);

        empl2.listarEmpleados();
        System.out.println("El listar empleado es:");
        System.out.println(empl2.MostrarSueldo(94329));
    }
}
