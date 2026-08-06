package com.base;

public class AnimalGato extends Animal {
    String nombre;

    public AnimalGato(String nombre){
        this.nombre = nombre;
    }

    public void mostrarNombre(){
        System.out.println("El nombre de la mascota es " + this.nombre);
    }

    @Override
    public void hacerSonido(){
        System.out.println("Miau");
    }
}
