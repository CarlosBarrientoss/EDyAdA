package Listas_conceptos;

public class ListaSimple {

    Nodo cabeza;

    public ListaSimple() {

        cabeza = null;
    }


    /*INSERTAR AL INICIO*/
                              //[10][20][1]
    public void insertarInicio(int dato) {

        /*Insertar al inicio es O(1).*/
        //[10][20][1]
        Nodo nuevo = new Nodo(dato);

        //[20]
        nuevo.siguiente = cabeza;

        //[10]->[20]->[1]
        cabeza = nuevo;

    }




    /*INSERTAR AL FINAL*/
                          //[100][1000][10000][1]
    public void insertarFinal(int dato) {
        //[1]
        Nodo nuevo = new Nodo(dato);

        if (cabeza == null) {
            //[100]
            cabeza = nuevo;
        } else {

            //[100]
            Nodo actual = cabeza;

              //
             while (actual.siguiente != null) {
                //[10000]
                actual = actual.siguiente;
            }
                //[1]
            actual.siguiente = nuevo;
        }

    }


    /*RECORRER LA LISTA*/

    public void recorrer() {
            //[100]
        Nodo actual = cabeza;

        while (actual != null) {

            System.out.print(actual.dato + " -> ");

            actual = actual.siguiente;

        }

        System.out.println("null");

    }

    /*BUSCAR EN LA LISTA*/ //[1]
    public boolean buscar(int valor) {
            //[100]
        Nodo actual = cabeza;

        while (actual != null) {

            if (actual.dato == valor) {
                return true;
            }

            actual = actual.siguiente;
        }

        return false;
    }

    /*ELIMINAR DE LA LISTA*/
                           //[100]
    public void eliminar(int valor) {
            //[100]
        Nodo actual = cabeza;
        //[null]
        Nodo anterior = null;

        while (actual != null) {
                    //[100] == [100]
            if (actual.dato == valor) {

                if (anterior == null) {
                    cabeza = actual.siguiente;
                } else {
                    //
                    anterior.siguiente = actual.siguiente;
                }

                return;
            }
            //[]
            anterior = actual;
            //[]
            actual = actual.siguiente;
        }

    }
}
