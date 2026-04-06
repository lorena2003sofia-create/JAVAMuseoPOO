public class MainTeleventas{

    public static void main(String[] args){

        Cliente cliente = new Cliente(
        "Ana",
        "ana@email.com",
        "Bogota"
        );

        AgenteDeposito agente = new AgenteDeposito(
        "Carlos",
        "carlos@email.com"
        );

        GerenteRelaciones gerente = new GerenteRelaciones(
        "Laura",
        "laura@email.com"
        );

        cliente.mostrarDatos();
        cliente.crearOrden();

        System.out.println("-----");

        agente.mostrarDatos();
        agente.prepararPedido();

        System.out.println("-----");

        gerente.mostrarDatos();
        gerente.revisarQueja();

    }

}
