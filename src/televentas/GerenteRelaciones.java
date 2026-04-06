class GerenteRelaciones extends UsuarioSistema{

    public GerenteRelaciones(String nombre,String email){

        super(nombre,email);

    }

    public void revisarQueja(){

        System.out.println("Gerente revisa queja");

    }

}
