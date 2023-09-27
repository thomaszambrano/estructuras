import java.util.*;
public class ColaConPrioridades {
    public static void main(String[] args) {
        PriorityQueue<elemento> colaPrioridades = new PriorityQueue<>(new ComparadorporPrioridad());

        // aqui ingreso los diferentes datos a la cola para poderlos ordenar
        colaPrioridades.add(new elemento("Thomas", 'B'));
        colaPrioridades.add(new elemento("Samuel", 'C'));
        colaPrioridades.add(new elemento("Carlos", 'A'));
        colaPrioridades.add(new elemento("Miguel", 'B'));
        colaPrioridades.add(new elemento("Luciana", 'C'));
        colaPrioridades.add(new elemento("Pedro", 'A'));
        colaPrioridades.add(new elemento("Carolina", 'C'));
        colaPrioridades.add(new elemento("esteban", 'B'));
        colaPrioridades.add(new elemento("Laura", 'A'));
        colaPrioridades.add(new elemento("David", 'B'));

        // Muestra la cola ordenada por prioridades
        System.out.println("Nombre\tPrioridad");
        while (!colaPrioridades.isEmpty()) {
            System.out.println(colaPrioridades.poll());
        }
    }
}

class elemento{
    String nombre;
    char prioridad;

    public elemento(String nombre, char prioridad){
        this.nombre = nombre;
        this.prioridad = prioridad;

    }
    public String toString(){
        return nombre + " " + prioridad;
    }
}

class ComparadorporPrioridad implements Comparator<elemento>{

    @Override
    public int compare(elemento e1, elemento e2) {
        if (e1.prioridad == 'A'){
            return -1;
        } else if (e1.prioridad == 'B' && e2.prioridad != 'A') {
            return -1;
        } else if (e1.prioridad == 'C' && e2.prioridad != 'A' && e2.prioridad != 'B') {
            return -1;
        } else {
            return 1;
        }
    }

        }



