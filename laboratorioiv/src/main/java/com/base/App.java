package com.base;
import java.util.ArrayList;
import java.util.InputMismatchException;
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
                System.out.println("Mostraremos los datos de libros por metodos");
                MaterialLibro libro1 = new MaterialLibro();
                MaterialRevistas revista1 = new MaterialRevistas();
                libro1.mostrarDatos("Don Quijote", 1543);
                revista1.mostrarDatos("Revista de modas ", 12);   
                System.out.println("ingrese 100 para salir");
                eleccionusuario = sc.nextInt();                       
                }
                else if(eleccionusuario == 5){
                    try{
                    System.out.println("Ingrese edad");
                    int edad = sc.nextInt();
                    if (edad<0){
                        throw new IllegalStateException("Edad no válida");
                    }
                    } 
                    catch(Exception e){
                        System.out.println(e.getLocalizedMessage());
                    }
                    finally 
                    {
                        System.out.println("Bloque finally ejecutado");
                        eleccionusuario = 100;
                    }

                }
                else if(eleccionusuario == 6){
                    try{
                        System.out.println("Ingrese número 1");
                        int num1 = sc.nextInt();
                        System.out.println("Ingrese número 2");
                        sc.nextLine();
                        int num2 = sc.nextInt();
                        int resultado = num1 / num2;
                        System.out.println(resultado);
                    }
                    catch(ArithmeticException e){
                        System.out.println(e.getLocalizedMessage());
                    }
                    finally{
                        System.out.println("Bloque finally");
                        eleccionusuario =100;
                    }
                }
                else if(eleccionusuario ==7){
                    try{
                    System.out.println("Ingrese un número");
                    int eleccionNumero = sc.nextInt();
                    System.out.println(eleccionNumero);
                    }
                    catch(InputMismatchException e){
                        System.out.println("Error al ingresar los datos " + e.getLocalizedMessage());
                    }
                    finally{
                        System.out.println("Bloque finally");
                        eleccionusuario =100;                        
                    }
                }

                else if (eleccionusuario == 8){
                    System.out.println("Arreglos");
                    double[] notas = new double[5];
                    for(int i = 0; i<notas.length; i++){
                        System.out.println("ingrese la nota de " + (i+1));
                        notas[i] = sc.nextDouble();
                    }
                    for(int i = 0; i<notas.length; i++){
                        System.out.println("Nota " + notas[(i+1)] + " " + notas[i]);
                    }
                    eleccionusuario =100;
                    double promediosuma = 0;
                    for ( int i = 0; i<notas.length; i++){
                        promediosuma +=notas[i];
                        
                    }
                    System.out.println("El promedio es " + promediosuma/notas.length);
                }
                else if(eleccionusuario ==9){
                    System.out.println("Ingrese 3 números consecutivamente");
                    double numero1= sc.nextInt();
                    double numero2 = sc.nextInt();
                    double numero3 = sc.nextInt();
                    ArrayList<Double> arreglo1 = new ArrayList<>();
                    arreglo1.add(numero1);
                    arreglo1.add(numero2);
                    arreglo1.add(numero3);
                    double mayor = arreglo1.get(0);
                    double menor = arreglo1.get(0);
                    for(int i = 1; i<arreglo1.size(); i++)
                        {
                        if (arreglo1.get(i)>mayor){
                            mayor = arreglo1.get(i);
                        }
                    }
                    for(int i = 1; i<arreglo1.size(); i++)
                        {
                        if (arreglo1.get(i)<menor){
                            menor = arreglo1.get(i);
                        }
                    }            
                    System.out.println("El mayor es " + mayor);
                    System.out.println("El menor es " + menor);
                    eleccionusuario = 100;        
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
