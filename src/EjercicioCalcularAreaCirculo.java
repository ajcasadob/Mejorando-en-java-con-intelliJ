import java.util.Scanner;

public class EjercicioCalcularAreaCirculo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         double radio,resultado;

        System.out.println("¿Cual es el radio del círculo?");
        radio=Double.parseDouble(sc.nextLine());

        resultado= Math.pow(radio,2)*Math.PI;

        System.out.println("El resultado del area del circulo es "+resultado);



        sc.close();
    }
}
