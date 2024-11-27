import com.franco.screenmatch.modelos.Pelicula;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();

        miPelicula.setNombre("Matrix");
        miPelicula.setAnioDeLanzamiento(1999);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);


        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(8);


        System.out.println("El nombre desde el get es: "+ miPelicula.getNombre());


        System.out.println("Total de evaluaciones: " + miPelicula.getTotalDeEvaluaciones());


        System.out.println("media: " +miPelicula.calculaMedia());

     //   otraPelicula.muestraFichaTecnica();
    }
}
