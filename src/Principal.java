public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();

        miPelicula.nombre = "Matrix";
        miPelicula.anioDeLanzamiento = 1999;
        miPelicula.duracionEnMinutos = 120;
        miPelicula.incluidoEnElPlan = true;

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(8);

        System.out.println("Evaluaciones: " + miPelicula.sumaDeLasEvaluaciones);
        System.out.println("media: " +miPelicula.calculaMedia());

        Pelicula otraPelicula = new Pelicula();

        otraPelicula.nombre = "Dragon ball Z";
        otraPelicula.anioDeLanzamiento = 1990;
        otraPelicula.duracionEnMinutos = 120;
        otraPelicula.incluidoEnElPlan = true;

     //   otraPelicula.muestraFichaTecnica();
    }
}
