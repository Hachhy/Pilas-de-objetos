
package pilas_Listas;
import java.util.Random;

public class pilaLista {
    cNodo cabeza;
    int tope;
    int max;
    private final Random num =new Random();
    
    public pilaLista(){
        this.tope=0;
    }
    public void insertarPila(){
        cNodo nuevo=new cNodo();
        nuevo.setDato(generarNumero());
        
        if(isPilaVacia()){
            cabeza=nuevo;}
        else{
            nuevo.setSiguiente(cabeza);
            cabeza=nuevo;
        }
        tope++;
        System.out.println("\nElemento de la Pila insertado... ");
    }
    public int generarNumero(){
        int nu;
        nu=num.nextInt(90)+10;
        return nu;
    }
    public boolean isPilaVacia(){
        return cabeza==null;
        }
    public void mostrarPila(){
    cNodo temp=cabeza;
    if(isPilaVacia()){
    System.out.println("Pila Vacia");
    }else{
        System.out.println("\nElementos de la Pila");
        System.out.println("==============================");
        while(temp!=null){
            System.out.println("{ "+temp.getDato()+" }");
            temp=temp.getSiguiente();
        }
    }
    }
    public void eliminaDatos(){
    if(this.isPilaVacia()){
        System.out.println("\nLa pila esta vacia");
    }else{
        cNodo temp=cabeza;
        temp=temp.getSiguiente();
        cabeza=temp;
        System.out.println(temp.getDato()+"Se elimino ");
    }
    }
    public void eliminaPila(){
    if(this.isPilaVacia()){
        System.out.println("\nLa pila esta vacia");
    }else{
        cabeza=null;
        System.out.println("\nSe elimino la Pila");
    }
    }
    
}
