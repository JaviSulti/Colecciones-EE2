
package coo.ee2;

import coo.ee2.Entidades.CantanteFamoso;
import coo.ee2.Servicio.ServicioCantanteFamoso;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class COOEE2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        
        ArrayList<CantanteFamoso> cantantes = new ArrayList();

        System.out.println("Bienvenido al alamcenador de cantantes. Por favor, lea las instrucciones con cuidado.");

        ServicioCantanteFamoso scf = new ServicioCantanteFamoso();

        int i = 1;
        do {
            cantantes.add(scf.crearCantante(i));
            i++;
        } while (i < 6);

        scf.mostrarLista(cantantes);

        System.out.println("Elija la opcion que desea.");
        String accion = "si";
        do {
            System.out.println("1. Agregar un nuevo cantante.");
            System.out.println("2. Mostrar todos los cantantes.");
            System.out.println("3. Eliminar un cantante.");
            System.out.println("4. Salir del programa.");
            System.out.print("Opcion > ");
            int opc = teclado.nextInt();
            switch (opc) {
                case 1:
                    cantantes.add(scf.crearCantante(i));
                    i++;
                    System.out.print("Si desea realizar otra accion indique si. De lo contrario indique no > ");
                    accion = teclado.next().toLowerCase();
                    break;
                case 2:
                    scf.mostrarLista(cantantes);
                    System.out.print("Si desea realizar otra accion indique si. De lo contrario indique no > ");
                    accion = teclado.next().toLowerCase();
                    break;
                case 3:
                    scf.recorrerObjetos(cantantes);
                    System.out.print("Si desea realizar otra accion indique si. De lo contrario indique no > ");
                    accion = teclado.next().toLowerCase();
                    break;
                case 4:
                    System.out.println("Ud. ha salido del programa.");
                    ;
                    accion = "no";
                    break;
                default:
                    System.out.println("Ud. ha ingresado una opcion incorrecta. Por favor, intentelo nuevamente.");
                    ;
            }
        } while (accion.equals("si"));

        for (CantanteFamoso cantante : cantantes) {
            System.out.println(cantante);
        }
        
    }

}
