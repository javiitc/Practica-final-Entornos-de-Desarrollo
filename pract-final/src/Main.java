import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione el programa a ejecutar:");
        System.out.println("1. Calculadora básica");
        System.out.println("2. Clasificador de numeros");
        System.out.println("3. Validador de contraseñas");
        System.out.println("4. Generador de numeros aleatorios");
        System.out.println("5. Contador de Palabras y caracteres");

        int seleccion = sc.nextInt();

        while (seleccion < 1 || seleccion > 5){
            System.out.println("Seleccion no valida, intentelo de nuevo");
            seleccion = sc.nextInt();
            if (seleccion == 1 || seleccion == 2 || seleccion == 3 || seleccion == 4 || seleccion == 5) {
                break;
            }
        }

        if (seleccion == 1) {
            calculadora();
        } else if (seleccion == 2) {
            clasificador();
        } else if (seleccion == 3) {
            validadorCont();
        } else if (seleccion == 4) {
            numeroRandom();
        } else {
            contadorPalabras();
        }

    }

    public static void calculadora() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Introduzca la operación a realizar:");
            double num1 = sc.nextDouble();
            String operacion = sc.next();
            double num2 = sc.nextDouble();
            switch (operacion) {
                case "+":
                    System.out.println(num1 + num2);
                    break;
                case "-":
                    System.out.println(num1 - num2);
                    break;
                case "*":
                    System.out.println(num1 * num2);
                    break;
                case "/":
                    System.out.println(num1 / num2);
                    break;
            }
        }
    }

    public static void clasificador() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte un numero");

        int num1 = sc.nextInt();
        int operacion = num1 % 2;

        if (operacion == 0 && num1 >= 0) {
            System.out.println("El numero " + num1 + " es par");
            System.out.println("El numero es positivo");
        } else if (operacion != 0 && num1 >= 0){
            System.out.println("El numero " + num1 + " es impar");
            System.out.println("El numero es positivo");
        } else if (operacion == 0) {
            System.out.println("El numero " + num1 + " es par");
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero " + num1 + " es impar");
            System.out.println("El numero es negativo");
        }

    }

    public static void validadorCont() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca contraseña:");

        char ch;
        String password = sc.nextLine();
        int caracteres = password.length();
        boolean mayuscula = false;
        boolean minuscula = false;
        boolean num = false;

            if (caracteres < 8) {
                System.out.println("Contraseña no valida, tiene que tener minimo 8 caracteres");
            }

            for (int i = 0; i < caracteres; i++){
                ch = password.charAt(i);
                if (ch >= 'A' && ch <= 'Z') {
                    mayuscula = true;
                    break;
                }
            }

            if (!mayuscula) {
                System.out.println("Contraseña debil. Recomendamos minimo una mayuscula");
            }

            for (int i = 0; i < caracteres; i++){
                ch = password.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    minuscula = true;
                    break;
                }
            }

            if (!minuscula) {
                System.out.println("Contraseña debil. Recomendamos minimo una minuscula");
            }

            for (int i = 0; i < caracteres; i++){
                ch = password.charAt(i);
                if (ch >= '0' && ch <= '9') {
                    num = true;
                    break;
                }
            }

            if (!num) {
                System.out.println("Contraseña debil. Recomendamos minimo un numero");
            }


        if (mayuscula && minuscula && num){
            System.out.println("Contraseña fuerte.");
        }

    }

    public static void numeroRandom() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Introduzca un rango para generar un numero al azar.");

        int min = sc.nextInt();
        int max = sc.nextInt();

        int numAleatorio = random.nextInt(min, max);

        System.out.println(numAleatorio);

    }

    public static void contadorPalabras() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una frase (o palabra):");

        String texto = sc.nextLine();
        int numCaracteres = texto.length();

        String[] palabras = texto.split(" ");
        int numPalabras = palabras.length;

        System.out.println("Numero de caracteres:" + numCaracteres);
        System.out.println("Numero de palabras: " + numPalabras);
    }
}


