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
                else if (eleccionusuario== 2)
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
                else if (eleccionusuario == 3)
                    {
                        System.out.println("Ejercicio 4");
                        sc.nextLine();
                        System.out.println("Su pago será en tarjeta o efectivo?");
                        String textoejercicio = sc.nextLine();
                        if(textoejercicio.equalsIgnoreCase("tarjeta"))
                            {
                            System.out.println("Ingrese los ultimos 4 digitos de su tarjeta ");
                            int tarjeta = sc.nextInt();
                            PagoTarjeta pg = new PagoTarjeta();
                            pg.elegirTarjeta(tarjeta);
                            System.out.println("Ingrese el monto");
                            sc.nextLine();
                            double monto = sc.nextDouble();
                            pg.procesarPago(monto);
                            }
                        else if(textoejercicio.equalsIgnoreCase("Efectivo"))
                            {
                            System.out.println("ingrese el monto a pagar");
                            PagoEfectivo pg = new PagoEfectivo();
                            double pago = sc.nextDouble();
                            pg.procesarPago(pago);
                                System.out.println("ingrese 100 para salir");
                                eleccionusuario = sc.nextInt();                        
                            }
                        eleccionusuario = 100;

                    }

                else if(eleccionusuario ==4){
                    
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
