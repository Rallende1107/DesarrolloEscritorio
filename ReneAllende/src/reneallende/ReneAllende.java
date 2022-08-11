/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reneallende;

import java.util.Scanner;
/**
 *
 * @author CETECOM
 */
public class ReneAllende {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        
        String Nombre = "";
        Integer edad =0;
        String ApellidoP = "";
        String ApellidoM = "";
        String Rut = "";
        
        
        
        
        System.out.println ("Por favor introduzca su Nombre:");  
        Nombre = entradaEscaner.nextLine ();
        System.out.println ("Tu nombre es : \"" + Nombre +"\"");
        
        System.out.println ("Por favor introduzca su apellido Paterno:");  
        ApellidoP = entradaEscaner.nextLine ();
        System.out.println ("Tu nombre es : \"" + ApellidoP +"\"");
        
        System.out.println ("Por favor introduzca su apellido Materno:");  
        ApellidoM = entradaEscaner.nextLine ();
        System.out.println ("Tu nombre es : \"" + ApellidoM +"\"");
        
        System.out.println ("Por favor introduzca su rut:");  
        Rut = entradaEscaner.nextLine ();
        System.out.println ("Tu nombre es : \"" + Rut +"\"");

        
        System.out.println ("Por favor introduzca su edad:");  
        edad = Integer.parseInt(entradaEscaner.nextLine ());
        System.out.println ("Tu edad es : \"" + edad +"\"");
        
        
    }
    
}
