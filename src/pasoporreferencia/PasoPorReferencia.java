package pasoporreferencia;

import clases.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Joel";
        System.out.println("persona1 nombre = " + persona1.nombre);
        cambiaValor(persona1);
        System.out.println("persona1 nombre = " + persona1.nombre);
    }

    public static void cambiaValor(Persona persona){
        persona.nombre = "Jorge";
    }
}
