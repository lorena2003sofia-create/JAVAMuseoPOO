public class Main {

    public static void main(String[] args){

        Cuadro cuadro1 = new Cuadro(

        "Picasso",
        "Siglo XX",
        50000,
        "1937",
        "2000",
        "Oleo",
        "Cubismo"

        );

        Escultura escultura1 = new Escultura(

        "Rodin",
        "Siglo XIX",
        80000,
        "1880",
        "1995",
        "Bronce",
        "Realismo"

        );

        cuadro1.mostrarInformacion();
        cuadro1.mostrarDetalle();

        System.out.println("--------------");

        escultura1.mostrarInformacion();
        escultura1.mostrarDetalle();

    }

}
