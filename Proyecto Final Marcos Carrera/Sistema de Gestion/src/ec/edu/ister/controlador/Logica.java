/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ister.controlador;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 * @Instituto Superior Tecnologico Rumiñahui
 * @Katherine Chango {} 
 */
public class Logica {

    public Logica() {
    }
    public static boolean valida(String x){
    int suma=0;
    if(x.length()<=9){
        JOptionPane.showMessageDialog(null, "error");
        return false;
    }else{
      int a[]=new int [x.length()/2];
      int b[]=new int [(x.length()/2)];
      int c=0;
      int d=1;
      for (int i = 0; i < x.length()/2; i++) {
        a[i]=Integer.parseInt(String.valueOf(x.charAt(c)));
        c=c+2;
        if (i < (x.length()/2)-1) {
          b[i]=Integer.parseInt(String.valueOf(x.charAt(d)));
          d=d+2;
          
        }
        }//JOptionPane.showMessageDialog(null,Arrays.toString(a));
        //JOptionPane.showMessageDialog(null,Arrays.toString(b));
    //return true;  
    
       for (int i = 0; i < a.length; i++) {
        a[i]=a[i]*2;
        if (a[i] >9){
          a[i]=a[i]-9;
        }
        suma=suma+a[i]+b[i];
      } 
      int aux=suma/10;
      int dec=(aux+1)*10;
      if ((dec - suma) == Integer.parseInt(String.valueOf(x.charAt(x.length()-1))))
        return true;
      else
        if(suma%10==0 && x.charAt(x.length()-1)=='0'){
          return true;
        }else{
          return false;
        }
     
       }
}
}


