package com.eduroa;

import com.eduroa.clases.Numeros;

public class Aplicacion {
    public static void main(String[] args) {
       
        System.out.println("Es par (4): " + Numeros.esPar(4)); 
        System.out.println("Es par (5): " + Numeros.esPar(5)); 

     
        System.out.println("Es primo (7): " + Numeros.esPrimo(7)); 
        System.out.println("Es primo (8): " + Numeros.esPrimo(8)); 

       
        System.out.println("String en reversa ('adios'): " + Numeros.stringEnreversa("adios")); // aloh

       
        System.out.println("Es palíndromo ('reconocer'): " + Numeros.esPalindromo("reconocer")); // true
        System.out.println("Es palíndromo ('hola'): " + Numeros.esPalindromo("hola")); // false

      
        System.out.print("Secuencia FizzBuzz hasta 15: ");
        Numeros.secuenciaFizzBuzz(15);
    }
}
