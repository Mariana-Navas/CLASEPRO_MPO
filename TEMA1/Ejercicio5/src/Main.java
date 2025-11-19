public class Main {

    public static void main(String[] args){

        final String app = "MiApp";
        Object version = "1.0.0";
        final double PI = 3.14159;
        String user1 = "Laura";
        int nivelUser1 = 1;
        int puntuacionUser1 = 0;

        System.out.println("Aplicación: "+app);
        System.out.println("Versión: "+version);
        System.out.println("Valor de PI: "+PI);
        System.out.println("Usuario actual: "+user1);
        System.out.println("Nivel: "+nivelUser1);
        System.out.println("Puntuación: "+puntuacionUser1);

        user1 = "Miguel";
        nivelUser1 = 2;
        puntuacionUser1 = 150;

        System.out.println("Usuario actualizado: "+user1);
        System.out.println("Nivel actualizado: "+nivelUser1);
        System.out.println("Puntuación actualizada: "+puntuacionUser1);

    }


}
