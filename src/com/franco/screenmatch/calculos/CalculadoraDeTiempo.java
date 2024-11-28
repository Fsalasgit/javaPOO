package com.franco.screenmatch.calculos;

import com.franco.screenmatch.modelos.Pelicula;
import com.franco.screenmatch.modelos.Serie;
import com.franco.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {

    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    /*
    public void incluye(Pelicula pelicula){

        tiempoTotal += pelicula.getDuracionEnMinutos();
    }

    public void incluye(Serie serie){

        tiempoTotal += serie.getDuracionEnMinutos();
    }

     */

    //polimorfismo reduce el codigo (hacemos referencia a la misma cosa pero de diferente manera)
    public void incluye(Titulo titulo){

        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }


}
