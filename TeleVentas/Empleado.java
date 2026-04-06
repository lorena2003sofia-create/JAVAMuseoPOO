class Empleado extends Persona{

    private String cargo;

    public Empleado(String nombre,String email,
    String telefono,String cargo){

        super(nombre,email,telefono);

        this.cargo=cargo;

    }

    public void gestionarOrden(){

        System.out.println("Empleado gestiona orden");

    }

}
