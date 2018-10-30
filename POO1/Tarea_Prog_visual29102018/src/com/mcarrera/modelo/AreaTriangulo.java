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
public class AreaTriangulo {
    double base;
    double altura;
    double areaT;
    Scanner sc = new Scanner(System.in);

    public AreaTriangulo() {
    }

    public AreaTriangulo(double base, double altura, double areaT) {
        this.base = base;
        this.altura = altura;
        this.areaT = areaT;
    }
    
    
    public void ingresarBase(){
        System.out.println("Ingrese base:");
        base=sc.nextDouble();
    }
    public void ingresarAltura(){
        System.out.println("Ingrese Altura:");
        altura=sc.nextDouble();
    }
    public void areaTotal(){
        areaT= (base*altura)/2;
        System.out.println("El area del triangulo es: "+areaT);
    }
    public void perimetro(int cateto1, int cateto2){
      int hipotenusa = (int) Math.sqrt((cateto1*cateto1)+(cateto2*cateto2));
      System.out.println("el perimetro es: "+hipotenusa);
      
        
      }
}
