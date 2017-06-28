package org.umg.deportes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Ottoniel RT on 27/06/2017.
 */
public class Menu {

 private ArrayList deportes;

 Menu () {
     deportes = new ArrayList<Deportes>();

 }

 void ImprimirMenu(){
     System.out.println("======== Elija una Opción ========");
     System.out.println("-1- Agregar Deportes");
     System.out.println("-2- Agregar Especialista");
     System.out.println("-3- Imprimir Listado Deportes");
     System.out.println("-4- Salir ");
     System.out.println("==================================");
 }

    /**
     * Metodo para agregar deportes
     */
  public void AgregaDeportes(){
     Scanner in = new Scanner(System.in);
     String deporte;
     boolean usaBalon;

      System.out.println("Ingrese un deporte");
      deporte = in.next();
      System.out.println("Utiliza balon?");
      usaBalon = Boolean.parseBoolean(in.next());

      Deportes depo = new Deportes(deporte, usaBalon);
      deportes.add(depo);
  }

}
