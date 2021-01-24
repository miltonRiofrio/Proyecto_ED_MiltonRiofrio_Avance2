/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.ListaDoble;

/**
 *
 * @author Milton Riofrio
 */
public class ListaDoble {

    protected NodoDE cabecera;

    public ListaDoble() {
        this.cabecera = null;
    }

    public boolean estaVacia() {
        return (this.cabecera == null);
    }

    public void insertar(String dato) {

        if (estaVacia()) {
            NodoDE tmp = new NodoDE(dato, null, null);
            cabecera = tmp; 
        } else {
            NodoDE tmp = new NodoDE(dato, null, null); 
            NodoDE aux = cabecera;
            tmp.setSig(aux);   
            aux.setAnt(tmp);
            cabecera = tmp;    
        }
    }

    public void verDato() {
        if (!estaVacia()) {
            NodoDE tmp = cabecera;
            while (tmp != null) {
                System.out.println(tmp.getDato());
                if (tmp.getAnt() != null) {
                    System.out.println("--- " + tmp.getAnt().getDato() + " ---");
                }
                tmp = tmp.getSig();
            }
        }
    }

    public Object verDatoPos(int pos) {
        String dato = null;
        if (!estaVacia() && pos >= 0 && (pos <= tamano() - 1)) {
            NodoDE tmp = cabecera;
            for (int i = 0; i < pos; i++) {
                tmp = tmp.getSig();
                if (tmp == null) {
                    break; 
                }
            }
            dato = (tmp != null) ? tmp.getDato() : null;
        } else {
            if (pos < 0 || (pos > tamano() - 1)) {
                throw new IndexOutOfBoundsException("Fuera de rango");
            }
        }
        return dato;
    }

    public int tamano() {
        int tamano = 0;
        if (!estaVacia()) {
            NodoDE tmp = cabecera;
            while (tmp != null) {
                tamano++;
                tmp = tmp.getSig();
            }
        }
        return tamano;
    }

    public Object obtenerPorPosicion(int pos) {
        Object aux = null;
        if (estaVacia() || pos < 0) {
            System.out.println("Vacio");

        } else if (pos > tamano() - 1) {

            throw new ArrayIndexOutOfBoundsException("Fuera de Rango");
        } else if (pos == 0) {
            aux = verDatoPos(pos);
        } else {
            NodoDE iterador = cabecera;
            for (int i = 1; i < pos; i++) {
                if (iterador.getSig().getSig() == null) {
                    break;
                }
                iterador = iterador.getSig();
            }
            aux = iterador.getSig().getDato();
        }
        return aux;
    }

    public String buscarPorDato(String dato) {
        String auxdato = null;
        if (!estaVacia() && dato != null) {
            NodoDE iterador = cabecera;
            for (int i = 0; i < tamano(); i++) {
                if (iterador.getDato().equals(dato)) {
                    auxdato = iterador.getDato();
                    auxdato = auxdato + " en la posicion: " + i;
                    break;
                } else if (!iterador.getDato().equals(dato) && i == tamano() - 1) {
                    throw new ArrayIndexOutOfBoundsException("Dato Erroreo");
                }
                iterador = iterador.getSig();
            }
        } else {
            System.out.println("Vacio");
        }
        return auxdato;
    }

    public void editarPorPos(int pos, String dato) {
        if (pos >= 0 && pos < tamano()) {
            if (pos == 0) {
                cabecera.setDato(dato);
            } else {
                NodoDE aux = cabecera;
                for (int i = 0; i < pos; i++) {
                    aux = aux.getSig();
                }
                aux.setDato(dato);
            }
        } else {
            System.out.println("Fuera de rango");
        }
    }

    public void insertar(String dato, int pos) {
        if (estaVacia() || pos <= 0) {
            insertar(dato);
        } else {
            NodoDE iterador = this.cabecera;
            for (int i = 1; i < pos; i++) {
                if (iterador.getSig() == null) {
                    break;
                }
                iterador = iterador.getSig();
            }
            NodoDE tmp = new NodoDE(dato, iterador.getSig(), iterador);
            iterador.setSig(tmp);
            iterador = iterador.getSig();
            for (int i = pos; i < tamano()-1; i++) {
                iterador = iterador.getSig();
                iterador.setAnt(tmp);
                tmp = tmp.getSig();
            }
        }
    }

    public void insertarFinal(String dato) {
        insertar(dato, tamano());
    }

    public void eliminarPorPos(int pos) {
        if (!estaVacia()) {
            if (pos < 0) {
                System.out.println("Debe ser una posicion mayor a cero");
            } else {
                if (pos == 0) {
                    cabecera = cabecera.getSig();
                    cabecera.setAnt(null);
                } else if (pos <= (tamano() - 1)) {
                    NodoDE aux = cabecera;
                    for (int i = 0; i < pos - 1; i++) {
                        aux = aux.getSig();
                    }
                    NodoDE siguiente = aux.getSig();
                    aux.setSig(siguiente.getSig());
                    if (aux.getSig() != null) {
                        aux.getSig().setAnt(siguiente.getAnt());
                    }
                } else {
                    System.out.println("No se elimino");
                }
            }
        } else {
            System.out.println("Lista Vacia");
        }
    }

    public void eliminarPorDato(String dato) {
        if (buscarPorDato(dato) != null) {  
            if (cabecera.getDato().equals(dato)) {
                cabecera = cabecera.getSig();
                cabecera.setAnt(null);
            } else {
                NodoDE aux = cabecera;
                while (!(aux.getSig().getDato().equals(dato))) {   
                    aux = aux.getSig();
                }
                NodoDE siguiente = aux.getSig().getSig();
                aux.setSig(siguiente);
                if (aux.getSig() != null) {
                    aux.getSig().setAnt(siguiente.getAnt().getAnt());
                }
            }
        } else {
            System.out.println("No existe el dato a eliminar");
        }
    }
}
