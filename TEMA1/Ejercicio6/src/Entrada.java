public class Entrada {

    public static void main(String[] args) {
        int op1 = 10;
        int op2 = 5;

        System.out.println("Número 1: "+op1);
        System.out.println("Número 2: "+op2);

        Operaciones operacionesMatematicas = new Operaciones();
        operacionesMatematicas.sumar(op1,op2);
        operacionesMatematicas.restar(op1,op2);
        operacionesMatematicas.multiplicar(op1,op2);
        operacionesMatematicas.dividir(op1,op2);
    }
}
