/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author David Barreda
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner lea = new Scanner(System.in);
         Random  random = new Random();
         
         
         while (true){
                System.out.println("""
                                   1. Juego Piedra, Papel o Tijera
                                   2. Ejercicio de Suma
                                   3. Patron de Numeros
                                   4. Salir
                                   Ingresa una opcion: """);
                int menu=lea.nextInt();
                
                if(menu==1){
                            String jugador;
                            System.out.println("Elije una opcion (Piedra Papel o Tijera): ");
                            jugador = lea.next().toLowerCase();
                    
                            if (!jugador.equals("piedra") && !jugador.equals("papel") && !jugador.equals("tijera")) {
                                System.out.println("Opcion invalida");
                            } else {
                                int computadora = random.nextInt(3) + 1;
                            String eleccionComputadora;

                            if (computadora == 1) {
                                  eleccionComputadora = "papel";
                            } else if (computadora == 2) {
                                eleccionComputadora = "piedra";
                            } else {
                                eleccionComputadora = "tijera";
                            }

                            System.out.println("Computadora elige: " + eleccionComputadora);

                            if (jugador.equals(eleccionComputadora)) {
                                System.out.println("Empate!");
                            } else if ((jugador.equals("piedra") && eleccionComputadora.equals("tijera")) ||
                                        (jugador.equals("papel") && eleccionComputadora.equals("piedra")) ||
                                        (jugador.equals("tijera") && eleccionComputadora.equals("papel"))) {
                                System.out.println("Ganaste!");
                            } else {
                                System.out.println("Perdiste!");
                            }                           
                }
        
        }else if (menu ==2 ){
            
            System.out.println("Ingresa un numeros enteros:");
            int numero = lea.nextInt();

            int suma = 0;
            String sumando = "";

            while (numero > 0) {
                int digito = numero % 10;
                suma += digito;
                sumando = digito + " + " + sumando;
                numero /= 10;
            }

            
            sumando = sumando.substring(0, sumando.length() - 3);

            System.out.println("La suma de los digitos es: " + suma);
            System.out.println("Sumandos: " + sumando + " = " + suma);
            
            
            
        }else if ( menu == 3){
            
                System.out.print("Ingrese el numero de filas: ");
            int filas = lea.nextInt();
        
            System.out.println("Patron numerico descendente:");
            for (int i = 0; i < filas; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  "); 
                }
            for (int j = filas - i; j >= 1; j--) {
                System.out.print(j + " ");
                }
            System.out.println();
            }
        
        
        
        }else {
             break;
         }
     }    
  }  
}

