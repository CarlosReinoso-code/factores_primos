package factoresPrimos;

import javax.swing.*;
import java.util.ArrayList;

public class FactoresPrimos {

    public static void main(String[] args) {

        // El n�mero de primos entre 2 y el n�mero && factorizaci�n del n�mero
        int x = Integer.parseInt(JOptionPane.showInputDialog("Introduzca n�mero")), posicion = 0, divisores, exponenteP;

        //ARRAYLIST DE N�MEROS PRIMOS

        ArrayList<Integer> primos = new ArrayList<>();

        for (int i = 2; i <= 379; i++) {

            divisores = 0;

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    divisores++;
                }

            }

            if (divisores == 0) {
                primos.add(i);
            }

        }

        for (Integer primo : primos) {
            System.out.println("Posicion [" + posicion + "] " + primo);
            posicion++;
        }

        System.out.println("\n");
        posicion = 0;

        //FACTORIZACI�N

        if (x == 1) {
            System.out.println(1);
        }

        while (x != 1) {

            exponenteP = 0;

            while (x % primos.get(posicion) == 0) {

                x /= primos.get(posicion);
                exponenteP++;

            }

            if (exponenteP != 0) {
                System.out.println(primos.get(posicion) + "^" + exponenteP);
            }

            posicion++;
        }

    }

}
