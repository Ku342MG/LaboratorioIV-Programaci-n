package com.base;

public class Vehiculo {
    private String marca;
    private double kilometros;

    public void Vehiculos(String marca, double kilometros){
        this.marca = marca;
        this.kilometros = kilometros;
    }
    public String getMarca(){
        return this.marca;
    }
    public double getKilometros(){
        return this.kilometros;
    }

    public void mostrarDatos(){
        System.out.println( "La marca es " + this.marca + "Los kilometros son " + this.kilometros);
    }
}
