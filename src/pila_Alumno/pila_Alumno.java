
package pila_Alumno;
import java.util.Scanner;

public class pila_Alumno {
    
    alumno cabeza;
    int tope;
    int max;
    Scanner sc=new Scanner(System.in);
    
    
   
    
    public pila_Alumno(){
           this.tope=0;
          
        }
    
    public void push(){
        
        alumno nuevo=new alumno();
        {System.out.print("Ingrese  Codigo: ");
        int cod=sc.nextInt();
        nuevo.setCodigo(cod);        
        sc.nextLine();
        System.out.print("Ingrese Nombre: ");
        String nom=sc.nextLine();
        nuevo.setNombre(nom);
        double n1=0;
        do{
        System.out.print("Ingrese Nota 1: ");
        n1=sc.nextDouble();}while(n1<0 || n1>20);        
        nuevo.setN1(n1);
        double n2=0;
        do{
        System.out.print("Ingrese Nota 2: ");
        n2=sc.nextDouble();}while(n2<0 || n2>20);
        nuevo.setN2(n2);
        
        if(isPilaVacia()){
            cabeza=nuevo;            
        }else{
            nuevo.setSiguiente(cabeza);
            cabeza=nuevo;
        }tope++;
            System.out.println("Insertando..."); }       
    }
    public boolean isPilaVacia(){
        return cabeza==null;
    }
    
    public void pop(){
        if(isPilaVacia()){
            System.out.println("La pila esta vacia");
        }else{
            alumno temp=cabeza;
            temp=temp.getSiguiente();
            cabeza=temp;
            System.out.println("Elemento eliminado");
        }
    }  
   
    public void mostrar(){
        alumno temp=cabeza;
        if(isPilaVacia()){
            System.out.println("La pila esta vacia");
        }else{
            System.out.println("\n");
            temp.encabezado();
            while(temp!=null){
            temp.mostrar();
            temp=temp.getSiguiente();
            }System.out.println("\n");
        }        
    }
    
    public void clean(){
        if(isPilaVacia()){
            System.out.println("La pila esta vacia");
        }else{
            cabeza=null;
            System.out.println("Se Elimino todos los datos");
        }
    }
}
