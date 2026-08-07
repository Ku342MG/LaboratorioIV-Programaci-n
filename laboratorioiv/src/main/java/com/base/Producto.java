package com.base;

public class Producto {
        String nombre;
   public void mostrarNombre(int i, String nombre){
    System.out.println("El nombre del prodcuto es " + nombre);
    if (i== 1){
        System.out.println("Producto físico");

    }
    else if (i ==2){
        System.out.println("Producto digital");
    }
    else{
        System.out.println("Opcion no válida");
    }
   }

}
