package com.base;

public abstract class  Animal{
    private String nombre;

    public Animal(){};

    public String getNombre(){
        return this.nombre;
    }

    public abstract void hacerSonido();
}
