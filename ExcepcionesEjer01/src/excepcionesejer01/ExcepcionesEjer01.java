package excepcionesejer01;

import servicio.Todo;

public class ExcepcionesEjer01 {

    public static void main(String[] args) throws Exception {
        try {
            Todo miTodos = new Todo();
            miTodos.todo();
            miTodos.mostrar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
