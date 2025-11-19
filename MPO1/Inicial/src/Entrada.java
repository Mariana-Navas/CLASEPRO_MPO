public class Entrada {

    public static void main(String[] args) {
        System.out.println("Ejecución de métodos");

        saludar("Cristina");
        saludar("Mariana");
        despedir("Cristina");
        despedir("Mariana");


        System.out.println("Ahora vamos a practicar con algunas operaciones matemáticas:");
        Operaciones operacionesMatematicas = new Operaciones();
        operacionesMatematicas.sumar(2,3);
        operacionesMatematicas.restar(8,4);


    }

    public static void saludar(String nombre){
        System.out.println("Hola "+nombre);
        System.out.println("Este método se va a repetir en el saludo");
    }

    public static void despedir(String nombre){
        System.out.println("Hasta luego "+nombre);
        System.out.println("Mañana más y mejor...");
    }
}
