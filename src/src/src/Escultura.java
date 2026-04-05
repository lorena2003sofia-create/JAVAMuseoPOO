class Escultura extends ObraArte{

    private String material;
    private String estilo;

    public Escultura(String autor,String periodo,double valor,
    String fechaCreacion,String fechaIngreso,
    String material,String estilo){

        super(autor,periodo,valor,fechaCreacion,fechaIngreso);

        this.material=material;
        this.estilo=estilo;

    }

    @Override
    public void mostrarDetalle(){

        System.out.println("Material: "+material);
        System.out.println("Estilo: "+estilo);

    }

}
