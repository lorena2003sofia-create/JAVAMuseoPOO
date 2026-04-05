class Cliente extends Persona{

    private String direccion;

    public Cliente(String nombre,String email,
    String telefono,String direccion){

        super(nombre,email,telefono);

        this.direccion=direccion;

    }

    public void comprar(){

        System.out.println("Cliente realiza compra");

    }

}
