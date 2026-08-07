package com.base;

public class Material {
    public String titulo;
    public int numeropaginas;

    public void mostrarDatos(String titulo, int numeropaginas){
        System.out.println("El titulo es " + titulo);
        System.out.println("El número de páginas es " + numeropaginas);
    }
}
