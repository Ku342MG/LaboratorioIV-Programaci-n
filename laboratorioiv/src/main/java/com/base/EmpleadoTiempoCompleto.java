package com.base;

public class EmpleadoTiempoCompleto extends Empleado {
    double salario;

    @Override
    public void mostrarSalario(double salario){
        System.out.println("Su salario es " + (salario));
    }
    
}
