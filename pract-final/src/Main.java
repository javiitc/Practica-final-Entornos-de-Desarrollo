import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Al ejecutar el programa se indicará el menú inicial con los 5 programas que se pueden ejecutar, el usuario elegirá cual necesita realizar.//
        System.out.println("Seleccione el programa a ejecutar:");
        System.out.println("1. Calculadora básica");
        System.out.println("2. Clasificador de numeros");
        System.out.println("3. Validador de contraseñas");
        System.out.println("4. Generador de numeros aleatorios");
        System.out.println("5. Contador de Palabras y caracteres");

        int seleccion = sc.nextInt(); //Aquí se selecciona con un numero el programa a ejecutar.//

        while (seleccion < 1 || seleccion > 5){ //Este bucle está para evitar que se pueda seleccionar una opción que no está en el menú de programas//
            System.out.println("Seleccion no valida, intentelo de nuevo");
            seleccion = sc.nextInt(); //Te pide volver a seleccionar y hasta que no sea una opción válida, el bucle se repetirá//
            if (seleccion == 1 || seleccion == 2 || seleccion == 3 || seleccion == 4 || seleccion == 5) {
                break;
            }
        }
        //Según el numero elegido se ejecutara uno de los programas//
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

    public static void calculadora() { //Al seleccionar 1, se ejecutará el programa de la calculadora//
        Scanner sc = new Scanner(System.in);

        while (true) { //Está dentro de un bucle para que así se puedan realizar todas las operaciones que se requieran sin necesidad de ejecutarlo nuevamente cada que se finalice una operacion//
            System.out.println("Introduzca la operación a realizar:");
            double num1 = sc.nextDouble(); //Usamos doubles para que la calculadora pueda aceptar numeros decimales y no solo enteros
            String operacion = sc.next();
            double num2 = sc.nextDouble();
            switch (operacion) { //Con los switch ponemos las 4 operaciones básicas//
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
        //Al insertar el numero, con solo el resultado de la operacion (el residuo de la division entre 2) se sabrá si es par o impar
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
        //Todas las siguientes variables serán para validar que tan fuerte es la contraseña//
        char ch;
        String password = sc.nextLine();
        int caracteres = password.length();
        boolean mayuscula = false;
        boolean minuscula = false;
        boolean num = false;

            if (caracteres < 8) { //Directamente si la contraseña no tiene minimo 8 caracteres, el programa no la aceptará//
                System.out.println("Contraseña no valida, tiene que tener minimo 8 caracteres");
            }

            for (int i = 0; i < caracteres; i++){ //A partir de este bloque de codigo, que se utiliza para validar la mayuscula en este caso, el resto se simplifica al utilizarse el mismo metodo para validar.
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

            if (!minuscula) { //Validación de minuscula
                System.out.println("Contraseña debil. Recomendamos minimo una minuscula");
            }

            for (int i = 0; i < caracteres; i++){
                ch = password.charAt(i);
                if (ch >= '0' && ch <= '9') {
                    num = true;
                    break;
                }
            }

            if (!num) { //Validacion numero
                System.out.println("Contraseña debil. Recomendamos minimo un numero");
            }


        if (mayuscula && minuscula && num){ //Si todos los boolean son true, la contraseña será fuerte
            System.out.println("Contraseña fuerte.");
        }

    }

    public static void numeroRandom() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Introduzca un rango para generar un numero al azar.");

        int min = sc.nextInt();
        int max = sc.nextInt();

        int numAleatorio = random.nextInt(min, max); //Despues de introducir los dos numeros, primero el minimo y luego el maximo, el programa hará un print de un numeor al azar entre los dos numeros introducidos

        System.out.println(numAleatorio);

    }

    public static void contadorPalabras() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una frase (o palabra):");

        String texto = sc.nextLine();
        int numCaracteres = texto.length(); //Despues de introducir el texto, con el metodo length el programa calcula cuantos caracteres (espacios incluidos) hay en la frase.

        String[] palabras = texto.split(" ");
        int numPalabras = palabras.length; //Para las palabras, habia que utilizar el metodo split, con " " para que asi contase solo hasta un espacio la palabra, y luego el metodo length para que las contabilize.

        System.out.println("Numero de caracteres:" + numCaracteres);
        System.out.println("Numero de palabras: " + numPalabras);
    }
}


