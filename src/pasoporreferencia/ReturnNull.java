package pasoporreferencia;

import clases.Persona;

public class ReturnNull {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Joel";
        System.out.println("persona1 nombre = " + persona1.nombre);
        persona1 = cambiaValor(persona1);
        System.out.println("persona1 cambio nombre = " + persona1.nombre);
    }

    public static Persona cambiaValor(Persona persona){
        if(persona == null){
            return null;
        }
        persona.nombre = "Jorge";
        return persona;
    }
}
