package clases_Cpila;
import java.util.Scanner;

public class Cpila {

    static Scanner sc = new Scanner(System.in);
    int tope;
    int[] pila;
    int max;

    public Cpila() {
        this.tope = 0;
        this.max = 100;
        this.pila = new int[this.max + 1];
    }

    public Cpila(int MAX) {
        this.max = MAX;
        this.pila = new int[this.max + 1];
    }

    public int getTope() {
        return tope;
    }

    public void vaciarPila() {
        this.tope = 0;
    }

    public boolean isPilaLlena() {
        if (this.max == this.tope) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPilaVacia() {
        if (this.tope == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean elementosPila() {
        if (this.tope > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void insertarPila() {
        if (this.isPilaLlena()) {
            System.out.println("La pila esta LLena");
        } else {
            int item;
            System.out.print("Ingrese el elemento : ");
            item = sc.nextInt();
            this.pila[this.tope] = item;
            this.tope++;
            System.out.println("El item " + item + "se inserto a la Pila\n");
        }
    }

    public void eliminarPila() {
        if (this.isPilaVacia()) {
            System.out.println("La pila esta vacia");
        } else {
            int item = this.pila[this.tope - 1];
            this.tope--;
            System.out.print("El item " + item + " se elimino de la Pila");
        }
    }

    public void mostrarPila() {
        if (this.isPilaVacia()) {
            System.out.println("La pila esta vacia, no hay datos para mostrar");
        } else {
            System.out.println("\t Elementos de la Pila");
            System.out.println("***************************");
            for (int i = (this.tope - 1); i >= 0; i--) {
                System.out.println(this.pila[i] + " <-- ");
            }
        }
    }
}
