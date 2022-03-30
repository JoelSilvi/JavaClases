package operaciones;

public class sobrecargaConstructores {
    public static void main(String[] args) {

        //variables locales
        int a = 10;
        int b = 2;
        miMetodo();

        Aritmetica aritmetica1 = new Aritmetica();
        System.out.println("aritmetica1 a: " + aritmetica1.a);
        System.out.println("aritmetica1 b: " + aritmetica1.b);

        Aritmetica aritmetica2 = new Aritmetica(5,8);
        System.out.println("aritmetica2 a: " + aritmetica2.a);
        System.out.println("aritmetica2 b: " + aritmetica2.b);

        Aritmetica aritmetica3 = new Aritmetica();
        aritmetica3.a = 10;
        aritmetica3.b = 15;
        aritmetica3.sumar();
    }

    public static void miMetodo(){
            // la variable a no esta disponible fuera del metodo
//          a = 10;
        System.out.println("otro metodo");
    }
}
