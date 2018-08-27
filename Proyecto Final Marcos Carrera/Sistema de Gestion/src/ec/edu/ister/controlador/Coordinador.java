package ec.edu.ister.controlador;

import ec.edu.ister.vista.*;
import ec.edu.ister.vista.docenteAdmin.EditarDocente;
import ec.edu.ister.vista.docenteAdmin.EliminarDocente;
import ec.edu.ister.vista.docenteAdmin.IngresarDocente;
import ec.edu.ister.vista.estudianteAdmin.EditarEstudiantes;
import ec.edu.ister.vista.estudianteAdmin.EliminarEstudiantes;
import ec.edu.ister.vista.estudianteAdmin.IngresoEstudiantes;
import ec.edu.ister.vista.materiasAdmin.EditarMateria;
import ec.edu.ister.vista.materiasAdmin.EliminarMateria;
import ec.edu.ister.vista.materiasAdmin.IngresarMateria;

public class Coordinador {

   
    Login login = new Login(this);
    Administrador administrador = new Administrador(this);
    Inicio inicio = new Inicio(this);
    IngresarDocente ingDoc= new IngresarDocente(this);
    EditarDocente ediDoc =new EditarDocente(this);
    EliminarDocente eliDoc = new EliminarDocente(this);
    IngresoEstudiantes ingEst = new IngresoEstudiantes();
    EditarEstudiantes ediEst = new EditarEstudiantes(this);
    EliminarEstudiantes eliEst =new EliminarEstudiantes(this);
    IngresarMateria ingMat= new IngresarMateria(this);
    EditarMateria ediMat= new EditarMateria(this);
    EliminarMateria eliMat = new EliminarMateria(this);
    public void showInicio() {
        inicio.setSize(1500, 1500);
   
        administrador.escritorio.removeAll();
        administrador.escritorio.add(inicio);
        inicio.setVisible(true);
        administrador.escritorio.repaint();
    }
 public void showAdministrador() {
        //iniciaReloj(inicioAdministrador.lblReloj);
        administrador.setVisible(true);
    }
  public void showLogin() {
        //iniciaReloj(login.lblReloj);
        login.setVisible(true);
    }

    public void hideLogin() {
        login.setVisible(false);
    }
      public void hideAdministrador() {
        administrador.setVisible(false);
    }
      public void showIngresarDocente(){
           ingDoc.setSize(1500,1500);
        administrador.escritorio.removeAll();
        administrador.escritorio.add(ingDoc);
        ingDoc.setVisible(true);
        administrador.escritorio.revalidate();
        administrador.escritorio.repaint();
      }
      public void showEditarDocente(){
           ediDoc.setSize(1500,1500);
        administrador.escritorio.removeAll();
        administrador.escritorio.add(ediDoc);
        ediDoc.setVisible(true);
        administrador.escritorio.revalidate();
        administrador.escritorio.repaint();
          
      }
      public void showEliminarDocentes(){
           eliDoc.setSize(1500,1500);
        administrador.escritorio.removeAll();
        administrador.escritorio.add(eliDoc);
        eliDoc.setVisible(true);
        administrador.escritorio.revalidate();
        administrador.escritorio.repaint();
      }
      public void showIngresoEstudiantes(){
           ingEst.setSize(1500,1500);
        administrador.escritorio.removeAll();
        administrador.escritorio.add(ingEst);
        ingEst.setVisible(true);
        administrador.escritorio.revalidate();
        administrador.escritorio.repaint();
      }
      public void showEditarEstudiantes(){
          ediEst.setSize(1500,1500);
        administrador.escritorio.removeAll();
        administrador.escritorio.add(ediEst);
        ediEst.setVisible(true);
        administrador.escritorio.revalidate();
        administrador.escritorio.repaint();
      }
      public void showEliminarEstudiantes(){
          eliEst.setSize(1500,1500);
        administrador.escritorio.removeAll();
        administrador.escritorio.add(eliEst);
        eliEst.setVisible(true);
        administrador.escritorio.revalidate();
        administrador.escritorio.repaint();
      }
      public void showIngresarMateria(){
          ingMat.setSize(1500,1500);
        administrador.escritorio.removeAll();
        administrador.escritorio.add(ingMat);
        ingMat.setVisible(true);
        administrador.escritorio.revalidate();
        administrador.escritorio.repaint();
      }
      public void showEditarMateria(){
          ediMat.setSize(1500,1500);
        administrador.escritorio.removeAll();
        administrador.escritorio.add(ediMat);
        ediMat.setVisible(true);
        administrador.escritorio.revalidate();
        administrador.escritorio.repaint();
      }
      public void showEliminarMateria(){
          eliMat.setSize(1500,1500);
        administrador.escritorio.removeAll();
        administrador.escritorio.add(eliMat);
        eliMat.setVisible(true);
        administrador.escritorio.revalidate();
        administrador.escritorio.repaint();
      }
}

