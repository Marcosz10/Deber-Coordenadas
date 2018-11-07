/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carrera.vista;

import com.carrera.modelo.Punto;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcos Carrera
 */
public class Aplicacion {
    public static void main(String[] args) {
        int x,y;
      
        
        int op;
        do {            
            op=Integer.parseInt(JOptionPane.showInputDialog("Deseas Ingresar un Punto: \n"
            + "1.- Si \n"
            + "2.- No"));
            
            if (op==1) {
                x= Integer.parseInt(JOptionPane.showInputDialog("Ingrese coordenadas X: "));
                y= Integer.parseInt(JOptionPane.showInputDialog("Ingrese coordenadas Y: "));
                Punto.almacenarPuntos(x, y);  
             
            }
  
            
        
        } while (op != 2);
        
        
        Punto.imprimirPuntos();
             
//        JOptionPane.showMessageDialog(null,p1.toString()+ "\n"+ p2.toString() + "\n"+
//                "La distancia es: "+ Punto.calcularDistancia(p1, p2));

        
        
    }
    
}


//        JOptionPane.showMessageDialog(null, p1.toString()+"\n"+
//                p2.toString()+"\n"+ "La distancia entre los puntos son: "
//                +""+Punto.calcularDistancia(p1, p2));
//    }
//}
//