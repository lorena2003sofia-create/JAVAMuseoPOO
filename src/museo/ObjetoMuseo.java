class ObjetoMuseo extends ObraArte{

    public ObjetoMuseo(String autor,String periodo,double valor,
    String fechaCreacion,String fechaIngreso){

        super(autor,periodo,valor,fechaCreacion,fechaIngreso);

    }

    @Override
    public void mostrarDetalle(){

        System.out.println("Objeto del museo");

    }

}
