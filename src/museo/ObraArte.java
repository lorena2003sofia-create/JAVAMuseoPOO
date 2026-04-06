abstract class ObraArte{

    protected String autor;
    protected String periodo;
    protected double valor;
    protected String fechaCreacion;
    protected String fechaIngreso;

    public ObraArte(String autor,String periodo,double valor,
    String fechaCreacion,String fechaIngreso){

        this.autor=autor;
        this.periodo=periodo;
        this.valor=valor;
        this.fechaCreacion=fechaCreacion;
        this.fechaIngreso=fechaIngreso;

    }

    public void mostrarInformacion(){

        System.out.println("Autor: "+autor);
        System.out.println("Periodo: "+periodo);
        System.out.println("Valor: "+valor);

    }

    public abstract void mostrarDetalle();

}
