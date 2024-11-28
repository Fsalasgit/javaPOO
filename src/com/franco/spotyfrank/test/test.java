package com.franco.spotyfrank.test;

import com.franco.spotyfrank.modelos.Cancion;
import com.franco.spotyfrank.modelos.MisFavoritos;
import com.franco.spotyfrank.modelos.Podcast;

public class test {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Mi corazon encantado");
        miCancion.setCantante("Gokú");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Vegeta");
        miPodcast.setTitulo("Maldito canalla");

        //cancion en su clase entra a favorito por reproduccion > 5000
        //cancion en su clase entra a favorito por me gusta > 5000
        for (int i = 0; i < 5001; i++) {
            miCancion.meGusta();
        }


        for (int i = 0; i < 3; i++) {
            miCancion.reproduce();
        }

        for (int i = 0; i < 100; i++) {
            miPodcast.meGusta();
        }


        for (int i = 0; i < 5000; i++) {
            miPodcast.reproduce();
        }

        System.out.println("Total de repoducciones: " + miCancion.getTotalDeReproducciones());
        System.out.println("Total de me Gusta: " + miCancion.getTotalDeMeGusta());

        System.out.println("********");

        MisFavoritos favoritos = new MisFavoritos();

        favoritos.adiciona(miCancion);
        favoritos.adiciona(miPodcast);
    }
}
