package servicio;

import entidad.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class Todo {

    int contMayor = 0;
    int contMenor = 0;
    int contIdeal = 0;
    int contArribaIdeal = 0;
    int contAbajoIdeal = 0;
    int per = 0;

    public ArrayList<Persona> todo() throws Exception {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PersonaServicio miPer1 = new PersonaServicio();
        System.out.println("Cuantas personas son:");
        String per2 = leer.next();
        int cont2 = 0;
        ArrayList<Persona> miArray = new ArrayList();
        if (per2.equalsIgnoreCase("")) {
            throw new Exception("La lista no puede estar vacia. EJECUCION TERMINADA");
        } else {
            per = Integer.parseInt(per2);
        }
        if (per == 0) {
            throw new Exception("La lista no puede estar vacia. EJECUCION TERMINADA");
        } else {
            while (cont2 != per) {
                if (miArray.size() < per) {
                    cont2 = cont2 + 1;
                    Persona miPersona = miPer1.crearPersona();
                    miArray.add(miPersona);
                    System.out.println("------------------------ ");
                    if (miPer1.esMayorDeEdad(miPersona) == true) {
                        contMayor = contMayor + 1;
                    } else {
                        contMenor = contMenor + 1;
                    }
                    double valor = miPer1.calcularIMC(miPersona);
                    switch ((int) valor) {
                        case -1:
                            contAbajoIdeal = contAbajoIdeal + 1;
                            break;
                        case 1:
                            contArribaIdeal = contArribaIdeal + 1;
                            break;
                        case 0:
                            contIdeal = contIdeal + 1;
                            break;
                        default:
                            break;
                    }
                    miPer1.informacion(miPersona);
                    System.out.println("------------------------ ");
                }
            }
            System.out.println("SE COMPLETARON LA CANTIDAD DE PERSONAS INGRESADAS");
        }
        return miArray;
    }

    public void mostrar() {
        System.out.println("*********************");
        System.out.println("La cantidad de personas mayores es: " + contMayor);
        System.out.println("La cantidad de personas menores es: " + contMenor);
        System.out.println("La cantidad de personas en su peso idea es: " + contIdeal);
        System.out.println("La cantidad de personas por arriba de su peso ideal es: " + contArribaIdeal);
        System.out.println("La cantidad de personas por abjo de su peso ideal es: " + contAbajoIdeal);
        double porcentaje = contMayor * 100 / per;
        System.out.println("El porcentaje de personas mayores de edad es: " + porcentaje + "%");
        porcentaje = contMenor * 100 / per;
        System.out.println("El porcentaje de personas menores de edad es: " + porcentaje + "%");
    }
}