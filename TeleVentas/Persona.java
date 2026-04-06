abstract class Persona {

    protected String nombre;
    protected String email;
    protected String telefono;

    public Persona(String nombre,String email,String telefono){

        this.nombre=nombre;
        this.email=email;
        this.telefono=telefono;

    }

    public void mostrarDatos(){

        System.out.println(nombre);
        System.out.println(email);
        System.out.println(telefono);

    }

}
