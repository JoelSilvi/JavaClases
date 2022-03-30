package operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 5;
        aritmetica1.b = 3;
        aritmetica1.sumar();

        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado desde clase prueba = " + resultado);

        resultado = aritmetica1.sumarConArgumentos(5,8);
        System.out.println("resultado con Argumentos = " + resultado);

    }
}
