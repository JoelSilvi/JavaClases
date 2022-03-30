package operaciones;

public class Aritmetica {
    // Atributos de la clase
    int a;
    int b;

    //Constructor vacío
    public Aritmetica(){
        System.out.println("Ejecutando constructor");
    }

    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructor con argumentos");
    }

    //Método
    public void sumar(){
        int resultado = this.a + this.b;
        System.out.println("metodo sumar = " + resultado);
    }

    public int sumarConRetorno(){
       return this.a + this.b;
    }

    public int sumarConArgumentos(int a, int b){
        this.a = a; //El argumento a se asigna al atributo this.a
        this.b = b;
//        return a + b;
        return this.sumarConRetorno();
    }
}