public class Entrada {

    public static void main(String[] args) {
        int base = 5;
        int altura = 3;

        System.out.println("Base del rectángulo: "+base);
        System.out.println("Altura del rectángulo: "+altura);

        Area areaRectangulo = new Area();
        areaRectangulo.calculoArea(base,altura);
    }

}
