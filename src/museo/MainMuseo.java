public class MainMuseo{

    public static void main(String[] args){

        Cuadro cuadro = new Cuadro(

        "Picasso",
        "Siglo XX",
        50000,
        "1937",
        "2000",
        "Oleo",
        "Cubismo"

        );

        Escultura escultura = new Escultura(

        "Rodin",
        "Siglo XIX",
        80000,
        "1880",
        "1995",
        "Bronce",
        "Realismo"

        );

        cuadro.mostrarInformacion();
        cuadro.mostrarDetalle();

        System.out.println("------");

        escultura.mostrarInformacion();
        escultura.mostrarDetalle();

    }

}
