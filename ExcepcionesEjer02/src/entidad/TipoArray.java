/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Usuario
 */
public class TipoArray {

    int[] miArray;

    public TipoArray() {
    }

    public TipoArray(int[] miArray) {
        this.miArray = miArray;
    }

    public int[] getMiArray() {
        return miArray;
    }

    public void setMiArray(int[] miArray) {
        this.miArray = miArray;
    }

    @Override
    public String toString() {
        return "TipoArray{" + "miArray=" + miArray + '}';
    }

}
