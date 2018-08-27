package ec.edu.ister.controlador;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

public class Reloj implements Runnable{
    JLabel label;
    
    public Reloj(JLabel label){
    
        this.label= label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }
    
    public String Tiempo(){
        Date date = new Date();
        DateFormat dateformat = new SimpleDateFormat("dd/mm/yyyy");
        DateFormat hourdateformat = new SimpleDateFormat("HH:mm:ss");
        return (hourdateformat.format(date));    
    }

    @Override
    public void run() {
        int i=1;
        try {
            do {                
                this.label.setText(" "+Tiempo()+" ");
            } while (i==1);
        } catch (Exception e) {
        }
    }                     
}
