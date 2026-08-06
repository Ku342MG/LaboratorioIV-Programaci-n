package com.base;

public class AnimalPerro extends Animal{
    private String nombre;

    public AnimalPerro(String nombre){
        this.nombre = nombre;
    }

    public void mostrarNombre(){
        System.out.println("El nombre de la mascota es " + nombre);
    }

    @Override
    public void hacerSonido(){
        System.out.println("guau");
    }

}
