/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TareasED;

public class Nodoble<T> {

    private T datos;
    private Nodoble<T> Sig;
    private Nodoble<T> ant;


    public Nodoble() { 
    }

    public Nodoble(T dato) { 
        this.datos = dato;
    }

    public Nodoble(T dato, Nodoble<T> Sig, Nodoble<T> Ant) {
         this.Sig = Sig;
       this.datos = dato;
        this.ant = Ant;
    }

//Métodos de acceso
    public Nodoble<T> getSig() {
        return Sig;
    }

    public void setSig(Nodoble<T> Sig) {
        this.Sig = Sig;
    }
    
    public Nodoble<T> getant(){
        return ant;
    }
    
    public void setant(Nodoble<T> Ant){
        this.ant = Ant;
    }

    public T getDato() {
        return datos;
    }

    public void setDato(T dato) {
        this.datos = dato;
    }

    //toString()
    @Override
    public String toString() {
        return "|" + datos + "| - ";
    }

    public String mostrarTodo() {
        return "[anterior: "+ this.getant() + "] - [Dato= " + datos + "] - [siguiente= " + this.getSig() + "]";
    }
}