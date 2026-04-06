class Cuadro extends ObraArte{

    private String tecnica;
    private String estilo;

    public Cuadro(String autor,String periodo,double valor,
    String fechaCreacion,String fechaIngreso,
    String tecnica,String estilo){

        super(autor,periodo,valor,fechaCreacion,fechaIngreso);

        this.tecnica=tecnica;
        this.estilo=estilo;

    }

    @Override
    public void mostrarDetalle(){

        System.out.println("Tecnica: "+tecnica);
        System.out.println("Estilo: "+estilo);

    }

}
