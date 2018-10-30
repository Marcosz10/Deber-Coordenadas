/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcarrera.vista;

import com.mcarrera.modelo.AreaCirculo;
import com.mcarrera.modelo.AreaTriangulo;

/**
 *
 * @author Flia. Carrera
 */
public class Aplicacion {
    public static void main(String[] args) {
        AreaTriangulo areaT= new AreaTriangulo();
        areaT.ingresarBase();
        areaT.ingresarAltura();
        areaT.areaTotal();
        areaT.perimetro(0, 0);
        AreaCirculo areaC=new AreaCirculo();
        areaC.ingresarRadio();
        areaC.AreaTCirculo();
    }
    
}
