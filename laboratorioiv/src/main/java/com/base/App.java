package com.base;
import java.util.Scanner;
/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        int eleccionusuario = 100;
        Scanner sc = new Scanner(System.in);
        do{
        System.out.println("Ejercicio");
        System.out.println("Ingrese ejercicio a mostrar (1-16)");
        eleccionusuario = sc.nextInt();
        }
        while(eleccionusuario == 100);
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
                if (eleccionusuario== 2){
                            System.out.println("Vehiculos");
                            VehiculosCarro carro1 = new VehiculosCarro();
                            carro1.setMarca("Honda");
                            carro1.setKilometros(124532.34);
                            carro1.mostrarDatos();
                }
                else{
                    System.out.println("novalido");
                }
    sc.close();
    } // cierre main 
}
