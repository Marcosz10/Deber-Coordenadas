/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcarrera.modelo;

import java.util.Scanner;

/**
 *
 * @author Flia. Carrera
 */
public class AreaCirculo {
    double radio; 
    double area;
    Scanner sc= new Scanner(System.in);

    public AreaCirculo() {
    }

    public AreaCirculo(double radio, double area) {
        this.radio = radio;
        this.area = area;
    }
    public void ingresarRadio(){
        System.out.println("Ingrese el Radio del circulo: "); 
        radio=sc.nextDouble();
    }
    public void AreaTCirculo(){
        area = 3.1416 * Math.pow(radio,2);
        System.out.println("El area del circulo es: "+area); 
   }
    
}
