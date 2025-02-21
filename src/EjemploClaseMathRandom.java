import java.util.Random;

public class EjemploClaseMathRandom {

    public static void main(String[] args) {

        String [] colores = {"azul","amarillo","rojo","verde","blanco","negro"};
        double random = Math.random();
        System.out.println("random = " + random);

        random *= colores.length;
        System.out.println("random = " + random);

        random = Math.floor(random);
        System.out.println("random = " + random);

        System.out.println("Colores = " +colores[(int)random] );

        Random rnd = new Random();

        int randomInt = rnd.nextInt(25);

        System.out.println("randomInt = " + randomInt);

        randomInt = rnd.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores = " + colores[randomInt]);
    }
}
