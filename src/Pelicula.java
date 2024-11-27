public class Pelicula {
    String nombre;
    int anioDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;
    double sumaDeLasEvaluaciones;
    int totalDeEvaluaciones;

    //metodos
    void muestraFichaTecnica(){
        System.out.println("Pelicula: " + nombre);
        System.out.println("Año de lanzamiento: " + anioDeLanzamiento);
        System.out.println("Duracion : " + duracionEnMinutos);

    }

    void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        totalDeEvaluaciones ++;
    }

    double calculaMedia(){
        return sumaDeLasEvaluaciones/totalDeEvaluaciones;
    }

}
