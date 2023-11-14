/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmoSJF;
import AlgoritmoRR.NodoProceso;
/**
 *
 * @author LUIS
 */
public class ShortestJobFirst {
    private NodoProceso primero;
    
    public ShortestJobFirst(){
        primero = null;
    }
    
    public void agregarProceso(NodoProceso nuevoproceso){
        if (primero == null) {
            primero = nuevoproceso;
        } else {
            NodoProceso actual = primero;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoproceso);
        }
    }
    
    public NodoProceso obtenerProcesoMasCorto(int tiempoActual) {
        if (primero == null) {
            return null;
        }

        NodoProceso actual = primero;
        NodoProceso procesoMasCorto = actual;

        while (actual != null) {
            if(actual.getTiempoLlegada() < tiempoActual){
                if (actual.getTiempoEjec() < procesoMasCorto.getTiempoEjec() ||
                (actual.getTiempoLlegada() == procesoMasCorto.getTiempoLlegada() && actual.getTiempoEjec() < procesoMasCorto.getTiempoEjec())) {
                    procesoMasCorto = actual;
                }
            }
            actual = actual.getSiguiente();
        }

        return procesoMasCorto;
    }
    
    public void eliminarProceso(NodoProceso proceso) {
        if (primero == null) {
            return;
        }

        if (primero == proceso) {
            primero = primero.getSiguiente();
            return;
        }

        NodoProceso actual = primero;
        while (actual.getSiguiente() != null && actual.getSiguiente() != proceso) {
            actual = actual.getSiguiente();
        }

        if (actual.getSiguiente() != null) {
            actual.setSiguiente(actual.getSiguiente().getSiguiente());
        }
    }

    public boolean estaVacía() {
        return primero == null;
    }
    
    public int contador(){
        int conta = 0;
        if(primero != null){
            NodoProceso procesoconta = primero;
            while(procesoconta != null){
                procesoconta = procesoconta.getSiguiente();
                conta++;
            }
        }
        return conta;
    }
    
    public NodoProceso getNext(){
        return primero.getSiguiente();
    }
    
    public NodoProceso getPrimero(){
        return primero;
    }
}
