package base;

import circulo.Circulo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ActividadCirculo {

    List<Circulo> circulos = new ArrayList<>();
    public static final Scanner leerTeclado = new Scanner(System.in);
    public static final int OPCION_SI = 1;
    public static final int OPCION_NO = 2;

    public static void main(String[] args) {
        ActividadCirculo app = new ActividadCirculo();
        app.start();

    }

    public void start() {
        int respuestaUsuario = 0;
        generarObjetosCirculo();
        respuestaUsuario = preguntaUsuario();
        if (respuestaUsuario == 1) {
            ordenarAscendente();
        } else {
            ordenarDescendente();
        }
        imprimirListaCirculos();

    }

    public double generarNumeroRadio() {
        return Math.random();
    }

    public void generarObjetosCirculo() {
        double radio = generarNumeroRadio();

        while (radio > 0.01) {
            circulos.add(new Circulo(radio));
            radio = generarNumeroRadio();
        }
    }

    public int preguntaUsuario() {
        int respuesta = 0;
        boolean error = true;
        do {
            System.out.println("¿Desea ordenador de forma Ascendente(1) o Descendente(2)?");
            System.out.println("1 = Ascendente");
            System.out.println("2 = Descendente");
            if (leerTeclado.hasNextInt()) {
                respuesta = leerTeclado.nextInt();
                error = respuesta != OPCION_SI && respuesta != OPCION_NO;
            } else {
                System.err.println("Debe introducir 1 o 2");
                leerTeclado.next();
            }
        } while (error);
        return respuesta;
    }

    public void ordenarAscendente() {
        Collections.sort(circulos);
    }

    public void ordenarDescendente() {
        Collections.sort(circulos, Collections.reverseOrder());
    }

    public void imprimirListaCirculos() {

        for (Circulo circulo : circulos) {
            System.out.println(circulo);
        }

    }

}
