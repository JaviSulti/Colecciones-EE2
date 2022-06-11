

package coo.ee2.Servicio;

import coo.ee2.Entidades.CantanteFamoso;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioCantanteFamoso {
    
    Scanner teclado = new Scanner(System.in).useDelimiter("\n");
    
    public CantanteFamoso crearCantante(int i){
        
        CantanteFamoso cf = new CantanteFamoso();
        System.out.print("Por favor, ingrese el nombre del cantante " + i + " > ");
        cf.setNombre(teclado.next());
        System.out.print("Por favor ingrese el nombre del disco mas vendido de " + cf.getNombre() + " > ");
        cf.setDiscoConMasVentas(teclado.next());
        
        return cf;
    }

    public void mostrarLista(ArrayList<CantanteFamoso> cantantes) {
        System.out.println("La lista de cantantes es:");
        for (CantanteFamoso cantante : cantantes) {
            System.out.println(cantante);
        }
    }

    public ArrayList recorrerObjetos(ArrayList cantantes) {
        System.out.print("Ingrese el nombre del cantante a eliminar > ");
        String eliminar = teclado.next();
        CantanteFamoso aux; //Cree un objeto auxiliar de la clase CantanteFamoso.
        for (int i = 0; i < cantantes.size(); i++) {
            aux = (CantanteFamoso) cantantes.get(i); //Aca inicializo el objeto dandole los diferentes valores de los objetos de la Lista que ha guardado los cantantes.
            if (aux.getNombre().equals(eliminar)) { //De este modo accedo a los nombres de los objetos de la lista que los contiene.
                cantantes.remove(i);
            }
        }
        return cantantes;
    }
    
}
