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
public class NodoProceso {
    private String nombre;
    private int tiempoEjec;
    private int tiempoLlegada;
    private int tiempoInicio;
    private int tiempoFin;
    private int tiempoRest;
    private boolean ejecutado;
    private boolean llegada;
    private NodoProceso siguiente;
    
    public NodoProceso(String nombre, int tiempoEjec, int tiempoLlegada) {
        this.nombre = nombre;
        this.tiempoEjec = tiempoEjec;
        this.tiempoLlegada = tiempoLlegada;
        this.tiempoRest = this.tiempoEjec;
        this.ejecutado = false;
        this.llegada = false;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getTiempoEjec() {
        return tiempoEjec;
    }

    public void setTiempoEjec(int tiempoEjec) {
        this.tiempoEjec = tiempoEjec;
    }

    public int getTiempoLlegada() {
        return tiempoLlegada;
    }

    public void setTiempoLlegada(int tiempoLlegada) {
        this.tiempoLlegada = tiempoLlegada;
    }

    public int getTiempoInicio() {
        return tiempoInicio;
    }

    public void setTiempoInicio(int tiempoInicio) {
        this.tiempoInicio = tiempoInicio;
    }

    public int getTiempoFin() {
        return tiempoFin;
    }

    public void setTiempoFin(int tiempoFin) {
        this.tiempoFin = tiempoFin;
    }

    public int getTiempoRest() {
        return tiempoRest;
    }

    public void setTiempoRest(int tiempoRest) {
        this.tiempoRest = tiempoRest;
    }
    
    public void ActualizarTiempoRest(int quantum){
        this.tiempoRest-=quantum;
    }

    public boolean isEjecutado() {
        return ejecutado;
    }

    public void setEjecutado(boolean ejecutado) {
        this.ejecutado = ejecutado;
    }

    public NodoProceso getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoProceso siguiente) {
        this.siguiente = siguiente;
    }

    public boolean isLlegada() {
        return llegada;
    }

    public void setLlegada(boolean llegada) {
        this.llegada = llegada;
    }
    
    
}
