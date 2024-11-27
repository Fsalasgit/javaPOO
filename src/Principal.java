import com.franco.screenmatch.modelos.Pelicula;
import com.franco.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();

        miPelicula.setNombre("Matrix");
        miPelicula.setAnioDeLanzamiento(1999);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);
        miPelicula.setDirector("Mochila");


        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(8);


        System.out.println("El nombre desde el get es: "+ miPelicula.getNombre());


        System.out.println("Total de evaluaciones: " + miPelicula.getTotalDeEvaluaciones());


        System.out.println("media: " +miPelicula.calculaMedia());

        Serie casaDragon = new Serie();
        casaDragon.setNombre("La casa del dragón");
        casaDragon.setAnioDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(8);
        System.out.println("*****Serie****");
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());
    }
}
