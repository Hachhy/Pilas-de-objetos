
package pilas_Listas;


public class cNodo {
    int dato;
    cNodo siguiente;
    
    public cNodo(int dato,cNodo siguiente){
    this.dato=dato;
    this.siguiente=siguiente;
    }
    public cNodo(){
        dato=0;
        siguiente=null;
    }
    public int getDato(){
        return dato;
    }
    public void setDato(int dato){
        this.dato=dato;
    }
    public cNodo getSiguiente(){
        return siguiente;
    }
    public void setSiguiente(cNodo siguiente){
        this.siguiente=siguiente;
    }
}
