package com.franco.screenmatch.modelos;

public class Titulo {
    private String nombre;
    private int anioDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int totalDeEvaluaciones;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAnioDeLanzamiento(int anioDeLanzamiento) {
        this.anioDeLanzamiento = anioDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAnioDeLanzamiento() {
        return anioDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    //Encapsulamos el total de evaluaciones para que el usuario no modifique
    public int getTotalDeEvaluaciones(){
        return totalDeEvaluaciones;
    }

    //metodos
    public void muestraFichaTecnica(){
        System.out.println("Titulo: " + nombre);
        System.out.println("Año de lanzamiento: " + anioDeLanzamiento);
        System.out.println("Duracion : " + duracionEnMinutos);
        System.out.println("Duracion con el get: " + getDuracionEnMinutos());

    }

    public void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        totalDeEvaluaciones ++;
    }

    public double calculaMedia(){
        return sumaDeLasEvaluaciones/totalDeEvaluaciones;
    }

}
