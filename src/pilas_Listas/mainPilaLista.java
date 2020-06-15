
package pilas_Listas;

import java.util.Scanner;


public class mainPilaLista {
    static Scanner sc=new Scanner(System.in);
    
    public static void main(String[]args){
    menu();
    }
    static void menu(){
        int opcion;
        pilaLista lista=new pilaLista();
        
        do{
            System.out.println("\n============================");
            System.out.println("Menu de opciones");
            System.out.println("\n============================");
            System.out.println("1.- insertar pila");
            System.out.println("2.- mostrar lista");
            System.out.println("3.- eliminar elemento");
            System.out.println("4.- eliminar pila");
            System.out.println("============================");
            System.out.println("0.- salir");
            System.out.print("ingrese una opcion: ");
            opcion=sc.nextInt();
            
            switch(opcion){
                case 1: lista.insertarPila();
                    break;
                case 2: lista.mostrarPila();
                    break;
                case 3: lista.eliminaDatos();
                    break;
                case 4: lista.eliminaPila();
                    break;
                default:
                    if(opcion>2 & opcion<1)
                        System.out.println("Dato no valido");
                    break;
            }
        }while(opcion!=0);
    }
}
