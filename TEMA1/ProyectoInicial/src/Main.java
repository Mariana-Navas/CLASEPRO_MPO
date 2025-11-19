import java.sql.SQLOutput;

public class Main {

    //Esto es un comentario simple

    /*
    esto es un comentario
    en varias líneas
    de código
     */

    //TODO Esto es un comentario resaltado con "TODO"

    public static void main(String[] args){
        System.out.println("Este es mi primer programa en Java :)");
        System.out.println("Esta es mi segunda línea de Java ever :O\n");
        // Si quiero hacer un salto de línea puedo usar \n dentro de la frase entrecomillada
        String miNombre = "Mariana";
        char letraDNI = 'g';
        int edad = 42;
        double altura = 1.63;
        float peso = 58.9f;
        boolean experiencia = true;

        final String DNI = "74693010G";
        // la variable final es inmutable y no se puede cambiar su valor. Se escribe con todas las letras en MAYUSCULA_OTRAPALABRA

        // para cambiar el valor de las variables (mutables) puedo reescribir el valor:

        miNombre = "Mariana Navas";
        letraDNI = 'G';

        System.out.println("Mi nombre es "+miNombre);
        System.out.println("La letra de mi DNI es "+letraDNI);
        System.out.println("Mi edad es "+edad);
        System.out.println("Mi altura es "+altura+" y mi peso es "+peso+" kgs.");
        System.out.println("Mi experiencia es "+experiencia);
        System.out.println("Mi DNI es "+DNI);

    }


    public void nombreMetodo (){


    }

}
