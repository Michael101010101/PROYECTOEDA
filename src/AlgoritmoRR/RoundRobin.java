/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmoRR;


/**
 *
 * @author LUIS
 */
public class RoundRobin {
    private NodoProceso inicio;
    private NodoProceso fin;
    private int quantum;

    public int getQuantum() {
        return quantum;
    }

    public RoundRobin(int quantum) {
        inicio = null;
        fin = null;
        this.quantum = quantum;
    }
    
    public boolean estaVacia() {
        if(inicio == null && fin == null)
            return true;
        return false;
    }
    
    public void encolarProceso(NodoProceso nuevoproceso){
        if(estaVacia()) {
            inicio = nuevoproceso;
            fin = nuevoproceso;
        }
        else {
            fin.setSiguiente(nuevoproceso);
            fin = nuevoproceso;
        }
    }
    
    public NodoProceso desencolarProceso() {
        if(!estaVacia()) {
            NodoProceso elementoRetornar = inicio;
            
            if(inicio == fin) {
                inicio = null;
                fin = null;
            }
            else {
                inicio = inicio.getSiguiente();
            }
            return elementoRetornar;
        }
        else {
            return null;
        }
    }
    public int contarNodos(){
        int conta=0;
        NodoProceso actual = inicio;
        
        while(actual != null){
            conta++;
            actual = actual.getSiguiente();
        }
        return conta;
    }
    
    public String tiemposLlegada(int tiempoActual){
        NodoProceso actual = inicio;
        String log = "";
        while(actual!=null){
            if(!actual.isLlegada()){
                if(actual.getTiempoLlegada()<=tiempoActual && !actual.isEjecutado()){
                    actual.setLlegada(true);
                    log+="Tiempo "+actual.getTiempoLlegada()+": Llega el proceso "+actual.getNombre()+"\n";
                } else{
                    break;
                }
            }

            actual = actual.getSiguiente();
        }
        
        return log;
    }
}
