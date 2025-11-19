public class Producto {

    public static void main(String[] args) {
        String nombre = "Auriculares Bluetooth";
        float precio = 29.99f;
        Object codigo = "AUR-2023";
        boolean disponible = true;

        System.out.println("INFORMACIÓN DEL PRODUCTO");
        System.out.println("------------------------");
        System.out.println("Nombre: "+nombre);
        System.out.println("Precio: "+precio+"€");
        System.out.println("Código: "+codigo);
        System.out.println("Disponible: "+disponible);
    }
}
