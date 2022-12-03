/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.TipoArray;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ArrayServicio {

    public TipoArray crearArray() {
        TipoArray miArray = new TipoArray();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el tamaño del array");
        int numero = leer.nextInt();
        int[] array = new int[numero];

        int x;

        for (int i = 0; i < array.length; i++) {
            x = i + 1;
            System.out.printf("Ingrese el %d° numero \n", x);
            array[i] = leer.nextInt();
        }

        miArray.setMiArray(array);
        return miArray;
    }

    public void mostrar(TipoArray a) {
        System.out.println(a.toString());
    }

    public void mostrarError(TipoArray a, int numero) {
        int[] array = a.getMiArray();
        System.out.println("------------");
        for (int i = 0; i < numero; i++) {
            System.out.println(array[i]);
        }
    }

}
