package com.base;
import java.util.Scanner;
/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        int eleccionusuario;
        Scanner sc = new Scanner(System.in);
        do{
        System.out.println("Ejercicio");
        System.out.println("Ingrese ejercicio a mostrar (1-16)");
        eleccionusuario = sc.nextInt();
                if (eleccionusuario== 1)
                {   
                    System.out.println("Mascotas ");
                    AnimalPerro perro1 = new AnimalPerro("Tomas");
                    perro1.mostrarNombre();
                    perro1.hacerSonido();
                    AnimalGato gato1 = new AnimalGato("Michi");
                    gato1.mostrarNombre();
                    gato1.hacerSonido();
                    System.out.println("ingrese 100 para salir");
                    eleccionusuario = sc.nextInt();
                }
                if (eleccionusuario== 2)
                {
                    System.out.println("Vehiculos");
                    VehiculosCarro carro1 = new VehiculosCarro();
                    carro1.setMarca("Honda");
                    carro1.setKilometros(124532.34);
                    carro1.mostrarDatos();
                    VehiculoMoto moto1 = new VehiculoMoto();
                    moto1.setKilometros(12414.43);
                    moto1.setMarca("Yamaha");
                    moto1.mostrarDatos();
                }
                else
                {
                    if(eleccionusuario<0 || eleccionusuario >100)
                        {
                    System.out.println("novalido");
                    }
                }
        }
        while(eleccionusuario == 100);

    sc.close();
    } // cierre main 
}
