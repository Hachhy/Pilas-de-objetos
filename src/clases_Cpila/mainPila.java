package clases_Cpila;
import java.util.Scanner;

public class mainPila {

    static Scanner sc = new Scanner(System.in);
    public static Cpila pila;
    public static int tam;

    public static void main(String[] args) {
        menuPila();
    }

    static void creaPila() {

        System.out.print("Ingrese tamaño de la Pila: ");
        tam = sc.nextInt();
        pila = new Cpila(tam);
        System.out.println("Pila creada... \n");
    }

    public static void menuPila() {
        int Opcion, opcion;
        do {
            System.out.println("*********************************");
            System.out.println("\tMenu de opciones");
            System.out.println("*********************************");
            System.out.println("1.- Crear Pila");
            System.out.println("*********************************");
            System.out.println("2.- Ingresar Datos - (Apilar)");
            System.out.println("3.- Eliminar Datos - (Desapilar)");
            System.out.println("4.- Mostrar Pila");
            System.out.println("5.- Eliminar Pila");
            System.out.println("6.- Comprobar estado de la Pila");
            System.out.println("7.- Obtener dato de la cima");
            System.out.println("8.- Ver tamaño de la Pila");
            System.out.println("**********************************");
            System.out.println("0.- Salir");

            System.out.print("Ingrese una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    creaPila();
                    break;
                case 2:
                    pila.insertarPila();
                    break;
                case 3:
                    pila.eliminarPila();
                    break;
                case 4:
                    pila.mostrarPila();
                    break;
                case 5:
                    pila.vaciarPila();
                    System.out.println("\n");
                    break;
                case 6:
                    if (pila.isPilaLlena()) {
                        System.out.println("La pila esta LLena");
                    }
                    if (pila.isPilaVacia()) {
                        System.out.println("La pila esta vacia");
                    }
                    if (pila.elementosPila()) {
                        System.out.println("La pila tiene elementos");
                    }
                    break;
                case 7:
                    int TOPE = pila.getTope();
                    System.out.println("Elemento Cima: " + pila.pila[TOPE - 1]);
                    break;
                case 8:
                    System.out.println("Numero de elementos maximos para la Pila: " + tam);
                    break;
                case 0:
                    System.out.println("Saliendo del Systema...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta...");
                    System.out.print("\n");
            }
        } while (opcion != 0);
    }
}
