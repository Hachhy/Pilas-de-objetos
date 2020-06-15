
package pila_Alumno;

import java.util.Scanner;

public class mainAlumno {   
    static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args){
        menu();
    }
    
    static void menu(){
        int opcion;
        pila_Alumno pA=new pila_Alumno();
        
        do{
        System.out.println("*******************************");
        System.out.println("*\tPila Alumnos          *");
        System.out.println("*******************************");
        System.out.println("* 1.- Ingresar Dato           *");
        System.out.println("* 2.- Borrar Dato             *");
        System.out.println("* 3.- Mostrar Pila            *");
        System.out.println("* 4.- Vaciar Pila             *");
        System.out.println("* 0.- Salir                   *");
        System.out.println("*******************************");
        System.out.print("Ingrese opcion: ");
        opcion=sc.nextInt();        
        
        switch(opcion){
            case 1:
                pA.push();
                break;
            case 2:
                pA.pop();
                break;
            case 3:
                pA.mostrar();
                break;
            case 4:
                pA.clean();
            case 0:
                break;
            default:
                System.out.println("No es una Opcion");
                break;       
        }
        
        }while (opcion!=0);
        
        
        
    }

}
    
