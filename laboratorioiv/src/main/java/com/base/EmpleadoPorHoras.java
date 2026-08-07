package com.base;

public class EmpleadoPorHoras extends Empleado{
        int horas;
        double pagoHora = 16;
    
    @Override
    public void mostrarSalario(double horas){
        System.out.println("Su salario es " + (horas*pagoHora));
    }

}
