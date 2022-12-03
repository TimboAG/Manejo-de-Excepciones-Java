/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionesejer02;

import entidad.TipoArray;
import java.util.InputMismatchException;
import java.util.Scanner;
import servicio.ArrayServicio;

/**
 *
 * @author Usuario
 */
public class ExcepcionesEjer02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            ArrayServicio miServicio = new ArrayServicio();
            TipoArray miNuevoArray = miServicio.crearArray();
            Scanner leer = new Scanner(System.in).useDelimiter("\n");

            miServicio.mostrar(miNuevoArray);

            System.out.println("Ingrese un tamaño mayor al array");
            int mayor = leer.nextInt();

            miServicio.mostrarError(miNuevoArray, mayor);

        } catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }

}
