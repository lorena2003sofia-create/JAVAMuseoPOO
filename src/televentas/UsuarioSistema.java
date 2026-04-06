abstract class UsuarioSistema{

    protected String nombre;
    protected String email;

    public UsuarioSistema(String nombre,String email){

        this.nombre=nombre;
        this.email=email;

    }

    public void mostrarDatos(){

        System.out.println("Nombre: "+nombre);
        System.out.println("Email: "+email);

    }

}
