package Listas_doblemente_enlazada;

public class ListaDoblemente {

    Nodo cabeza;

    /*insertar nodos*/
    public void insertarInicio(int dato) {
                        //100 - 200
        Nodo nuevo = new Nodo(dato);

        //[anterior | dato | siguiente]
        //[ null    |  100 | null ]

        if (cabeza != null) {
            cabeza.anterior = nuevo;
            nuevo.siguiente = cabeza;
        }

        cabeza = nuevo;
    }



    /*Recorrer lista hacia adelante*/
    public void recorrer() {

        Nodo actual = cabeza;

        while (actual != null) {

            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;

        }

    }

    /*Recorrer la lista hacia atrás*/
    public void recorrerAtras() {

        Nodo actual = cabeza;

        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }

        while (actual != null) {

            System.out.print(actual.dato + " <- ");
            actual = actual.anterior;

        }

    }


}
