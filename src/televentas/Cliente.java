class Cliente extends UsuarioSistema{

    private String direccion;

    public Cliente(String nombre,String email,String direccion){

        super(nombre,email);

        this.direccion=direccion;

    }

    public void crearOrden(){

        System.out.println("Cliente crea orden");

    }

}
