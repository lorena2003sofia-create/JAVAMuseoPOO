class AgenteDeposito extends UsuarioSistema{

    public AgenteDeposito(String nombre,String email){

        super(nombre,email);

    }

    public void prepararPedido(){

        System.out.println("Agente prepara pedido");

    }

}
