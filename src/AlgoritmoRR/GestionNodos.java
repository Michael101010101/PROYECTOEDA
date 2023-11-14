/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmoRR;
import AlgoritmoSJF.*;

/**
 *
 * @author LUIS
 */
public class GestionNodos {
    public NodoProceso root;
    
    public GestionNodos() {
        this.root = null;
    }
    
    public void insertar(NodoProceso nuevoNodo){
        nuevoNodo.setSiguiente(null);
        
        if(this.root == null){
            this.root = nuevoNodo;
        }
        else{
            NodoProceso ptr = root;
            while(ptr.getSiguiente() != null){
                ptr = ptr.getSiguiente();
            }
            ptr.setSiguiente(nuevoNodo);
        }
    }
    public void insertar2(NodoProceso nuevoNodo){        
        if(this.root == null){
            this.root = nuevoNodo;
        }
        else{
            NodoProceso ptr = root;
            while(ptr.getSiguiente() != null){
                ptr = ptr.getSiguiente();
            }
            ptr.setSiguiente(nuevoNodo);
        }
    } 
    
    public int contarElementos(){
        NodoProceso ptr = root;
        int conta = 0;
        while(ptr != null){
            conta++;
            ptr = ptr.getSiguiente();
        }
        
        return conta;
    }
    
    public void ordenarAscendente() {
        if (root == null || root.getSiguiente() == null) {
            // La lista está vacía o tiene un solo elemento, ya está ordenada
            return;
        }

        boolean intercambio;
        do {
            intercambio = false;
            NodoProceso actual = root;
            NodoProceso siguiente = root.getSiguiente();

            while (siguiente != null) {
                if (actual.getTiempoLlegada() > siguiente.getTiempoLlegada()) {
                    // Intercambiar los datos de los nodos
                    String nombretemp = actual.getNombre();
                    int tempEjec = actual.getTiempoEjec();
                    int tempLlegada = actual.getTiempoLlegada();
                    int tempInicio = actual.getTiempoInicio();
                    int tempFin = actual.getTiempoFin();
                    
                    actual.setNombre(siguiente.getNombre());
                    actual.setTiempoEjec(siguiente.getTiempoEjec());
                    actual.setTiempoLlegada(siguiente.getTiempoLlegada());
                    actual.setTiempoInicio(siguiente.getTiempoInicio());
                    actual.setTiempoFin(siguiente.getTiempoFin());
                    
                    siguiente.setNombre(nombretemp);
                    siguiente.setTiempoEjec(tempEjec);
                    siguiente.setTiempoLlegada(tempLlegada);
                    siguiente.setTiempoInicio(tempInicio);
                    siguiente.setTiempoFin(tempFin);

                    intercambio = true;
                }

                actual = siguiente;
                siguiente = siguiente.getSiguiente();
            }
        } while (intercambio);
    }
}
