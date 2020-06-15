# Pilas-de-objetos
//CLASE ALUMNO
package pila_Alumno;


public class alumno {
    alumno siguiente;
    private int codigo;
    private String nombre;
    private double n1,n2;
    private double promedio=0;
    
    public alumno(){
    this.siguiente=null;
    this.codigo=0;
    this.nombre="";
    this.n1=0;
    this.n2=0;
    }
    public void alumno(int cod,String nom,double n1,double n2,alumno sig){
    this.codigo=cod;
    this.nombre=nom;
    this.n1=n1;
    this.n2=n2;
    this.siguiente=sig;
    }
    public alumno getSiguiente(){
        return siguiente;
    }
    public void setSiguiente(alumno sig){
        this.siguiente=sig;    
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getPromedio() {
        double prom=(n1+n2)/2.0;
        this.promedio=prom;
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    public void mostrar(){
        
    System.out.println(codigo+"\t"+nombre+"\t\t"+n1+"\t"+n2+"\t"+getPromedio());
    }
    public void linea(){
    System.out.println("***********************************************************");  
    }
    public void encabezado(){
    linea();
    System.out.println("\tDatos de Alumnos");
    linea();
    System.out.println("CODIGO\tNOMBRE\t\tNOTA 1\tNOTA 2\tPROMEDIO");
    linea();
    }
    

}
