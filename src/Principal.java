import com.franco.screenmatch.calculos.CalculadoraDeTiempo;
import com.franco.screenmatch.calculos.FiltroRecomendacion;
import com.franco.screenmatch.modelos.Episodio;
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


        CalculadoraDeTiempo calculador = new CalculadoraDeTiempo();
        calculador.incluye(miPelicula);
        calculador.incluye(casaDragon);
        System.out.println(calculador.getTiempoTotal());

        Pelicula otraPelicula3 = new Pelicula();
        otraPelicula3.setNombre("Dead pool 3");
        otraPelicula3.setAnioDeLanzamiento(2024);
        otraPelicula3.setDuracionEnMinutos(180);

        calculador.incluye(otraPelicula3);
        System.out.println("Tiempo necesario para ver los titulos favoritos estas vacaciones: " + calculador.getTiempoTotal() + " Min.");

        FiltroRecomendacion filtroDeRecomendacion = new FiltroRecomendacion();
        System.out.println("**filtro pelicula**");
        filtroDeRecomendacion.filtra(miPelicula);

        Episodio episodio1 = new Episodio();
        episodio1.setNumero(1);
        episodio1.setNombre("La casa Targaryen");
        episodio1.setSerie(casaDragon);
        episodio1.setTotalVisualizaciones(300);
        System.out.println("***filtro recomendacion****");
        filtroDeRecomendacion.filtra(episodio1);

    }
}
