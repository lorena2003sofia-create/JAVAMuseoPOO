public class MainTeleventas{

    public static void main(String[] args){

        Cliente cliente = new Cliente(
        "Ana",
        "ana@email.com",
        "1234",
        "Bogota"
        );

        Empleado empleado = new Empleado(
        "Carlos",
        "carlos@email.com",
        "5678",
        "Gerente"
        );

        cliente.mostrarDatos();
        cliente.comprar();

        System.out.println("------");

        empleado.mostrarDatos();
        empleado.gestionarOrden();

    }

}
